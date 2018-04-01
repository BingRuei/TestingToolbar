package com.ray.test.testingtoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        mToolbar.setTitle("Toolbar Demo");
//        mToolbar.setNavigationIcon(R.drawable.ic_chevron_left_black_24dp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        for(int i = 0; i < 5; i++){
            menu.add(Menu.NONE, Menu.FIRST + i, Menu.NONE, "Item " + Integer.toString(i + 1));
        }
        SubMenu subMenu = menu.addSubMenu(3, Menu.FIRST, Menu.NONE, "sub item");
        for(int i = 0; i < 3; i++){
            subMenu.add(Menu.FIRST, Menu.FIRST, Menu.NONE, "Sub Item " + Integer.toString(i + 1));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getGroupId() == Menu.NONE) {
            Toast.makeText(getApplicationContext(),
                    item.getTitle(),
                    Toast.LENGTH_SHORT).show();
        } else if(item.getGroupId() == Menu.FIRST){
            Toast.makeText(getApplicationContext(),
                    item.getTitle(),
                    Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

}

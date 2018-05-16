package com.jinlong.materialdesign;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import androidx.appcompat.app.AppCompatActivity;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomAppBar bottomAppBar = findViewById(R.id.bar);
        bottomAppBar.replaceMenu(R.menu.test_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.test_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_page_1:
                Toast.makeText(this, "蛋糕", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_page_2:
                Toast.makeText(this, "博士帽", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}

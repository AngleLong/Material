package com.jinlong.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
    }

    private void initToolbar() {
        Toolbar tb = findViewById(R.id.toolBal);
        tb.setTitle("");
        setSupportActionBar(tb);
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tb.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.e("done", "onMenuItemClick: ");
                return true;
            }
        });
    }

    /**
     * 展示Chip和ChipGroup的使用
     */
    public void chip(View view) {
        Intent intent = new Intent(this, ChipActivity.class);
        startActivity(intent);
    }

    /**
     * 演示新版本的CardView
     */
    public void cardView(View view) {
        Intent intent = new Intent(this, CardViewActivity.class);
        startActivity(intent);
    }

    /**
     * 演示新版本的BottomNavigationView
     */
    public void bottomNavigationView(View view) {
        Intent intent = new Intent(this, BottomActivity.class);
        startActivity(intent);
    }
}

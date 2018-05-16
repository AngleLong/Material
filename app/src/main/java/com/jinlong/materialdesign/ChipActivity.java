package com.jinlong.materialdesign;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import androidx.appcompat.app.AppCompatActivity;

public class ChipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);

        initChip();
    }

    private void initChip() {
        Chip chip = findViewById(R.id.cat_chip_entry_chip);
        chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(ChipActivity.this, b ? "这个按钮被选择了" : "这个按钮又被抛弃了", Toast.LENGTH_SHORT).show();
            }
        });

        chip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ChipActivity.this, "取消按钮被点击了", Toast.LENGTH_SHORT).show();
            }
        });


        ChipGroup chipGroup = findViewById(R.id.cg);
        for (int i = 0; i < 10; i++) {
            Chip tabChip = new Chip(this);
            if (i % 2 == 0) {
                tabChip.setChipText("这是一个长标签" + (i + 1));
            } else {
                tabChip.setChipText("标签0" + (i + 1));
            }
            chipGroup.addView(tabChip);
        }
    }
}

package com.donque.machinehomework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class MachineHomeworkMain22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.machinehomeworkmain2);

        List m = new LinkedList();

        Intent intent = getIntent();
        String burger = intent.getStringExtra("burger");
        String add = intent.getStringExtra("pic");
        String add1 = intent.getStringExtra("che");

        m.add(burger);
        m.add(add);
        m.add(add1);
        TextUtils.join("",m);

        TextView tv = new TextView(this);
        tv.setTextSize(40);
        tv.setText(m.toString().replace(",","").replace("[","").replace("]","").replace("null",""));

        setContentView(tv);
    }
}

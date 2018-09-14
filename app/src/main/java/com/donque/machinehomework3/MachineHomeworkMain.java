package com.donque.machinehomework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MachineHomeworkMain extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_homework_main);
        intent = new Intent(MachineHomeworkMain.this, MachineHomeworkMain.class);
        RadioGroup rg = findViewById(R.id.Types);
        final RadioButton chick = (RadioButton)findViewById(R.id.RBchicken);
        final RadioButton beef = (RadioButton)findViewById(R.id.RBbeef);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.RBchicken)
                {
                    intent.putExtra("burger", "Chicken");
                }
                else if(checkedId == R.id.RBbeef)
                {
                    intent.putExtra("burger","Beef");
                }
            }
        });

        ImageButton imgbtn = findViewById(R.id.add);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });
    }
    public void onCheckedBox(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();

        switch (view.getId())
        {
            case R.id.Check_pickles:if (checked){
                intent.putExtra("pic","Pickles");
            }else {
                intent.removeExtra("pic");
            }break;
            case R.id.Check_cheese:if(checked){
                intent.putExtra("che", "Cheese");
            }else {
                intent.removeExtra("che");
            }break;
            case R.id.Check_mustard:if(checked){
                intent.putExtra("mus", "Mustard");
            }else {
                intent.removeExtra("mus");
            }break;
        }
    }
}
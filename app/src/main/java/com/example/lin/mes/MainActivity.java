package com.example.lin.mes;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity {

    private TextView AutoTime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initView();
        initData();


    }

    public void initView() {
        AutoTime = (TextView)findViewById(R.id.system_AutoTime);


    }

    @SuppressLint("SetTextI18n")
    private void initData() {
        //设置日期格式
        @SuppressLint("SimpleDateFormat") SimpleDateFormat time  = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //设置日期
        Date date = new Date(System.currentTimeMillis());
        AutoTime.setText(time.format(date));


        }
}



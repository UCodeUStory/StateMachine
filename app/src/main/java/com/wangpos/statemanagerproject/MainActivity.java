package com.wangpos.statemanagerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecordService service = new RecordService();

        service.pasue();
        service.pasue();
        service.pasue();
        service.start();
        service.pasue();

        service.continueRecord();
        service.pasue();
        service.pasue();
        service.pasue();

        TextView textView =  (TextView)findViewById(R.id.tvInfo);
        textView.setText("I/info    (15376): 准备录音\n" +
                "I/info    (15376): 开始录音\n" +
                "I/info    (15376): 准备暂停\n" +
                "I/info    (15376): 已经暂停\n" +
                "I/info    (15376): 准备继续录制\n" +
                "I/info    (15376): 开始录音\n" +
                "I/info    (15376): 准备暂停\n" +
                "I/info    (15376): 已经暂停\n");
    }





}

package com.wangpos.statemanagerproject;


import android.util.Log;

/**
 * Created by qiyue on 2017/12/5.
 */

public class Recording extends State<EnumState> {

    @Override
    public void handle(StateManager sm) {
        Log.i("info","开始录音");
    }

    @Override
    public EnumState getValue() {
        return EnumState.RECORDING;
    }
}
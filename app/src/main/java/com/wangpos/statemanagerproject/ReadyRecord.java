package com.wangpos.statemanagerproject;


import android.util.Log;

/**
 * Created by qiyue on 2017/12/5.
 */

public class ReadyRecord extends State<EnumState> {

    @Override
    public void handle(StateManager sm) {
        /**
         * 处理业务
         */
        Log.i("info","准备录音");
        sm.setState(new Recording());
    }


    @Override
    public EnumState getValue() {
        return EnumState.READY_RECORD;
    }
}
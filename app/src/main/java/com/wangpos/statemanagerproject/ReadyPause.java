package com.wangpos.statemanagerproject;


import android.util.Log;

/**
 * Created by qiyue on 2017/12/5.
 */

public class ReadyPause extends State<EnumState> {
    @Override
    public void handle(StateManager sm) {

        Log.i("info","准备暂停");

        sm.setState(new Pause());
    }

    @Override
    public EnumState getValue() {
        return EnumState.READY_PAUSE;
    }
}

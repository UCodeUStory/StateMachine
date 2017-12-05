package com.wangpos.statemanagerproject;


import android.util.Log;

/**
 * Created by qiyue on 2017/12/5.
 */

public class ReadyContinue extends State<EnumState> {

    @Override
    public void handle(StateManager sm) {

        Log.i("info","准备继续录制");

        sm.setState(new Recording());
    }

    @Override
    public EnumState getValue() {
        return EnumState.READY_CONTINUE;
    }
}

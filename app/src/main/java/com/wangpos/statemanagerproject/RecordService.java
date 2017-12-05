package com.wangpos.statemanagerproject;

/**
 * Created by qiyue on 2017/12/5.
 */

public class RecordService implements RecordInterface {

    private StateManager sm;

    public RecordService() {
        this.sm = StateManager.getInstance(new IdleState());
    }

    @Override
    public void start() {
        if (sm.isState(EnumState.IDLE)) {
            sm.setState(new ReadyRecord());
        }
    }

    @Override
    public void pasue() {
        if (sm.isState(EnumState.RECORDING)){
            sm.setState(new ReadyPause());
        }
    }

    @Override
    public void continueRecord() {
        if (sm.isState(EnumState.PAUSED)){
            sm.setState(new ReadyContinue() );
        }
    }

    @Override
    public void save() {

    }
}

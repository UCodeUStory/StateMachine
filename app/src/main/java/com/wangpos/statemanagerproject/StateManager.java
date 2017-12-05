package com.wangpos.statemanagerproject;

/**
 * Created by qiyue on 2017/12/5.
 */

public class StateManager{

    private State state;

    private static StateManager instance;

    private StateManager(State state){
        this.state = state;
    }

    public static StateManager getInstance(State state){
        if (instance == null) {
            return new StateManager(state);
        }else{
            return instance;
        }
    }


    public synchronized void setState(State state) {
        this.state = state;
        this.state.handle(this);
    }

    /**
     * 状态判断
     * @param enumState
     * @return
     */

    public synchronized boolean isState(EnumState enumState) {
        return this.state.getValue() == enumState;
    }


}
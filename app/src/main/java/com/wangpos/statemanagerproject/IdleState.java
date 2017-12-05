package com.wangpos.statemanagerproject;


/**
 * Created by qiyue on 2017/12/5.
 */

public class IdleState extends State<EnumState> {

    @Override
    public void handle(StateManager sm) {

        /**
         * 处理业务
         */
        sm.setState(new ReadyRecord());
    }



    @Override
    public EnumState getValue() {
        return EnumState.IDLE;
    }
}
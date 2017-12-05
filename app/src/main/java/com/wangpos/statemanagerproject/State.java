package com.wangpos.statemanagerproject;

/**
 * Created by qiyue on 2017/12/5.
 */

/**
 * value  -》Sate -- 》SateManager--》
 */

abstract class State<T> {

    public abstract void handle(StateManager sm);

    public abstract T getValue();

}
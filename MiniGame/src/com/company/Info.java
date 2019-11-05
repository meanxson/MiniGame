package com.company;

public abstract class Info {
    protected String name;
    protected int HP;
    protected int POWER;


    Info(String name){
        this.name = name;
        initHealthPoint();
        initPowerPoint();

    }

     abstract protected void initPowerPoint();

     abstract protected void initHealthPoint();


}

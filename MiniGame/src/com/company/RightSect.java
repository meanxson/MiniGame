package com.company;

public class RightSect extends Info {

    RightSect(String name) {
        super(name);
    }

    @Override
    protected void initPowerPoint() {
        this.HP = 100;
    }

    @Override
    protected void initHealthPoint() {
        this.POWER = 50;
    }
}

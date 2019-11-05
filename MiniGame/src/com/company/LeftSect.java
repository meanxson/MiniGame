package com.company;

public class LeftSect extends Info {

    LeftSect(String name) {
        super(name);
    }

    @Override
    protected void initPowerPoint() {
        this.HP = 100;

    }

    @Override
    protected void initHealthPoint() {
        this.POWER = 25;

    }
}

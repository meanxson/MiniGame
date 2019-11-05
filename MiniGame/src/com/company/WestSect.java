package com.company;

public class WestSect extends Info {

    WestSect(String name) {
        super(name);
    }

    @Override
    protected void initPowerPoint() {
        this.HP = 100;

    }

    @Override
    protected void initHealthPoint() {
        this.POWER = 40;

    }
}

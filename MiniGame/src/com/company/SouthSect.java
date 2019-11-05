package com.company;

public class SouthSect extends  Info {

    SouthSect(String name) {
        super(name);
    }

    @Override
    protected void initPowerPoint() {
        this.HP = 100;

    }

    @Override
    protected void initHealthPoint() {
        this.POWER = 30;

    }
}

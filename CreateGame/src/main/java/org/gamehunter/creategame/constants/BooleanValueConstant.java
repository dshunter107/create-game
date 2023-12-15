package org.gamehunter.creategame.constants;

public enum BooleanValueConstant {
    ZERO(0),
    ONE(1),
    FALSE(0),
    TRUE(1);

    public int value;

    BooleanValueConstant(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}

package org.gamehunter.creategame.objects.upgrades.executions.calculations;

public class Multiply implements Calculation {

    @Override
    public Double calculate(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

}

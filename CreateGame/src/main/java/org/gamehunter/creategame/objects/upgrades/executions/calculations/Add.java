package org.gamehunter.creategame.objects.upgrades.executions.calculations;

public class Add implements Calculation {

    @Override
    public Double calculate(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

}

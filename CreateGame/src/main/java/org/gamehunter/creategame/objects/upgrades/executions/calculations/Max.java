package org.gamehunter.creategame.objects.upgrades.executions.calculations;

public class Max implements Calculation {

    @Override
    public Double calculate(Double firstNumber, Double secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

}

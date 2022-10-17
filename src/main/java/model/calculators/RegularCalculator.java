package model.calculators;

public class RegularCalculator {

    private Double firstNumber;
    private Double secondNumber;

    public RegularCalculator() {
    }

    public RegularCalculator(Double firstNumber, Double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Double sum(RegularCalculator regularCalculator) {
        double result = regularCalculator.firstNumber + regularCalculator.secondNumber;
        return result;
    }


    public Double subtraction(RegularCalculator regularCalculator) {
        return regularCalculator.getFirstNumber() - regularCalculator.getSecondNumber();
    }
    @Override
    public String toString() {
        return "RegularCalculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public Double division(RegularCalculator regularCalculator) {
        return regularCalculator.getFirstNumber() / regularCalculator.getSecondNumber();
    }

    public Double multiply(RegularCalculator regularCalculator) {
        return regularCalculator.getFirstNumber() * regularCalculator.getSecondNumber();
    }

    public Double power(RegularCalculator regularCalculator) {
        double pow = Math.pow(regularCalculator.getFirstNumber(), regularCalculator.getSecondNumber());
        return pow;
    }
}

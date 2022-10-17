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

    public Double sum() {
        double result = this.firstNumber + this.secondNumber;
        return result;
    }


    public Double subtraction() {
        return this.firstNumber - this.secondNumber;
    }
    @Override
    public String toString() {
        return "RegularCalculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }

    public Double division() {
        return this.firstNumber / this.secondNumber;
    }

    public Double multiply() {
        return this.firstNumber * this.secondNumber;
    }

    public Double power() {
        double pow = Math.pow(this.firstNumber, this.secondNumber);
        return pow;
    }
}

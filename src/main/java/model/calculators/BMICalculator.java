package model.calculators;

public class BMICalculator {

    public BMICalculator() {
    }


    public Double calculateBMI(Double weight, Double height) {
        double result = weight / (Math.pow(height, 2));
        return result;
    }


}

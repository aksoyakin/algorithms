package bmi;


public class BodyMassIndex {
    private double height;
    private double weight;

    public BodyMassIndex (){

    }

    private double checkHeight(double height){
        if(height > 3)
            return height /= 100;
        else
            return height;
    }

    public double calculateBmi(double height, double weight){
        height = checkHeight(height);
        return weight / (height * height);
    }

    public String printWeightRange(double bodyMassIndex){
        if(bodyMassIndex >= 30)
            return "Obese";
        else if(bodyMassIndex >= 25)
            return "Overweight";
        else if(bodyMassIndex >= 18.5)
            return "Normal";
        else
            return "Underweight";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

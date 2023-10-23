public class Car {

    public Car(String chasis_number, String engine_number, String regNumber, String color) {
        this.chasis_number = chasis_number;
        this.engine_number = engine_number;
        this.regNumber = regNumber;
        this.color = color;
    }

    public String getChasis_number() {
        return chasis_number;
    }

    public void setChasis_number(String chasis_number) {
        this.chasis_number = chasis_number;
    }

    //Properties
    private String chasis_number;
    private String engine_number;
    private String regNumber;
    private String color;

    public String getEngine_number() {
        return engine_number;
    }

    public void setEngine_number(String engine_number) {
        this.engine_number = engine_number;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Functionalities
    public String brakingSystem() {
        return "This is the braking system";
    }

    public String acSystem() {
        return "This is the braking system";
    }

    public String coolingSystem() {
        return "This is the braking system";
    }

}

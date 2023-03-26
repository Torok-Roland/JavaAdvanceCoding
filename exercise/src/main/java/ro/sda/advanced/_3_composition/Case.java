package ro.sda.advanced._3_composition;
//* Create a class Case containing the following instance variables: model, manufacturer and powerSupply (all strings)
// * and dimensions which is of type Dimension
// * The class should have:
// * - a constructor with parameters
// * - getters for all the fields
// * - a method pressPowerButton() - which will only print "Power button pressed"

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed...");
    }
}

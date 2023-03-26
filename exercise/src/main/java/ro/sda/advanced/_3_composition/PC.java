package ro.sda.advanced._3_composition;
// *  Create a class PC which will have a case of type Case, a monitor of type Monitor and a motherboard of type Motherboard
// *  The class should have:
// *  - a constructor
// *  - a method powerUp() - which will call the method for powering up from the Case class
// *  - a method drawLogo() - which will call the method drawPixel from Monitor class

public class PC {

    private Case theCase;
    private Monitor monitor;


    public PC( Monitor monitor, Case theCase) {
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        this.drawLogo();
    }

    public void drawLogo(){
        monitor.drawPixelAt(1240, 1080,"RGB");
    }

}

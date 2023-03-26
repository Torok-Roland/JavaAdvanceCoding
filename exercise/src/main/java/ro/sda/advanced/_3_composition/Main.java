package ro.sda.advanced._3_composition;
// composition nu este o proprietate OOP
// Prop. OOP : inheritance, polymorphism, abstraction, encapsulation.

/*
 *
 * The following exercise is for understanding composition, we will create a few classes which represents different
 * components of a PC.
 *
 */
public class Main {
    public static void main(String[] args) {
        Case case1 = new Case("220OP", "HP", "230", new Dimensions(10, 20, 30));

        Monitor monitor1 = new Monitor("32inch", "Dell", 27, new Resolution(10, 10));

        PC pc1 = new PC(monitor1, case1);
        pc1.powerUp();


        PC pc2 = new PC(
                new Monitor("3x4", "Lenovo", 32, new Resolution(10, 20)),
                new Case("haha", "Dell", "230", new Dimensions(10, 20, 30))
        );

        pc2.powerUp();

    }
}


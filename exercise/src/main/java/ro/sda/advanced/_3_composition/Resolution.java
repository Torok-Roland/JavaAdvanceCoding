package ro.sda.advanced._3_composition;
// * Create a class resolution which will have only 2 fields: width and height (both are int)
// * The class should have:
// * - a constructor
// * - getters for both fields
public class Resolution {

    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

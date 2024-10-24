// TwoDShape class that inherits Shape
class TwoDShape extends Shape {

    // Constructor
    public TwoDShape(double x, double y) {
        super(x, y);
    }

    // Method to calculate area (to be overridden)
    public double calculateArea() {
        throw new UnsupportedOperationException("Area calculation not supported for TwoDShape.");
    }

    // Method to calculate perimeter (to be overridden)
    public double calculatePerimeter() {
        throw new UnsupportedOperationException("Perimeter calculation not supported for TwoDShape.");
    }
}

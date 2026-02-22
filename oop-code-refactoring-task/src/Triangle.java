public class Triangle extends TwoDimensionalFigure{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;

    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + base);
    }
}

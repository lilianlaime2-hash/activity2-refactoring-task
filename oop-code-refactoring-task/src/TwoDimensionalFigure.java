public abstract class TwoDimensionalFigure extends Figure {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public void printResults() {
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
    }
}

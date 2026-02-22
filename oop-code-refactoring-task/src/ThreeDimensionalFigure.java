public abstract class ThreeDimensionalFigure extends Figure {

    public abstract double calculateArea();

    public abstract double calculateVolume();

    @Override
    public void printResults() {
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Volume: %.2f%n", calculateVolume());
    }
}

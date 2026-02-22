
import java.util.Scanner;

public class Main {
    private static final int RECTANGLE = 1;
    private static final int CIRCLE = 2;
    private static final int TRIANGLE = 3;
    private static final int SQUARE = 4;
    private static final int SPHERE = 5;
    private static final int CUBE = 6;
    private static final int EXIT = 7;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("----------Calculate area of shapes-----------");
        while (option != EXIT) {
            printMenu();
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            Figure figure = null;

            switch(option){
                case RECTANGLE:
                    double width = readDouble(sc, "Insert width: ");
                    double height = readDouble(sc, "Insert side height: ");
                    figure = new Rectangle(width, height);
                    break;

                case CIRCLE:
                    double radius = readDouble(sc, "Insert radius: ");
                    figure = new Circle(radius);
                    break;

                case TRIANGLE:
                    double triangleHeight = readDouble(sc, "Insert height: ");
                    double base = readDouble(sc, "Insert base: ");
                    figure = new Triangle(triangleHeight, base);
                    break;

                case SQUARE:
                    double side = readDouble(sc, "Insert side: ");
                    figure = new Square(side);
                    break;

                case SPHERE:
                    double sphereRadius = readDouble(sc, "Insert radius: ");
                    figure = new Sphere(sphereRadius);
                    break;

                case CUBE:
                    double cubeSide = readDouble(sc, "Insert side: ");
                    figure = new Cube(cubeSide);
                    break;

                default:
                    System.out.println("Invalid option. Select a valid number\n");
                    break;
            }


            if (figure != null) {
                figure.printResults();
            }
        }
    }

    private static void printMenu(){
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.println("5. Sphere");
        System.out.println("6. Cube");
        System.out.println("7. Exit");
    }

    private static double readDouble(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            try {
                String input = sc.nextLine().trim().replace(",", ".");
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
    }


}

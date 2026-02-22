import java.text.MessageFormat;
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

            switch(option){
                case RECTANGLE:
                    handleRectangle(sc);
                    break;
                case CIRCLE:
                    handleCircle(sc);
                    break;
                case TRIANGLE:
                    handleTriangle(sc);
                    break;
                case SQUARE:
                    handleSquare(sc);
                    break;
                case SPHERE:
                    handleSphere(sc);
                    break;
                case CUBE:
                    handleCube(sc);
                    break;
                default:
                    break;
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

    private static void handleRectangle (Scanner sc) {
            System.out.print("Insert side width: ");
            int width = Integer.parseInt(sc.nextLine());
            System.out.print("Insert side height: ");
            int height = Integer.parseInt(sc.nextLine());
            int area = width * height;
            int perimeter = 2 * (width + height);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
    }

    private static void handleCircle (Scanner sc) {
        System.out.println("Insert radius:");
        int radius = 0;
        radius = Integer.parseInt(sc.nextLine());
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter: " + perimeter);
    }

    private static void handleTriangle(Scanner sc){
        System.out.println("Insert height");
        int height = Integer.parseInt(sc.nextLine());
        System.out.print("Insert base");
        int base = Integer.parseInt(sc.nextLine());
        double area = 0.5 * base * height;
        System.out.println("Area:" + area);
        int perimeter = 2 * (height + base);
        System.out.println(MessageFormat.format("Perimeter:{0}", perimeter));
    }
    private static void handleSquare(Scanner sc) {
        System.out.println("Insert side");
        int side = Integer.parseInt(sc.nextLine());
        int area = side * side;
        System.out.println("Area: " + area);
        int perimeter = 4 * side;
        System.out.println("Perimeter: " + perimeter);
    }

    private static void handleSphere(Scanner sc) {
        System.out.print("Insert radius: ");
        int radius = Integer.parseInt(sc.nextLine());
        double area = (4 *  Math.PI * radius * radius);
        System.out.println("Area: " + area);
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume: " + volume);
    }

    private static void handleCube(Scanner sc){
        System.out.println("Insert side ");
        int side = 0;
        side = Integer.parseInt(sc.nextLine());
        int area = 6 * side * side;
        int volume = side * side * side;
        System.out.println("Area: " + area);
        System.out.println("volume: " + volume);
    }
        

}

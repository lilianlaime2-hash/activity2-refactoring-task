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
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Cube");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch(option){
                case RECTANGLE: {
                    int width = 0,height = 0;

                    System.out.print("Insert side width: ");
                    width = Integer.parseInt(sc.nextLine());
                    System.out.print("Insert side height: ");
                    height = Integer.parseInt(sc.nextLine());
                    int area = width * height;
                    int perimeter = 2 * width * height;
                    System.out.println("Area: " + area);
                    System.out.println("Perimeter: " + perimeter);
                    }
                    break;
                case CIRCLE: {
                    System.out.println("Insert radius:");
                    int radius = 0;
                    radius = Integer.parseInt(sc.nextLine());
                    int area = (int) (4 * Math.PI * Math.pow(radius, 2));
                    System.out.println("Area: " + area);
                    int p = (int) (2 * Math.PI * radius);
                    System.out.println("Perimeter: " + p);
                    }
                    break;
                case TRIANGLE: {
                    System.out.println("Insert height");
                    int height = 0, base = 0;
                    height = Integer.parseInt(sc.nextLine());
                    System.out.print("Insert base");
                    base = Integer.parseInt(sc.nextLine());
                    int area = (int) (0.5 * (Math.sqrt((height * height) - (base * base) / 4 )* base));
                    System.out.println("Area:" + area);
                    int perimeter = 2 * (height + base);
                    System.out.println(MessageFormat.format("Perimeter:{0}", perimeter));
                    }
                    break;
                case SQUARE:{
                    System.out.println("Insert side");
                    int s = 0;
                    s = Integer.parseInt(sc.nextLine());
                    int area = s * s;
                    System.out.println("Area: " + area);
                    int p = s + s +s + s;
                    System.out.println("Perimeter: " + p);
                    }
                    break;
                case SPHERE:{
                    System.out.print("Insert radius: ");
                    int r = 0;
                    r = Integer.parseInt(sc.nextLine());
                    int area = (int)(4 *  Math.PI * r * r);
                    System.out.println("Area: " + area);
                    int p = (int)(2 * Math.PI * r);
                    System.out.println("Perimeter: " + p);
                    }
                    break;
                case CUBE:{
                    System.out.println("Insert side ");
                    int s = 0;
                    s = Integer.parseInt(sc.nextLine());
                    int area = s * s + s * s + s * s + s * s + s * s + s * s;
                    int perimeter = s + s + s + s;
                    System.out.println("Area: " + area);
                    System.out.println("Perimeter: " + perimeter);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}

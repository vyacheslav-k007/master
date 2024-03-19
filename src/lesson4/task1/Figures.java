package lesson4.task1;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Right triangle");
        System.out.println("3. Reverse right triangle");
        System.out.println("4. Isosceles triangle");
        System.out.println("Enter the shape number: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the height of the rectangle:");
                int height = scanner.nextInt();
                System.out.println("Enter the width of the rectangle:");
                int width = scanner.nextInt();
                drawRectangle(height, width);
                break;
            case 2:
                System.out.println("Enter the height of the right triangle:");
                int triangleHeight = scanner.nextInt();
                drawRightTriangle(triangleHeight);
                break;
            case 3:
                System.out.println("Enter the height of the reverse right triangle:");
                int triangleHeight2 = scanner.nextInt();
                drawInvertedRightTriangle(triangleHeight2);
                break;
            case 4:
                System.out.println("Enter the height of the isosceles triangle:");
                int triangleHeight3 = scanner.nextInt();
                drawIsoscelesTriangle(triangleHeight3);
                break;
            default:
                System.out.println("Wrong choice!");



        }

        do {
            System.out.println("Do you want to display another figure? (yes/no)");
            String answer = scanner.next();
            if (answer.equals("no")) {
                System.out.println("Exit");
                break;
            } else if (!answer.equals("yes")) {
                System.out.println("Wrong choice!");
            } else {
                main(null);
            }
        } while (true);

    }

        public static void drawRectangle(int enteredHeight, int enteredWidth) {
            for (int i = 0; i < enteredHeight; i++) {
                for (int j = 0; j < enteredWidth; j++) {
                    System.out.print("*");
                }
               System.out.println();
            }
        }

        public static void drawRightTriangle (int triangleHeight) {
            for (int i = 1; i <= triangleHeight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void drawInvertedRightTriangle(int triangleHeight2) {
        for (int i = 0; i < triangleHeight2; i++) {
            for (int j = 1; j <= triangleHeight2-i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle(int triangleHeight3) {
        for (int i = 1; i <= triangleHeight3; i++) {
            for (int j = 1; j <= triangleHeight3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


}



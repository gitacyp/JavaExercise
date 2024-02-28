package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

//Define interface
interface Shape { //bentuk polymorphism
    void draw (int height, int width, int side, int length);
}

class drawTriangle implements Shape {
    @Override
    public void draw (int height, int width, int side, int length){
        for (int i = 1; i <= height; i++) {
            // Print spaces to center the triangle
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars for the triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}

class drawSquare implements Shape {
    @Override
    public void draw (int height, int width, int side, int length){
        for (int i = 0; i < side; i++) {
            // Print the column
            for (int j = 0; j < side; j++) {
                System.out.print("*  ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}

class drawRectangle implements Shape{
    // Print the length
    @Override
    public void draw (int height, int width, int side, int length){
        for (int i = 0; i < length; i++) {
            // Print the width
            for (int j = 0; j < width; j++) {
                System.out.print("*  ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}

//main class
public class ShapeDrawerPolyMorph {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Pick the shape you want to draw : ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit\n");
    }

    public void drawShape(int choice){
        try {
            switch (choice){
                case 1:
                    System.out.println("Input Triangle height : ");
                    int height = scanner.nextInt();
                    new drawTriangle().draw(height,1,1,1); //Fungsi untuk menggambar triangle
                    break;
                case 2:
                    System.out.println("Input Square side: ");
                    int side = scanner.nextInt();
                    new drawSquare().draw(side,1,1,1); //Fungsi untuk menggambar Square
                    break;
                case 3:
                    System.out.println("Input Rectangle length: ");
                    int length = scanner.nextInt();
                    System.out.println("Input Rectangle width: ");
                    int width = scanner.nextInt();
                    new drawRectangle().draw(length,width,1,1); //Fungsi untuk menggambar Rectangle
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }catch (InputMismatchException ime){
            System.out.println("Please enter a valid integer.");
            scanner.next(); //to consume invalid token
        }

    }

    public void run(){
        //Loop untuk terus menampilkan menu
        while(true){
            displayMenu();
            System.out.println("Your pick : ");
            try {
                int choice = scanner.nextInt();
                drawShape(choice);
                System.out.println();
            }catch (InputMismatchException ime){
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }
    }
    public static void main(String[] args){
        //Program untuk gambar ASCII shape
        //Runner
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();
    }
}

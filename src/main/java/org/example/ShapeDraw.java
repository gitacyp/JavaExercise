package org.example;
import java.util.Scanner;
public class ShapeDraw {
    Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("Pick the shape you want to draw : ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit\n");
    }

    public void drawTriangle(int height){
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

    public void drawSquare(int side) {
        for (int i = 0; i < side; i++) {
            // Print the column
            for (int j = 0; j < side; j++) {
                System.out.print("*  ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public void drawRectangle(int length, int width){
        // Print the length
        for (int i = 0; i < length; i++) {
            // Print the width
            for (int j = 0; j < width; j++) {
                System.out.print("*  ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public void drawShape(int choice){
        switch (choice){
            case 1:
                System.out.println("Input Triangle height : ");
                int height = scanner.nextInt();
                drawTriangle(height); //Fungsi untuk menggambar triangle
                break;
            case 2:
                System.out.println("Input Square side: ");
                int height2 = scanner.nextInt();
                drawSquare(height2); //Fungsi untuk menggambar Square
                break;
            case 3:
                System.out.println("Input Rectangle length: ");
                int length = scanner.nextInt();
                System.out.println("Input Rectangle width: ");
                int width = scanner.nextInt();
                drawRectangle(length,width); //Fungsi untuk menggambar Rectangle
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public void run(){
        //Loop untuk terus menampilkan menu
        while(true){
            displayMenu();
            System.out.println("Your pick : ");
            int choice = scanner.nextInt();
            drawShape(choice);
        }
    }
    public static void main(String[] args){
        //Program untuk gambar ASCII shape
        //Runner
        ShapeDraw drawer = new ShapeDraw();
        drawer.run();
    }
}

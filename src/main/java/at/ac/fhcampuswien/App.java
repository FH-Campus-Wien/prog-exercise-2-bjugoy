package at.ac.fhcampuswien;

import java.util.Scanner;
import java.util.Formatter;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        //String.format() oder System.out.printf() für 2 Kommastellen

        int count = 1;
        double input;
        double largest = 0;

        do {

            System.out.print("Number " + count + ": ");
            input = scanner.nextDouble();

            if(input <=0 && count == 1){
                System.out.println("No number entered.");
            } else {
                count++;
            }

            if(input > largest){
                largest = input;
            }

            if(input <=0 && count > 1) {
                System.out.printf("The largest number is %.2f", largest);
                System.out.println();

            }

        } while(input >0);


    }

    //todo Task 2
    public void stairs(){

        System.out.print("n: ");
        int rows = scanner.nextInt();
        int start = 1;

        if(rows<=0){
            System.out.println("Invalid number!");
        } else {

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j <= i; j++) {
                    System.out.print(start + " ");
                    start++;
                }
                System.out.println();
            }
        }

        }

    //todo Task 3
    public void printPyramid(){

        for(int i = 1; i <=6; i++){

            for(int space = 1;space <=6 - i;space++){
                System.out.print(" ");
            }

            for(int star = 1 ;star <= 2*i-1 ;star++){
                System.out.print("*");
            }
            System.out.println();

        }

        }


    //todo Task 4
    public void printRhombus(){
        // char c = scan.next().charAt(0);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if(h%2 == 0){
            System.out.println("Invalid number!");
        } else {

            for (int i = 1; i <= h / 2 + 1; i++) {

                for (int s = 1; s <= h / 2 - i + 1; s++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= i - 1; l++) {
                    System.out.print((char) (c - i + l));
                }

                for (int r = 1; r <= i; r++) {
                    System.out.print((char) (c - r + 1));
                }


                System.out.println();

            }

            for (int i2 = 1; i2 <= h / 2; i2++) {

                for (int s2 = 1; s2 <= i2; s2++) {
                    System.out.print(" ");
                }

                for (int l2 = 1; l2 <= h / 2 - i2; l2++) {
                    System.out.print((char) (c - h / 2 + i2 + l2 - 1));
                }

                for (int r2 = 1; r2 <= h / 2 - i2 + 1; r2++) {
                    System.out.print((char) (c - r2 + 1));
                }
                System.out.println();

            }
        }
    }


    //todo Task 5
    public void marks(){

        int count = 1;
        double input;
        int ngtv = 0;
        double store = 0;

        do {

            System.out.print("Mark " + count + ": ");
            input = scanner.nextDouble();

            if(input >0 && input <6){
                store = store + input;
            }

            if (input > 5) {
                System.out.println("Invalid mark!");
            } else {
                count++;
            }

            if (input == 5){
                ngtv++;
            }

            if (input <= 0 && count > 1) {
                if(input <= 0 && count == 2){

                    double avg = store/(count);
                    System.out.printf("Average: %.2f", avg);
                    System.out.println();
                    System.out.println("Negative marks: " + ngtv);
                } else {
                    double avg = store / (count - 2);
                    System.out.printf("Average: %.2f", avg);
                    System.out.println();
                    System.out.println("Negative marks: " + ngtv);
                }

            }

        } while (input > 0);
    }

    //todo Task 6
    public void happyNumbers(){

        System.out.print("n: ");
        int n = scanner.nextInt();
        int f = 0;
        int a = 0;

        int x = n;
        int y = n;
        while(a !=1 && a !=4) {
            x = y%10;
            f = f +x*x;
            y = y/10;
            if(y == 0){
                y = f;
                f = 0;
                a = y;
            }

        }
        if (a == 1){
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
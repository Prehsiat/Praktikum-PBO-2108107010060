import java.util.Scanner;

public class Tugas21 {
    public static void main (String args[]) {
        Scanner Input = new Scanner( System.in );
        int num1;
        int num2;

        System.out.print("Masukkan angka pertama: ");
        num1 = Input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        num2 = Input.nextInt();

        System.out.println(num1 + " + "+ num2 +" = " + (num1 + num2) );
        System.out.println(num1 + " - "+ num2 +" = " + (num1 - num2) );
        System.out.println(num1 + " * "+ num2 +" = " + (num1 * num2) );
        System.out.println(num1 + " / "+ num2 +" = " + (num1 / num2) );
        System.out.println(num1 + " % "+ num2 +" = " + (num1 % num2) );
        Input.close();
    }
}

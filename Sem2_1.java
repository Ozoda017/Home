package HW_2;

import java.util.Scanner;

public class Sem2_1 {

   public static void main(String[] args) {
    float inputFloatNumber = inputFloat();
    System.out.println(inputFloatNumber);

   }
    

   public static float inputFloat(){
    Scanner console = new Scanner(System.in);
    System.out.println("Введите десятичное число: ");
    while (!console.hasNextFloat()){
        System.out.println("Это не десятичное число!");
        console.nextLine();
        }
        return console.nextFloat();

    }

}
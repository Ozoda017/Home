
package HW_2;

import java.util.Scanner;

public class Sem2_4 {

   public static void main(String[] args) throws Exception {
        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ("".equals(str)){
            throw new Exception("Введена пустая строка!");
        }
        else {
            System.out.println(str);
        }
    }
}
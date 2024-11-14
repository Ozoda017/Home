package HW_2;

public class Sem2_2 {
   public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d =2;
        if (intArray.length-1<8){
            System.out.println("Массив содержи недостаточно элементов!");
        }

        else if (d == 0) {
            System.out.println("Деление на 0!");
        }
        else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
     
     }
         
   }
     
}


package MagicalSquare7;

import java.util.*;

public class MagicalSquare {
    public static void main(String[] args) {

        Integer[][] numbers = {{2, 7, 6}, {9, 50, 1}, {4, 3, 8}};
        if (distinctNumbers(numbers) == true)
            if (magicSquare(numbers)==true){
                System.out.println("The array is a Magic Square!!!");}
             else
                System.out.println("The array is NOT a Magic Square!!!");


    }

       public static boolean distinctNumbers(Integer[][] array) {
        List arrayList = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arrayList.add(array[i][j]);
            }
        }

        Set arraySet = new HashSet(arrayList);

        if (arraySet.size() == arrayList.size())
            return true;
        return false;
    }

    public static boolean magicSquare(Integer[][] array) {

        int sumR = 0;
        int sumC = 0;
        int columnSum = 0;
        int rowSum = 0;
        int u = 0;
        int sumPrincipalDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < array.length; i++) {
            //int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (u == 0) {
                    sumR += array[i][j];
                    sumC += array[j][i];
                }
                rowSum += array[i][j];
                columnSum += array[j][i];

                if (i == j)
                    sumPrincipalDiagonal += array[i][j];

            }
            u = 1;

            if (rowSum != sumR)
                return false;
            if (sumC != columnSum)
                return false;

            if (sumC != sumR)
                return false;

            sumSecondaryDiagonal += array[i][array.length-i-1];




            rowSum = 0;
            columnSum = 0;

        }

        if (sumR != sumPrincipalDiagonal)
            return false;

        if (sumR != sumSecondaryDiagonal)
            return false;

        return true;


    }


}




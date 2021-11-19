package Zadaca;

import javax.swing.*;

public class Zadaca {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hej danas ucimo tablicu mnozenja, mnozit cemo brojve od 1 do 3 sa brojevima od 1 do 10");
        int[][] numbers = {
                {1001, 1002, 1003, 1004},
                {100, 1, 2, 3},
                {200, 2, 4, 6},
                {300, 3, 6, 9},
                {400, 4, 8, 12},
                {500, 5, 10, 15},
                {600, 6, 12, 18},
                {700, 7, 14, 21},
                {800, 8, 16, 24},
                {900, 9, 18, 27},
                {1000, 10, 20, 30}
        };
        int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj..."));
        int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj..."));
        if ((prviBroj <=3) && (drugiBroj <= 10));

            else  JOptionPane.showMessageDialog(null, "Hej nisi unio fino brojeve");
            int zbirBroja = prviBroj * drugiBroj;

        NASA: for (int  i = 0;i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int brojNiza = numbers[i][j];
                if(brojNiza == zbirBroja){

                    JOptionPane.showMessageDialog(null, "Pogledaj konzolu");
                    System.out.format("Prvi broj- %s * drugi broj- %s je = %s i nalaze se na tabeli pod brojevima %s, %s",prviBroj, drugiBroj, zbirBroja, i, j);
                    System.out.println(".");
                    System.out.println("Tablica mnozenja:");
                    System.out.println("********************");
                    System.out.println(" #    1    2    3");
                    System.out.println("********************");
                    System.out.println(" 1 *   1    2    3");
                    System.out.println(" 2 *   2    4    6");
                    System.out.println(" 3 *   3    6    9");
                    System.out.println(" 4 *   4    8    12");
                    System.out.println(" 5 *   5    10   15");
                    System.out.println(" 6 *   6    12   18");
                    System.out.println(" 7 *   7    14   21");
                    System.out.println(" 8 *   8    16   24");
                    System.out.println(" 9 *   9    18   27");
                    System.out.println(" 10*   10   20   30");
                    break NASA;
                }
            }
        }
    }
}
package lt.mindaugas.kids_calculator;

import java.util.Scanner;

public class Skaiciuokle {

    public int sudek(int a, int b){
        return a + b;
    }

    public int atimk(int a, int b){
        return a - b;
    }

    public int raskMaxReiksme(int[] skaiciai) {
        int max = 0;

        for (int skaicius : skaiciai) {
            if (skaicius > max){
                max = skaicius;
            }
        }

        return max;
    }
}

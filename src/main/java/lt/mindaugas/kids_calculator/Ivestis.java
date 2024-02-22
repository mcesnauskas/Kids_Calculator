package lt.mindaugas.kids_calculator;

import java.util.Scanner;

public class Ivestis {
    private Scanner scanner = new Scanner(System.in);

    public int iveskSkaiciu(String ivedamasSkaicius){

        int ivestasSkaicius;
        boolean arTeisingaiIvesta;

        do{
            System.out.println("Prasom ivesti %s skaiciu nuo 1 iki 9:".formatted(ivedamasSkaicius));
            ivestasSkaicius = scanner.nextInt();
            arTeisingaiIvesta = ivestasSkaicius >= 1 && ivestasSkaicius <= 9;

            if (!arTeisingaiIvesta){
                System.out.println("Iveistas blogas skaicius");
            }

        } while (!arTeisingaiIvesta);

        return ivestasSkaicius;
    }

    public int[] iveskSkaiciusPalyginimui() {
        System.out.println("Kiek skaiciu norite palyginti:");
        int masyvoDydis = iveskSkaiciu("masyvo dydi");
        int[] skaiciai = new int[masyvoDydis];

        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = iveskSkaiciu((i+1)+"o elemento reiksme");
        }

        return skaiciai;
    }
}

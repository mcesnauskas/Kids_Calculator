package lt.mindaugas.kids_calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ivestis ivestis = new Ivestis();
        Skaiciuokle skaiciuokle = new Skaiciuokle();

        System.out.println("Programa \"Kids Calculator\" aktyvuota.");
        System.out.println("Jeigu norite sudeti iveskite [1]");
        System.out.println("Jeigu norite atimti iveskite [2]");
        System.out.println("Jeigu norite palyginti skaicius iveskite [3]");
        System.out.println("Laukiu jusu ivesto skaiciaus:");

        int pasirinkimas = scanner.nextInt();
        int pirmasSkaicius = 0;
        int antrasSkaicius = 0;

        switch (pasirinkimas){
            case 1 ->{
                pirmasSkaicius = ivestis.iveskSkaiciu("PIRMO skaiciaus reiksme");
                antrasSkaicius = ivestis.iveskSkaiciu("ANTRO skaiciaus reiksme");
                System.out.println(skaiciuokle.sudek(pirmasSkaicius,antrasSkaicius));
            }
            case 2 ->{
                pirmasSkaicius = ivestis.iveskSkaiciu("PIRMO skaiciaus reiksme");
                antrasSkaicius = ivestis.iveskSkaiciu("ANTRO skaiciaus reiksme");
                System.out.println(skaiciuokle.atimk(pirmasSkaicius, antrasSkaicius));
            }
            case 3 -> {
                int[] skaiciai = ivestis.iveskSkaiciusPalyginimui();
                System.out.println("*** REZULTATAS ***");
                System.out.println("Max reiksme: " + skaiciuokle.raskMaxReiksme(skaiciai));
            }
            default -> {
                System.out.println("Tokio veiksmo nezinau");
            }
        }
    }
}

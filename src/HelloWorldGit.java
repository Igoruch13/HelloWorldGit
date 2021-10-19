import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class HelloWorldGit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chuslo = 0;
        int kilkistSprob = 0;
        do {
            try {
                System.out.println("Введіть число 10");
                chuslo = s.nextInt();
                System.out.println("Ви ввели число:" + chuslo);
            } catch (Exception catchException) {
                System.out.println("Такого робити неможна!!!");
                chuslo = 0;
            }
            kilkistSprob++;
            System.out.println("Спроба №:" + kilkistSprob);
        } while (chuslo != 10);
        System.out.println("Ну нарешті ввели число 10 з " + kilkistSprob + " спроб!!!");
    }
}
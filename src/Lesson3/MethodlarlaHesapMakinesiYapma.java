package Lesson3;

import java.util.Scanner;

public class MethodlarlaHesapMakinesiYapma {
    /*
    3-) Methodlarla bir hesap makinasi yapalim.
     */

    public static void main(String[] args) {
        hesapMakinasi();
    }

    private static void hesapMakinasi() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1. sayiyi giriniz : ");
        double sayi1 = scan.nextDouble();
        System.out.print("Lutfen 2. sayiyi giriniz : ");
        double sayi2 = scan.nextDouble();
        System.out.print("Yapmak istediginiz islemi (+,-,*,/) seklinde giriniz : ");
        char islem = scan.next().charAt(0);
        switch (islem) {
            case '+':
                System.out.println("1. ile 2. sayinin toplami : " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("1. ile 2. sayinin farki : " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("1. ile 2. sayinin carpimi : " + (sayi1 * sayi2));
                break;
            case '/': // 15 / 0  sifira bolunemez
                if (sayi2 == 0) {
                    System.out.println("Sifira bolunemez");
                } else {
                    System.out.println("1. ile 2. sayinin bolumu : " + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Yanlis giris yaptiniz tekrar deneyiniz");
                hesapMakinasi();
        }
    }
}

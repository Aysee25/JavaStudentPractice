package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SesliSessizHarf {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdıran bir method olusturun. Girdiği değer
    1 karakterden fazla ise hata mesajı göstersin ve islemi basa alsin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u
    sessiz harfler: b, c, d, f, g,  h, j, k, l, m, n, p, r, s, t, y, z
    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sesliSessizBelirtme();
    }

    public static void sesliSessizBelirtme() {
        System.out.println("harf giriniz: ");
        String kullaniciHarfGirisi = scanner.nextLine();
        ArrayList<String> sesliHarfler = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        ArrayList<String> sessizHarfler = new ArrayList<>(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "r", "s", "t", "y", "z"));

        if ( kullaniciHarfGirisi.length() == 1  ) {
            for (int i = 0; i < sessizHarfler.size(); i++) {
                if (sessizHarfler.get(i).equals(kullaniciHarfGirisi)) {
                    System.out.println(kullaniciHarfGirisi + " harfi sesiz harftir.");
                }
            }
            for (int i = 0; i <sesliHarfler.size() ; i++) {
                if (sesliHarfler.get(i).equals(kullaniciHarfGirisi)) {
                    System.out.println(kullaniciHarfGirisi + " harfi sesli harfdir.");
                }
            }
        }else {
            System.out.println("Yanlis karakter girdiniz! Basa Donunuz!");
            sesliSessizBelirtme();

        }

    }

}

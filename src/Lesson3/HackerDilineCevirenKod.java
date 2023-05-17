package Lesson3;

import java.util.Scanner;

public class HackerDilineCevirenKod {
    /*
         1-) Interwiew
         Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
         Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
          Genellikle çevirdikleri harfler şu şekilde:
         s -> 5
         a -> 4
         e -> 3
         i -> 1
         o -> 0
         OUTPUT :
          hackerDili("java ile hersey guzel")
          h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String girilenCumle = scan.nextLine();
        cevirenKod(girilenCumle);
    }

    private static void cevirenKod(String girilenCumle) {
        String arr[] = new String[girilenCumle.length()];
        for (int i = 0; i < girilenCumle.length(); i++) {
            arr[i] = girilenCumle.substring(i, i + 1); // substring ile tek tek cagirdigimiz harfleri array`in icine atadik.
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < girilenCumle.length(); i++) { // Javayi seviyoruz
            if (arr[i].contains("s")) {
                arr[i] = "5";
            }
            if (arr[i].contains("S")) {
                arr[i] = "5";
            }
            if (arr[i].contains("a")) {
                arr[i] = "4";
            }
            if (arr[i].contains("A")) {
                arr[i] = "4";
            }
            if (arr[i].contains("e")) {
                arr[i] = "3";
            }
            if (arr[i].contains("E")) {
                arr[i] = "3";
            }
            if (arr[i].contains("i")) {
                arr[i] = "1";
            }
            if (arr[i].contains("I")) {
                arr[i] = "1";
            }
            if (arr[i].contains("o")) {
                arr[i] = "0";
            }
            if (arr[i].contains("O")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }
    }
}

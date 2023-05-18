package Lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cozum {

    //   Kullanıcıdan alınan bir arraydeki elemanları isteyin
    //   Array deki tüm tekrar eden elemanları bulup,
    //   her bir elemanın kaç kez tekrar ettiğini ve arraydeki ilk görünümünün indexini
    //   ve sonraki gorunum ındexlerını
    //   ekrana yazdırın.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (arr.contains(array[i])) {
                continue;
            }

            int sayac = 1;
            List<Integer> yeniArr = new ArrayList<>();
            yeniArr.add(i);

            for (int j = i + 1; j < size; j++) {
                if (array[j] == array[i]) {
                    sayac++;
                    yeniArr.add(j);
                }
            }

            if (sayac > 1) {
                System.out.println("Eleman : " + array[i]+" Tekrar Sayısı : " + sayac);

                System.out.println("İlk Görünüm İndeksi: " +yeniArr.subList(1, yeniArr.size()) + " Son Görünüm İndeksleri: " +yeniArr.get(0));

                System.out.println();
            }

            arr.add(array[i]);
        }
    }
    }


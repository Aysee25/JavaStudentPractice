package Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Cozum1_Arrays_IlkSonGorunum_Indexsi_TekrarEtmeSayisi {

    //Kullanıcıdan bir tamsayı dizisi isteyin
    //Dizideki tüm tekrar eden elemanları bulup,
    //her bir elemanın kaç kez tekrar ettiğini ve dizideki ilk görünümünün indisini
    //ve sonraki gorunum ındıslerını
    //ekrana yazdırın.

    public static void main(String[] args) {

        int[] dizi = {20, 5, 6, 5, 8, 9, 9, 5};
        List<Integer> burdaBulunanlar = new ArrayList<>();
        int i = 0;

        while (i < dizi.length) {
            int deger = dizi[i];
            int sayac = 0;
            if (burdaBulunanlar.contains(deger)) {
                i++;
                continue;
            }
            List<Integer> indisler = new ArrayList<>();
            int j = i + 1;
            while (j < dizi.length) {
                if (dizi[j] == deger) {
                    sayac++;
                    indisler.add(j);
                    burdaBulunanlar.add(deger);

                }
                j++;
            }
            if (sayac != 0) {
                System.out.println(deger + "baslangıc indisi " + i + "tekrar " + sayac + " " + indisler);
            }
            i++;
        }
    }

    }


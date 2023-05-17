package Lesson3;

public class OgrencilerinTestSonuclariniDegerlendirme {
    /*
          2-) Interwiew Sorusu
        Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
        //10 sorumuz var
        //ogrencilerin cevaplari
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 1 nolu ogrenci
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},// 2 nolu ogrenci
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},// 3 nolu ogrenci
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},// 4 nolu ogrenci
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 5 nolu ogrenci
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 6 nolu ogrenci
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 7 nolu ogrenci
        {'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};// 8 nolu ogrenci
        *
        * // cevap anahtari
        {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        output:
        1 nolu ogrencinin dogru cevap sayisi :7
        2 nolu ogrencinin dogru cevap sayisi :6
        3 nolu ogrencinin dogru cevap sayisi :5
        4 nolu ogrencinin dogru cevap sayisi :4
        5 nolu ogrencinin dogru cevap sayisi :8
        6 nolu ogrencinin dogru cevap sayisi :7
        7 nolu ogrencinin dogru cevap sayisi :7
        8 nolu ogrencinin dogru cevap sayisi :7
     */
    public static void main(String[] args) {
        char[][] girilenYanitlar = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 1 nolu ogrenci
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},// 2 nolu ogrenci
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},// 3 nolu ogrenci
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},// 4 nolu ogrenci
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 5 nolu ogrenci
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 6 nolu ogrenci
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},// 7 nolu ogrenci
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};// 8 nolu ogrenci}
        char[] cevapAnahtari = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        sonuc(girilenYanitlar, cevapAnahtari);
    }

    public static void sonuc(char[][] girilenYanitlar, char[] cevapAnahtari) {
        for (int i = 0; i < girilenYanitlar.length; i++) { // outer loop ogrencileri tek tek getiriyor
            int sayac = 0;
            for (int j = 0; j < girilenYanitlar[i].length; j++) { // inner loop ogrencinin cevaplarini tek tek getiriyor
                if (girilenYanitlar[i][j] == cevapAnahtari[j])
                    sayac++;
            }
            System.out.println(i + 1 + " nolu ogrencinin dogru cevap sayisi : " + sayac);
        }
    }
}

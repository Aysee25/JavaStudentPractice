package Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class istenmeyenHarfiSil {
    public static void main(String[] args) {
             /*
            // Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
            // kismini list olarak bize donduren bir method olusturun

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf giriniz:");
        String harf = scanner.next();

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Candir");
        list.add("Selenium");
        list.add("SQL");
        list.add("Api");

        System.out.println(istenmeyen(list, harf));

        // System.out.println(list);

        //Java candir selenium sql api

    }

    public static String istenmeyen (List<String> silinecekList , String istenmeyenHarf){

        String listAktarim = "";
        String yeniList = "";

        for (int i = 0; i < silinecekList.size(); i++) {
            listAktarim += silinecekList.get(i) + " ";
        }
        for (int i = 0; i < listAktarim.length(); i++) {
            listAktarim= listAktarim.toLowerCase();
            if (!(listAktarim.charAt(i) == istenmeyenHarf.charAt(0))){
                yeniList +=listAktarim.charAt(i);
            }
        }
        return yeniList;
    }

        /*
        for (int i =silinecekList.size()-1 ; i >= 0 ; i--) {
                if (silinecekList.get(i).contains(istenmeyenHarf)){
                    silinecekList.remove(i);

                }
            }
         */

    }


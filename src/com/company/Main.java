package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private static ArrayList<Object> ArrayUtils;

    public static void main(String[] args) {


//        int[] tablou = {1, 2, 3, 8, 7, 6};
//        tablou[3] = 4;
//        tablou[4] = 5;
//
//        for (int i = 0; i < tablou.length; i = i + 1) {
//            System.out.print(tablou[i] + "");
//        }
//
//        //Slide 51 Exemplu 1:
//
//        Integer[] array = {2, 4, 6, 8};
//        boolean b = Arrays.asList(array).contains(4);
//        System.out.println(b);
//
//        //Slide 52 Exemplu 2:
//
//        String[ ] array = {"a", "b", "c", "d"};
//        boolean b = Arrays.asList(array).contains("d");
//        System.out.println(b);
//
//        //Slide 53 Problema 1:
//        //Se dă un șir de numere întregi. Să se determine și să se afișeze valoarea maximă din acest șir.
//        //Exemplu:
//        //Dacă se dă șirul int[ ] sir={1, 5, 2, 8, 9, 14, 3, 4, 17, 10, 11}.
//        //Se va afișa: Maximul este 17
//
//
//        int[] sir = {1, 5, 2, 8, 9, 14, 3, 4, 17, 10, 11};
//
//        int maxim = 0;
//
//        for (int i = 0; i < sir.length; i = i + 1) {
//            if (sir[i] > maxim) {
//                maxim = sir[i];
//            }
//        }
//        System.out.println("Maximul este" + maxim);
//
//        //Slide 55 Problema 2:
//        //Verificam dacă un numar se afla în intervalul [5,10].
//
//
//        int nr = 5;
//        if (nr >= 5 && nr <= 10) {
//            System.out.println("Numarul" + nr + "e afla in intervalul [5,10]");
//        } else {
//            System.out.println("Numarul" + nr + "nu se afla in intervalul [5,10]");
//        }
//
//        //Slide 56 Problema 3:
//        //Verificam daca un numar este par sau impar
//        //Numere PARE:
//
//        int[] sir = {0, 1, 2, 3, 4, 5, 6, 7};
//
//        for (int i = 0; i < sir.length; i = i + 2) {
//
//            System.out.print(sir[i] + "");
//        }
//
//        //Numere IMPARE
//
//        int[] sir1 = {0, 1, 2, 3, 4, 5, 6, 7};
//
//        System.out.println();
//
//        for (int i = 1; i < sir1.length; i = i + 2) {
//
//            System.out.print(sir1[i] + "");
//
//        //Slide 57 Problema 5:
//        //Incremantare Numere Impare
//
//        int[] sir2 = {0, 1, 2, 3, 4, 5, 6, 7};
//
//        for (int i = 1; i < sir2.length; i = i + 2) {
//                sir2[i] = sir2[i] + 1;
//
//            System.out.println(sir2[i] + "");
//            }
//            System.out.println();
//
//        //Decrementare Numere Pare
//
//            int[] sir3 = {0, 1, 2, 3, 4, 5, 6, 7};
//
//            for (int i = 0; i < sir2.length; i = i + 2) {
//                sir2[i] = sir2[i] - 1;
//
//                System.out.println(sir2[i] + "");
//            }
//
//
//        //Slide 58 Sir Modulo
//
//        int[] sir = {1, 2, 3, 4, 5};
//
//
//        for (int i = 1; i < sir.length; i = i + 2) {
//            {
//                System.out.print(sir[i] + "");
//
//                    for (int j = 0; j < sir.length; j = j + 2) {
//                        System.out.print(sir[j] + "");
//                        System.out.println(sir[i] + " " + sir[j]);
//                    }
//                }
//
//        //Slide 59 Exercitiu 1:
//
//        String a = "Maria merge cu Bicicleta";
//
//        System.out.println(a.charAt(7));
//
//        //Slide 59 Exercitiu 2:
//
//        String b = "Azi este o zi minunata";
//
//        System.out.println(b.replace("z", "t"));
//
//        //Slide 59 Exercitiu 3:
//
//        String c = "Mere";
//
//        System.out.println(c.replaceFirst("e", "a"));
//
//        //Slide 59 Exercitiu 4:
//
//        String d = "236524";
//
//        System.out.println(d.substring(2, 4));

//        //Slide 60 Exercitiu 5:

//        for (int n = 100; n >= 0; n = n - 2){
//
//         System.out.print(n + " ");
//         }
//
//        //Slide 60 Exercitiu 6:

//        String Fructe [] = {"Mere", "Pere", "Visine", "Portocale"};
//
//        for(int n=0;n<Fructe.length;n++)
//        System.out.print(Fructe[n]+" ");


//        //Slide 60 Exercitiu 7:
//        int i = 0;
//        for (int n = 2; n < 100; n += 2) {
//
//            System.out.print(n + " ");
//            i = i + 1;
//        }
//        System.out.println();
//        System.out.println("Numarul total este: " + i);
//
//       //Slide 60 Exercitiu 8:

        Scanner scannerIntrodus = new Scanner(System.in);

        System.out.print("Introdu valoarea pentru n: ");

        int n = scannerIntrodus.nextInt();

        int S = 0;

        for (int i = 1; i <= n; i++)

            S = S + i;

        System.out.println("Suma totala este: " + S);

    }

}
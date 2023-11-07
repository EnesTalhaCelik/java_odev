import java.util.Scanner;

import static java.lang.Integer.sum;

public class Anket {

    public static float ortalama(int[][] cevaplar,int i,int j){
        float ort = 0;
        for(int k = 0 ; k< j ;k++){
            ort += cevaplar[i][k];

        }
        ort = ort/j;
        return ort;
    }


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        String[] sorular = new String[5];

        int[][] cevaplar = new int[5][10];

        float enYuksek = 0;
        float enDusuk = 10;
        float ort;

        sorular[0] = "Server'in Yaptığı 40x lik kupon tutar mı ? (çok sağlam kupon)";

        sorular[1] = "Sizce Shorts içeriklerinin yaygınlaşmasıyla odaklanma süremizin azalması ne kadar kritik bir durum ?";

        sorular[2] = "şöyle";

        sorular[3] = "böyle";

        sorular[4] = "ve bundan";
        System.out.println("Hoşgeldiniz!\nAnketimize Katıldığınız için teşekkürler!\n");




        for(int i = 0 ; i <10 ; i++){
            System.out.println("\n"+sum(i,1)+". kişi için anketi dolduruyorsunuz.");

            for(int j = 0 ; j <5 ; j++){
                System.out.println(sorular[j]);

                while (true) {

                    cevaplar[j][i] = scanner.nextInt();
                    if(cevaplar[j][i]>=1 && cevaplar[j][i]<=10){
                        break;

                    }

                }



            }
        }

        System.out.println("Sorular     Kişi1 Kişi2 Kişi3 Kişi4 Kişi5 Kişi6 Kişi7 Kişi8 Kişi9 Kişi10     Ortalama");

        for(int i = 0 ; i <5 ; i++){
            System.out.print("Soru "+sum(i,1)+"        ");

            for(int j = 0 ; j <10 ; j++){
                System.out.print(cevaplar[i][j]+"     ");

            }
            ort = ortalama(cevaplar,i,10);
            System.out.print("       "+ort);

            if(ort > enYuksek){
                enYuksek = ort;
            }
            if (ort < enDusuk) {
                enDusuk = ort;
            }
            System.out.print("\n");
        }


        System.out.println("Sistemde bulunan en büyük ortalama değeri :"+enYuksek);
        System.out.println("Sistemde bulunan en düşük ortalama değeri :"+enDusuk);


        System.out.println("İyi günler.");

    }


}

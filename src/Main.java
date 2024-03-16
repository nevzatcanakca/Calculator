import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double sonuc = 0;
        DortIslem dortIslem = new DortIslem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi giriniz: ");
        double islem = scanner.nextDouble();
        if (islem == 4){
            if (sayi2 == 0){
                System.out.println("Hatalı değer girdiniz.");
            }
        }else {
        if (islem == 1){
            sonuc = dortIslem.topla(sayi1,sayi2);
        }
        if (islem == 2){
            sonuc = dortIslem.cikar(sayi1,sayi2);
        }
        if (islem == 3){
            sonuc = dortIslem.carp(sayi1,sayi2);
        }
        if (islem == 4){

                sonuc = dortIslem.bol(sayi1, sayi2);

        }
        if (islem == 5){
            sonuc = (double) dortIslem.usAlma(sayi1,sayi2);
        }

        System.out.println("İşleminizin sonucu : "+sonuc);}

    }
}
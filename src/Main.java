import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dogumTarihi, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz :");
        dogumTarihi = input.nextInt();

        sonuc = dogumTarihi % 12;

        switch (sonuc){
            case 0:
                 if (sonuc == 0){
                     System.out.println("Çin Zodyağı Burcunuz : Maymun");
                 }else{
                     System.out.println(sonuc);
                 }
                 break;
            case 1:
                if (sonuc == 1){
                    System.out.println("Çin Zodyağı Burcunuz : Horoz");
                }break;
            case 2 :
                if (sonuc == 2){
                    System.out.println("Çin Zodyağı Burcunuz : Köpek");
                }break;
            case 3:
                if (sonuc == 3){
                    System.out.println("Çin Zodyağı Burcunuz : Domuz");
                }break;
            case 4:
                if (sonuc == 4){
                    System.out.println("Çin Zodyağı Burcunuz : Fare");
                }break;
            case 5:
                if (sonuc == 5){
                    System.out.println("Çin Zodyağı Burcunuz : Öküz");
                }break;
            case 6:
                if (sonuc == 6){
                    System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                }break;
            case 7:
                if (sonuc == 7){
                    System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                }break;
            case 8:
                if (sonuc == 8){
                    System.out.println("Çin Zodyağı Burcunuz : Ejderha");
                }break;
            case 9:
                if (sonuc == 9){
                    System.out.println("Çin Zodyağı Burcunuz : Yılan");
                }break;
            case 10:
                if (sonuc == 10){
                    System.out.println("Çin Zodyağı Burcunuz : At");
                }break;
            case 11:
                if (sonuc == 11){
                    System.out.println("Çin Zodyağı Burcunuz : Koyun");
                }break;
            default:
                System.out.println("Hatalı Tarih Girdiniz");
        }
    }
}
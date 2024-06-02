import  java.util.Scanner;

public class KdvHesaplama
{
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar=input.nextDouble();
        kdvOran=tutar>=0&& tutar<=1000? 0.18:0.08;

        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("Kdv'siz tutar: "+tutar);
        System.out.println("Kdv Oranı: "+kdvOran);
        System.out.println("Kdv Tutarı: "+kdvTutar);
        System.out.println("Kdv'li Tutar: "+kdvliTutar);

    }
}

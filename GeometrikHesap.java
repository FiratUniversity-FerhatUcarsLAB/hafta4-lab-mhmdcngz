/*
* Ad Soyad: Muhammed Cengiz
* Ogrenci No: 250541037
* Tarih: 24.10.2025
* Aciklama: Geometrik Hesap
*/

import java.util.Scanner;

public class GeometrikHesap{
	public static void main(String[] args){

		//Değişkenler
		double yaricap;
		double alan;
		double cevre;
		double hacim;
		double yuzeyAlani;
		double cap;
		final double PI = 3.14159;


		//Girdi alma
		Scanner input = new Scanner(System.in);
		System.out.println("=== GEOMETRIK HESAPLAYICI ===");
		System.out.print("Dairenin yarıçapını girin: ");
		yaricap = input.nextDouble();


		//Hesaplama
		alan = Math.pow(yaricap, 2)*PI;
		cevre = PI*2*yaricap;
		cap = 2*yaricap;
		hacim = 4.0/3.0*PI*Math.pow(yaricap, 3);
		yuzeyAlani = 4*PI*Math.pow(yaricap, 2);


		//Çıktı verme
		System.out.println("\n\n\nSONUCLAR:");
		System.out.println("------------------------------10----");
		System.out.printf("Daire Alanı        : %.2f cm^2",alan);
		System.out.printf("\nDaire Çevresi      : %.2f cm",cevre);
		System.out.printf("\nDaire Çapı         : %.2f cm",cap);
		System.out.printf("\nKüre Hacmi         : %.2f cm^3",hacim);
		System.out.printf("\nKüre Yüzey Alanı   : %.2f cm^2",yuzeyAlani);

		input.close();
	}
}
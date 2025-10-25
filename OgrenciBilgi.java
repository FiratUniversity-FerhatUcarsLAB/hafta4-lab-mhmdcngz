/*
* Ad Soyad: Muhammed Cengiz
* Ogrenci No: 250541037
* Tarih: 24.10.2025
* Aciklama: Öğrenci Bilgi Sistemi
*/

import java.util.Scanner;

public class OgrenciBilgi{
	public static void main(String[] args){


		//Değişkenler
		String ad;
		String soyad;
		int ogrenciNo;
		int yas;
		double gpa;


		//Girdi alma
		Scanner input = new Scanner(System.in);
		System.out.println("=== ÖĞRENCI BILGI SISTEMI ===");

		System.out.print("\n Adınızı girin: ");
		ad = input.next();

		System.out.print("\nSoyadınızı girin: ");
		soyad = input.next();

		System.out.print("\nÖğrenci numaranızı girin: ");
		ogrenciNo = input.nextInt();

		System.out.print("\nYaşınızı girin: ");
		yas = input.nextInt();

		System.out.print("\nNot ortalamanızı girin (0.00_4.00) :");
		gpa = input.nextDouble();


		//Yazdırma
		System.out.println("\n\n\n=== ÖĞRENCI BILGI SISTEMI ===");
		System.out.println("Ad Soyad: "+ad+" "+soyad);
		System.out.println("Öğrenci No: "+ogrenciNo);
		System.out.println("Yaş: "+yas);
		System.out.printf("GPA: %.2f", gpa);
	}
}

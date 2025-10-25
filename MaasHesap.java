/*
* Ad Soyad: Muhammed Cengiz
* Ogrenci No: 250541037
* Tarih: 24.10.2025
* Aciklama: Maaş Hesabı
*/

import java.util.Scanner;

public class MaasHesap {
	public static void main(String[] args){

		//Değişkenler
		String adSoyad;
		double brutMaas;
		int gunlukcalismaSaati;
		int calismaGunu;
		int mesaiSaati;
		final double sgk_orani = 0.14;
		final double gelirvergisi_orani = 0.15;
		final double damgavergisi_orani = 0.00759;
		double mesaiUcreti;
		double toplamGelir;
		double sgk;
		double gelirVergisi;
		double damgaVergisi;
		double toplamKesinti;
		double netMaas;
		double kesintiOrani;
		double saatlikKazanc;
		double gunlukKazanc;
		double kalanKesinti;

		//Girdi alma
		Scanner input = new Scanner(System.in);

		System.out.print("Ad-Soyad girin: ");
		adSoyad = input.nextLine();

		System.out.print("\nAylık brüt maaş girin: ");
		brutMaas = input.nextDouble();

		System.out.print("\nGünlük çalışma saati girin: ");
		gunlukcalismaSaati = input.nextInt();

		System.out.print("\nKaç gün çalıştığınızı girin: ");
		calismaGunu = input.nextInt();

		System.out.print("\nMesai saati girin: ");
		mesaiSaati = input.nextInt();


		//Hesaplama
		mesaiUcreti = brutMaas / (gunlukcalismaSaati * calismaGunu) * mesaiSaati * 1.5;
		toplamGelir = brutMaas + mesaiUcreti;

		sgk = toplamGelir * sgk_orani;
		kalanKesinti = toplamGelir - sgk;
		gelirVergisi = kalanKesinti * gelirvergisi_orani;
		kalanKesinti = kalanKesinti - gelirVergisi;
		damgaVergisi = toplamGelir * damgavergisi_orani;
		toplamKesinti = sgk + gelirVergisi + damgaVergisi;

		netMaas= toplamGelir - toplamKesinti;

		kesintiOrani = (toplamKesinti/toplamGelir) * 100;

		saatlikKazanc = netMaas / (gunlukcalismaSaati*calismaGunu);

		gunlukKazanc = netMaas / calismaGunu;


		//Çıktı verme
		System.out.println("\n\n\n======================================================");
		System.out.println("                    MAAŞ BORDROSU                    ");
		System.out.println("======================================================");
		System.out.println("Çalışan: " + adSoyad);
		System.out.println("\nGELİRLER:");
		System.out.printf("	Brüt Maaş                  : %.2f TL",brutMaas);
		System.out.printf("\n	Mesai Ücreti (%d saat)     : %.2f TL",mesaiSaati,mesaiUcreti);
		System.out.println("\n	----------------------------------------------");
		System.out.printf("	TOPLAM GELIR               : %.2f TL\n",toplamGelir);
		System.out.println("\nKESINTILER:");
		System.out.printf("	SGK Kesintisi (14/100)     : %.2f TL",sgk);
		System.out.printf("\n	Gelir Vergisi (15/100)     : %.2f TL",gelirVergisi);
		System.out.printf("\n	Damga Vergisi (0.8/100)    : %.2f TL",damgaVergisi);
		System.out.println("\n	----------------------------------------------");
		System.out.printf("	TOPLAM KESINTI             : %.2f TL",toplamKesinti);
		System.out.printf("\nNET MAAŞ       	                   : %.2f TL",netMaas);
		System.out.println("\n------------------------------------------------------");
		System.out.printf("Kesinti Oranı         	           : %.2f/100",kesintiOrani);
		System.out.printf("\nSaatlik Net Kazanç         	   : %.2f TL",saatlikKazanc);
		System.out.printf("\nGünlük Net Kazanç                  : %.2f TL",gunlukKazanc);
		System.out.println("\n======================================================");

		input.close();
	}
}
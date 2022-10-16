package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220-284

		//KENDİ ÇÖZÜMÜM
//		int number = 220;
//		int number2 = 284;
//		int total = 0;
//		int total2 = 0;
//		
//		for (int i = 1; i < number; i++) {
//			if (number % i == 0) {
//				total = total + i;
//			}
//		}
//		for (int j = 1; j < number2; j++) {
//			if (number2 % j == 0) {
//				total2 = total2 + j;
//			}
//		}
//		if (total== number2 && total2== number) {
//			System.out.println("Bu sayıalr arkadaştır");
//		}else {
//			System.out.println("Bu sayılar arkadaş değildir");
//		}
		
		//ENGİN HOCANIN ÇÖZÜMÜ
		
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		for (int j = 1; j < sayi2; j++) {
			if (sayi2 % j == 0) {
				toplam2 = toplam2 + j;
			}
		}
		if (toplam1== sayi2 && toplam2== sayi1) {
			System.out.println("bu iki sayı arkadaştır");
		}else {
			System.out.println("bu iki arkadaş değildir");
		}
	}

}

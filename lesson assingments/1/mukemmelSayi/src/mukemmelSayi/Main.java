package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		//6 -->1,2,3
		//28 -->1,2,4,7,14
		int number = 28;
		
		
//		//KENDİ ÇÖZÜMÜM
//		int bolunebilen=0;
//		for (int i = 1; i <number; i++) {
//			if (number%i==0) {
//				bolunebilen=i+bolunebilen;
//			}
//		}
//		if (bolunebilen==number) {
//			System.out.println(number +" Bu sayı mükemmeldir");
//		} else {
//			System.out.println(number +" Bu sayı mükemmel değildir");
//		}
		
		//ENGİN HOCANIN ÇÖZÜMÜ
		int total=0;
		for (int i = 1; i <number; i++) {
			if (number%i==0) {
				total=i+total;
			}
		}
		if (total==number) {
			System.out.println("Mükemmel sayıdır");
		} else {
			System.out.println("Mükemmel sayı değildir");
		}
		
	}

}

package miniProjeAsalSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number = -11;
		int remainder = number % 2;
		//System.out.println(remainder);
		
		//KENDİ ÇÖZÜMÜM:
		
		if (remainder == 0 && number == 2) {
			System.out.println(number +" Bu sayı asaldır");
		}else if(remainder == 1) {
			System.out.println( number + " Bu sayı asaldır");
		}else {
			System.out.println("Bu sayı asal değildir");
		}
		
		//ENGİN HOCANIN ÇÖZÜMÜ
		
		boolean isPrime= true;
		
		if (number==1) {
			System.out.println("Sayı asal değildir");
			return;// bu kod yazıldığı yerden methodun başına döndürür kod bloğu bu koodan ititbaren devam etmez
		}
				
		if (number<2) {
			System.out.println("Geçersiz sayı");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime=false;
			}	
		}
		
		if (isPrime)//bu kullanım isPrime== true ile aynı nalma gelir 
		{
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
	}

}

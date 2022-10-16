package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {
			1,2,5,7,9,0	
		};
		int aranacak=3;
		
//		//KENDİ ÇÖZÜMÜM
//		boolean varMı=false;
//		
//		for (int i : sayilar) {
//			if (aranacak==i) {
//				varMı=true;
//			}
//		}
//		if (varMı) {
//			System.out.println("Bu sayı mevcut");
//		}else {
//			System.out.println("Bu sayı mevcut değil");
//		}
		
		//ENGİN HOCANIN ÇÖZÜMÜ
		
		boolean varMı=false;
		
		for (int i : sayilar) {
			if (aranacak==i) {
				varMı=true;
				break;
			}
		}
		if (varMı) {
			System.out.println("sayı mevcuttur");
		}else {
			System.out.println("sayı mevcut değildir");
		}
	}

}

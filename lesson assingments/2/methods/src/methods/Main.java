package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {
				1,2,5,7,9,0	
			};
			int aranacak=3;
			
			boolean varMı=false;
			
			for (int i : sayilar) {
				if (aranacak==i) {
					varMı=true;
					break;
				}
			}
			String mesaj= "";
			if (varMı) {
				mesaj = "Sayı mevcuttur: " + aranacak;
				
				mesajVer(mesaj);
			}else {
				mesajVer("Sayı mevcuttur: " + aranacak);
			}

	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}

package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'C';

		// KENDİ ÇÖZÜMÜM
//		boolean dogruMu=false;
//		char[] kalinSesliHarfler = {
//				'A','I','O','U'
//		};
//		char[] inceSesliHarfler= {
//				'E','İ','Ö','Ü'
//		};
//		
//		for (char harfler : kalinSesliHarfler) {
//			if (harf == harfler) {
//				System.out.println("Bu harf Kalın seslidir.");
//				dogruMu=true;
//			}
//		}
//		for (char harfler : inceSesliHarfler) {
//			if (harf==harfler) {
//				System.out.println("Bu harf İnce Seslidir");
//				dogruMu=true;
//			}
//		}
//		if (dogruMu==false) {
//			System.out.println("Bu harf ne kalın ne ince seslidir");
//		} 
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;

		default:
			System.out.println("İnce sesli harf");
			break;
		}
	}

}

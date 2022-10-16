package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		// değişken isimlendirmeleri java'da camelCase yazılır
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade süresi";

		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.300;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //false
			okYonu ="down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
			
		}
		else {
			okYonu ="equel.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı kredi","Maaşını halkbbanktan alanlar","Mutlu emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}

package stringsDemo;

public class
Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		//String ifadenin karakter sayısını veren kod
		System.out.println("Eleman sayısı " + mesaj.length());
		
		//String ifadenin istediğimiz bir elemenını vere kod
		System.out.println("5. eleman : "+ mesaj.charAt(4));
		
		//2 farklı String ifadeyi yazdırmak için kullanılır
		System.out.println(mesaj.concat(" Yaşasın!"));
		
		//start String ifadenin ilk karakterini sorgulamaya yarar true ya da false değer verir
		System.out.println(mesaj.startsWith("B"));
		
		//Aynı işlemin bir de tam tersi olan son karakteri sorgulayan kod
		System.out.println(mesaj.endsWith("B"));
		
		//karakterlerin 0 dan başlayıp 4 e kadar olanını chars dizinine aktarır 
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//indexof karakter aramamıza yarar soldan sağa doğru gider aradığımız karakter kaçıncı sıradaysa sırasını bildirir
		System.out.println(mesaj.indexOf("av"));
		
		//lastindexof ise sağdan sola doğru arama yapar
		System.out.println(mesaj.lastIndexOf("a"));

		// String ifademizin karakterlerini yeniden düzenlemeye yarar
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		// Bu kod String ifademizi parçalamaya yarar
		System.out.println(mesaj.substring(2));

		// İfadenin içinden cımbızla aradığımız çekmek içinse aşağıdaki gibi bir
		// kullanımı vardır
		System.out.println(mesaj.substring(2, 5));
		
		//split ise yine ifademiz parçalamaya yarar ama alt alt yazar
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//bu kod mevcut tüm kelimeleri küçük harfle yazar
		System.out.println(mesaj.toLowerCase());
		
		//bu kod ise Tüm harfleri büyük harfle yazar
		System.out.println(mesaj.toUpperCase());
		
	}

}

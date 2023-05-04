import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double armutKGFiyati = 2.14;
		double elmaKGFiyati = 3.67;
		double domatesKGFiyati = 1.11;
		double muzKGFiyati = 0.95;
		double patlicanKGFiyati = 5;
		System.out.print("Armut Kaç Kilo ? :");
		int armutKilosu = input.nextInt();
		System.out.print("Elma Kaç Kilo ? :");
		int elmaKilosu = input.nextInt();
		System.out.print("Domates Kaç Kilo ? :");
		int domatesKilosu = input.nextInt();
		System.out.print("Muz Kaç Kilo ? :");
		int muzKilosu = input.nextInt();
		System.out.print("Patlıcan Kaç Kilo ? :");
		int patlicanKilosu = input.nextInt();
		System.out.println("Toplam Tutar : " + (armutKGFiyati * armutKilosu + elmaKGFiyati * elmaKilosu + domatesKGFiyati * domatesKilosu + muzKGFiyati * muzKilosu + patlicanKGFiyati * patlicanKilosu));
	}

}

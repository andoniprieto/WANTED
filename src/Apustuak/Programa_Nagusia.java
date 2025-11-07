package Apustuak;

import java.util.Scanner;

//Programa Nagusia da eta --- egiten du
public class Programa_Nagusia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("MENUA:"); // Hau izango da menua non aukeratuko duzu zer programa abiaraziko den.
		System.out.println("★★★★★★★★★★★★★★★★★★★");
		System.out.println("1 = Primitiva");
		System.out.println("2 = La Quiniela");
		System.out.println("3 = Euromillones");
		System.out.println("0 = Amaitu");
		System.out.println("Sartu zenbaki bat 0tik - 3-ra");
		int Aukera = sc.nextInt();

		while (Aukera != 0) {

			switch (Aukera) {
			case 0: // 0 Idazterakoan programa amaituko da.
				System.out.println("Programa amaitu da");
				break;

			case 1: // 1 Idazterakoan Primitva programa abiaraziko da.
				Primitiva primitiva = new Primitiva();
				primitiva.primitivaExekutatu();
				break;

			case 2: // 2 Idazterakoan LaQuiniela programa abiaraziko da.
				LaQuiniela laQuiniela = new LaQuiniela();
				laQuiniela.laQuinielaExekutatu();
				break;

			case 3: // 3 Idazterakoan Euromillones programa abiaraziko da
				Euromillones euromillonea = new Euromillones();
				euromillonea.euromilloiaExekutatu();
				break;

			default: // Zenbaki bat sartzen bada eta izaten ez bada (0-3) berriz zenbakia idazteko
						// eskatuko dizu.
				System.out.println("Zenbaki hori ez da agertzen zerrendan, sartu zenbaki bat (0-3)");
			}
//Berriz menua errepikatuko da, programa bana bukatzerakoan eta ez da amaituko 0 idatzi arte.
			System.out.println("1 = Primitiva");
			System.out.println("2 = La Quiniela");
			System.out.println("3 = Euromillones");
			System.out.println("0 = Amaitu");
			System.out.println("Sartu zenbaki bat 0tik - 3-ra");
			Aukera = sc.nextInt();

		}
		sc.close();
	}
}
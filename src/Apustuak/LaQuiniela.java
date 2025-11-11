package javaAriketak;
import java.util.Random;
import java.util.Scanner;

public class LaQuiniela {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random(); //Zenbaki aleatorioak generatuko ditu.



		int asmatuDitu = 0;
		String[] aukerak = {"1", "X", "2"};


		//Array -a sortuko dugu benetako emaitzak emateko modu aleatorioan.
		String[] emaitzak = new String[14];
		for (int i = 0; i < 14; i++) {
			int indice = rnd.nextInt(3); // Itzuliko digu (0, 1 edo 2).
			emaitzak[i] = aukerak[indice];
		}

		String[] pronostikoak = new String[14]; //Array -a erabiltzailearen pronostikoak gordetzeko.

		for (int i = 0; i < 14; i++) {
			System.out.println((i + 1) + ". PARTIDOA:"); //Erakutziko du partidoaren zenbakia (1 gehitzen dugu 1-etik hasteko).

			switch (i + 1) {
			case 1: System.out.println("Athletic Club VS Barça"); break;
			case 2: System.out.println("Real Madrid VS Real Sociedad"); break;
			case 3: System.out.println("Valencia C.F. VS Atlético de Madrid"); break;
			case 4: System.out.println("Betis VS Sevilla C.F."); break;
			case 5: System.out.println("Villarreal C.F. VS Celta de Vigo"); break;
			case 6: System.out.println("Deportivo de la Coruña VS Malaga C.F."); break;
			case 7: System.out.println("Zaragoza C.F. VS R.C.D. Espanyol"); break;
			case 8: System.out.println("Getafe C.F. VS Gimnástic de Tarragona"); break;
			case 9: System.out.println("Sporting de Gijón VS Cádiz C.F."); break;
			case 10: System.out.println("C.A. Osasuna VS S.D. Eibar"); break;
			case 11: System.out.println("R.C.D. Huelva VS Burgos C.F."); break;
			case 12: System.out.println("Levante U.D. VS Real Valladolid"); break;
			case 13: System.out.println("R.C.D. Mallorca VS U.D. Las Palmas"); break;
			case 14: System.out.println("Granada C.F. VS Rayo Vallecano"); break;
			}

			String entrada;
			while (true) {
				System.out.println("Idatzi zure pronostikoa (1 / X / 2): ");
				entrada = sc.next().toUpperCase();
				if (entrada.equals("1") || entrada.equals("X") || entrada.equals("2")) { break;
				} else {
					System.out.println("Balio okerra. Mesedez, sartu 1, X edo 2.");
				}
			}
			pronostikoak[i] = entrada;
			System.out.println();
		}









		String[] aukerak2 = {"0", "1", "2", "M"};
		int partidoa15[];
		partidoa15 = new int [2];
		String[] predikzioa15 = new String[2];
		int h = 0;

		System.out.println("15. PARTIDOA:"+"\nDeportivo Alavés VS C.D. Mirandés"+"\nSartu bi taldeak sartuko dituen gol kantitate zehatza:");
		String[] emaitzak15 = new String[2];
		for (h=0; h<2; h++) {
			int indice2 = rnd.nextInt(4); //Itzuliko digu (0, 1, 2, M).
			emaitzak15[h] = aukerak2[indice2];
		}

		int j = 0;
		String entrada15 = null;



		while (true) {
			System.out.println("Sartu Deportivo Alavés sartuko dituen gol kantitate zehatza:");

			System.out.println("Idatzi zure pronostikoa (0 / 1 / 2 / M): ");
			entrada15 = sc.next().toUpperCase();
			if (entrada15.equals("0") || entrada15.equals("1") || entrada15.equals("2") || entrada15.equals("M")) { break;

			} else {
				System.out.println("Balio okerra. Mesedez, sartu 0, 1, 2 edo M.");
			}
		}


		predikzioa15[j] = entrada15;
		j++;

		while (true) {
			System.out.println("Sartu C.D. Mirandés sartuko dituen gol kantitate zehatza:");
			System.out.println("Idatzi zure pronostikoa (0 / 1 / 2 / M): ");
			entrada15 = sc.next().toUpperCase();
			if (entrada15.equals("0") || entrada15.equals("1") || entrada15.equals("2") || entrada15.equals("M")) {break;
			} else {
				System.out.println("Balio okerra. Mesedez, sartu 0, 1, 2 edo M.");	
			}
		}
		predikzioa15[j] = entrada15;





		if ((emaitzak15[0] == predikzioa15[0]) && (emaitzak15[1] == predikzioa15[1])) {
			asmatuDitu++;
		} 

		for (int i = 0; i < 14; i++) {
			String real = emaitzak[i];
			String tu = pronostikoak[i];
			boolean asmatu = real.equals(tu);
			if (asmatu) asmatuDitu++;
			System.out.println((i + 1) + ". Partidoa -> Benetako emaitza: " + real + " | Zure pronostikoa: " + tu + " --> " + (asmatu ? "ASMATU DITUZU" : "EZ DITUZU ASMATU"));
		}

		System.out.println("15. Partidoa --> Benetako emaitza: " + "Deportivo Alavés " + emaitzak15[0] + " C.D. Mirandés " + emaitzak15[1]);










		System.out.println("\nZure pronostikotik " + asmatuDitu + " asmatu dituzu.");

		if (asmatuDitu == 15) {
			System.out.println("Sari nagusiena lortu duzu!");
		} else if (asmatuDitu == 14) {
			System.out.println("Ia sari hoberena lortzen duzu!");
		} else if (asmatuDitu == 13) {
			System.out.println("Sari bikaina lortu duzu!");
		} else if (asmatuDitu == 12) {
			System.out.println("Sari nahiko ona lortu duzu!");
		} else if (asmatuDitu == 11) {
			System.out.println("Sari ona lortu duzu!");
		} else if (asmatuDitu == 10) {
			System.out.println("Sari bat lortu duzu!");
		} else {
			System.out.println("Ez duzu saririk lortu.");
		}
		sc.close();
	}
}
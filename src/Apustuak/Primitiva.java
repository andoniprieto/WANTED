package ariketak;

import java.util.Random;
import java.util.Scanner;

public class Primitiva {

	// Primitiva programa exekutatuko da.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int reint;
		int kontIrab = 0;
		int zenbComp;
		int i;
		int j;
		int sartutakoZenbakia;
		int reintErab;
		boolean konplementarioa = false;

		System.out.println("Hau primitiva programa da.");

		// Randomarekin ausazko zenbakiak sortuko ditu
		Random random = new Random();
		int PrimiEmaitza[];
		PrimiEmaitza = new int[6];

		for (i = 0; i < 6; i++) {
			int zenb;
			boolean errepikatuta;
			do {
				zenb = random.nextInt(49) + 1;
				errepikatuta = false;
				for (j = 0; j < i; j++) {
					if (PrimiEmaitza[j] == zenb) {
						errepikatuta = true;
						break;
					}
				}
			} while (errepikatuta);
			PrimiEmaitza[i] = zenb;
		}

		// Zenbaki hauek ezin dira errepikatu.

		int ErabiltzailePredik[];
		ErabiltzailePredik = new int[6];

		// Erabiltzaileak 6 zenbaki sartuko ditu 1-49ra
		i = 0;
		while (i < 6) {
			System.out.println("Sartu ezazu zenbaki bat (1-49):");
			sartutakoZenbakia = sc.nextInt();
			if (sartutakoZenbakia <= 49 && sartutakoZenbakia >= 1) {
				boolean errepikatu = false;
				for (j = 0; j < i; j++) {
					if (ErabiltzailePredik[j] == sartutakoZenbakia) {
						errepikatu = true;
						break;
					}
				}
				// Zenbaki hauek ezin dira errepikatu.
				if (errepikatu) {
					System.out.println("Zenbakia errepikatuta dago, saiatu berriro.");
				} else {
					ErabiltzailePredik[j] = sartutakoZenbakia;
					i++;
				}
			} else {
				System.out.println("Sartutako zenbakia ez da zuzena");
			}
		}

		// Erabiltzailearen zenbakiak bistaratzen ditu
		for (j = 0; j < 6; j++) {
			System.out.println("Sartutako zenbakia " + ErabiltzailePredik[j]);
		}

		System.out.println("                                                                              ");

		// Primitiva programaren zenbakiak bistaratzen ditu
		for (i = 0; i < 6; i++) {
			System.out.println("Zenbaki aleatorioa hau da: " + PrimiEmaitza[i]);
		}

		// Zenbaki konplementarioa sortuko du
		zenbComp = random.nextInt(49) + 1;
		konplementarioa = false;
		for (i = 0; i < 6; i++) {
			if (ErabiltzailePredik[i] == zenbComp) {
				konplementarioa = true;
				break;
			}
		}
		System.out.println("Zenbaki konplementarioa hau da: " + zenbComp);

		// Asmatutako zenbakiak kontatuko du
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				if (ErabiltzailePredik[j] == PrimiEmaitza[i]) {
					kontIrab++;
				}
			}

		}
		System.out.println("                                                                          ");

		// Asmatutako zenbaki kopurua bistaratuko du
		System.out.println("Asmatu dituzun zenbaki kopurua " + kontIrab + " da");

		System.out.println("                                                                          ");

		// Reintegroa sortuko du (ausaz)
		reint = random.nextInt(10);

		// Reintegroa 0tik 9ra sortuko du
		do {
			System.out.print("Sartu zure reintegro zenbakia (0-9): ");
			reintErab = sc.nextInt();
			if (reintErab < 0 || reintErab > 9) {
				System.out.println(" Reintegroa 0 eta 9 artean egon behar da");
			}
		} while (reintErab < 0 || reintErab > 9);

		System.out.println("Irten den reintegro zenbakia " + reint + " da");

		// Asmatutako zenbakiak, konplementarioa eta reintegroa kontutan edukita, emaitz
		// desberdinak sortuko ditu.
		boolean irabaziDu = false;

		if (kontIrab == 6) {
			System.out.println("Lehenengo saria irabazi duzu! (6 zenbaki)");
			irabaziDu = true;
		} else if (kontIrab == 5 && konplementarioa) {
			System.out.println("Bigarren saria irabazi duzu! (5 + osagarria)");
			irabaziDu = true;
		} else if (kontIrab == 5) {
			System.out.println("Hirugarren saria irabazi duzu! (5 zenbaki)");
			irabaziDu = true;
		} else if (kontIrab == 4) {
			System.out.println("Laugarren saria irabazi duzu! (4 zenbaki)");
			irabaziDu = true;
		} else if (kontIrab == 3) {
			System.out.println("Bosgarren saria irabazi duzu! (3 zenbaki)");
			irabaziDu = true;
		} else if (reintErab == reint) {
			System.out.println("Reintegroa asmatu duzu! Zure dirua itzultzen da.");
			irabaziDu = true;
		}

		if (!irabaziDu) {
			System.out.println("Ez duzu saririk lortu. Saiatu berriro!");
		}

	}
}

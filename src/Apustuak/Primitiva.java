package ariketak;

import java.util.Random;
import java.util.Scanner;

public class Primitiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int reint;
		int kontIrab=0;
		int zenbComp;
		int i;
		int j;
		int sartutakoZenbakia;
		int reintErab;
		boolean konplementarioa = false;
		
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

		
		
		int ErabiltzailePredik[];
		ErabiltzailePredik = new int[6];
	
		
		i=0;
		while (i<6) {
			System.out.println("Sartu ezazu zenbaki bat (1-49):");
			sartutakoZenbakia = sc.nextInt();	
			if (sartutakoZenbakia <= 49 && sartutakoZenbakia  >= 1){
				boolean errepikatu = false;
				for (j= 0; j < i; j++) {
                    if (ErabiltzailePredik[j] == sartutakoZenbakia) {
                        errepikatu = true;
                        break;
                    }
                }

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
		
		for (j=0; j<6; j++) {
			System.out.println("Sartutako zenbakia " +ErabiltzailePredik[j]);
		}
		
		System.out.println("----------------------------------------------------");

		
		
		for (i=0; i<6; i++) {
			System.out.println("Zenbaki aleatorioa hau da: " +PrimiEmaitza[i]);
		}
			
		zenbComp= random.nextInt(49) + 1;	
		konplementarioa = false;
			for (i = 0; i < 6; i++) {
				if (ErabiltzailePredik[i] == zenbComp) {
					konplementarioa = true;
				    break;
				}
			}
				System.out.println("Zenbaki konplementarioa hau da: "+zenbComp);	
			
			
			
			for (i=0; i<6; i++) {
			for (j=0; j<6; j++) {
				if (ErabiltzailePredik[j] == PrimiEmaitza[i]) {
					kontIrab++;
			}
		}
			
			
	}		
			System.out.println("--------------------------------------------------------");	
		
			System.out.println("Asmatu dituzun zenbaki kopurua "+kontIrab+" da");	

			
			System.out.println("--------------------------------------------------------");	
			
			
	        reint = random.nextInt(10);
	        

	        do {
	            System.out.print("Sartu zure reintegro zenbakia (0-9): ");
	            reintErab = sc.nextInt();
	            if (reintErab < 0 || reintErab > 9) {
	                System.out.println(" Reintegroa 0 eta 9 artean egon behar da");
	            }
	        } while (reintErab < 0 || reintErab > 9);


	        System.out.print("Irten den reintegro zenbakia "+reintErab+ " da");
			
	        
	        //break;
	        
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
	            System.out.println("\nEz duzu saririk lortu. Saiatu berriro!");
	        }

	}
}		


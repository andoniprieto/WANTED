package Apustuak;

import java.util.Scanner;
import java.util.Random;

public class Euromillones {
	Scanner sc = new Scanner(System.in);
	 //Aldagaiak definitu.
	 int euromilloi[] = new int[5];
	 int euromilloiIzarrak[] = new int[2];
	 int euromilloiizarerantzunak[] = new int[2];
	 int euromilloierantzunak[] = new int[5];
	 Random random = new Random();
	 int i;
	 int j;
	 int x;
	 int y;
	 int zenbasmatu;
	 int izarasmatu;
	 int zenb1;
	 int zenb2;	

	public void euromilloiaExekutatu() {
		System.out.println("Euromillones");
		 

		 //zenbakien predikzioak eskatu eta gorde egiten ditu.
		for(i=0;i<5;i++) {
			System.out.println("Sartu zenbaki bat 1-50 tartean");
			zenb1 = sc.nextInt();		
			if((zenb1>=1) && (zenb1<=50)) {
				euromilloi[i] = zenb1;	
			}
			else {
				System.out.println("Sartutako zenbakia ez da egokia!");
				i--;
			}
		 }
		//izarren predikzioak askatu eta gorde egiten ditu.
		for(j=0;j<2;j++) {
			 System.out.println("Sartu zenbaki bat 1-12 tartean");
			 zenb2 = sc.nextInt();
			if((zenb2>=1) && (zenb2<=12))
			euromilloiIzarrak[j] = zenb2;
		 
			else {
			 System.out.println("Sartutako zenbakia ez da egokia!");
			 j--;
			}
		}
		//"for" hauek erantzunak ausaz aukeratzen eta gorde egiten ditu.
		for (x = 0; x < 5; x++) {
		 	euromilloierantzunak[x] = random.nextInt(50) + 1;
		}
        for (y = 0; y < 2; y++) {
        	euromilloiizarerantzunak[y] = random.nextInt(12) + 1;
        }

		zenbasmatu = 0;
		izarasmatu = 0;

		//Bi "for" hauek predikzioak eta emaitzak konparatzen ditu.
				for(i=0;i<5;i++){
					if(euromilloierantzunak[i] == euromilloi[i]){
						zenbasmatu++;
						}
				}

				for(j=0;j<2;j++){
					if(euromilloiizarerantzunak[j] == euromilloiIzarrak[j]){
						izarasmatu++;
						}
				}
		//Honek zuk asmatu duzun zenbakiak eta izarrak bistaratuko ditu.
				System.out.println("Hauek dira zuk asmatutako zenbakiak"+zenbasmatu);
				System.out.println("Hauek dira zuk asmatutako izarrak"+izarasmatu);

		//Hemendik aurrera lortu duzun sariak bistaratuko du.
					 if(zenbasmatu == 5) {
						switch(izarasmatu) {
						case 2:
							System.out.println("Zorionak euromilloia tokatu zaizu");
							break;
						case 1:
							System.out.println("2.premioa");
							break;
						default:
							System.out.println("3.premioa");
						}
					 }
					if(zenbasmatu == 4){
						switch(izarasmatu) {
							case 2:
								System.out.println("4.premioa");
								break;
							case 1:
								System.out.println("5.premioa");
								break;
							default:
								System.out.println("6.premioa");
						}
					}
					if(zenbasmatu == 3){
						switch(izarasmatu) {
							case 2:
								System.out.println("7.premioa");
								break;
							case 1:
								System.out.println("9.premioa");
								break;
							default:
								System.out.println("10.premioa");
						}
					}
					if(zenbasmatu == 2) {
						switch(izarasmatu) {
							case 2:
								System.out.println("8.premioa");
								break;
							case 1:
								System.out.println("12.premioa");
								break;
							default:
								System.out.println("13.premioa");
						}
					}
					if((zenbasmatu == 1) && (izarasmatu == 2)){
						System.out.println("11.premioa");
					}
					if(zenbasmatu == 0){
						System.out.println("Ez duzu saririk");
					}
					if((zenbasmatu == 1) && (izarasmatu == 1)){
						System.out.println("Ez duzu saririk");
					}
					if((zenbasmatu == 1) && (izarasmatu == 0)){
						System.out.println("Ez duzu saririk");
					}
		System.out.println("----------------------------");
			}
	}


package javaAriketak;
import java.util.Random; //IA
import java.util.Scanner;

public class LaQuiniela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random(); //IA: Zenbaki aleatorioak generatuko ditu.

        int asmatuDitu = 0;
        String[] aukerak = {"1", "X", "2"};
        
       //IA: Array -a sortuko dugu benetako emaitzak emateko modu aleatorioan.
        String[] emaitzak = new String[15]; //IA.
        for (int i = 0; i < 15; i++) {
        	int indice = rnd.nextInt(3); //IA: Itzuliko digu (0, 1 edo 2).
        	emaitzak[i] = aukerak[indice]; //IA.
        }
        
        String[] pronostikoak = new String[15]; //IA: Array -a erabiltzailearen pronostikoak gordetzeko.

                for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + ". PARTIDOA:"); //IA:  Erakutziko du partidoaren zenbakia (1 gehitzen dugu 1-etik hasteko).

            switch (i + 1) { //IA erabili izan behar nuen case komandoa ondo funtzionatzeko / erabili ahal izateko.
                case 1: System.out.println("Athletic Club VS Barça"); break;
                case 2: System.out.println("Real Madrid VS Real Sociedad"); break;
                case 3: System.out.println("Valencia C.F. VS Atlético de Madrid"); break;
                case 4: System.out.println("Betis VS Sevilla C.F."); break;
                case 5: System.out.println("Villarreal C.F. VS Celta de Vigo"); break;
                case 6: System.out.println("Deportivo de la Coruña VS Malaga C.F."); break;
                case 7: System.out.println("Zaragoza C.F. VS R.C.D. Espanyol"); break;
                case 8: System.out.println("Deportivo Alavés VS C.D. Mirandés"); break;
                case 9: System.out.println("Sporting de Gijón VS Cádiz C.F."); break;
                case 10: System.out.println("C.A. Osasuna VS S.D. Eibar"); break;
                case 11: System.out.println("R.C.D. Huelva VS Burgos C.F."); break;
                case 12: System.out.println("Levante U.D. VS Real Valladolid"); break;
                case 13: System.out.println("R.C.D. Mallorca VS U.D. Las Palmas"); break;
                case 14: System.out.println("Granada C.F. VS Rayo Vallecano"); break;
                case 15: System.out.println("Getafe C.F. VS Gimnástic de Tarragona"); break;
            }

            String entrada; //IA.
            while (true) { //IA.
            System.out.println("Idatzi zure pronostikoa (1 / X / 2): ");
            entrada = sc.next().toUpperCase(); //IA.
            if (entrada.equals("1") || entrada.equals("X") || entrada.equals("2")) { break; //IA.
            } else { //IA
            	System.out.println("Balio okerra. Mesedez, sartu 1, X edo 2.");
            }
            }
            pronostikoak[i] = entrada;
            System.out.println();
        }
          for (int i = 0; i < 15; i++) { //IA.
        	  String real = emaitzak[i]; //IA.
        	  String tu = pronostikoak[i]; //IA.
        	  boolean asmatu = real.equals(tu);
        	  if (asmatu) asmatuDitu++;
        	  System.out.println((i + 1) + ". Partidoa -> Benetako emaitza: " + real + " | Zure pronostikoa: " + tu + " --> " + (asmatu ? "ASMATU DITUZU" : "EZ DITUZU ASMATU"));
        }

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
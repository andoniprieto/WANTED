package javaAriketak; // Programa dagoen karpeta. // Carpeta donde está el programa.


import java.util.Random; // Ausazko zenbakiak sortzeko. // Para generar números aleatorios.
import java.util.Scanner; // Erabiltzaileak idazten duena irakurtzeko. // Para leer lo que escribe el usuario.


public class LaQuiniela { // Klase nagusiaren hasiera. // Inicio de la clase principal.
    public static void main(String[] args) { // Programaren hasiera. Inicio del programa.
        Scanner sc = new Scanner(System.in); // Teklatu irakurgailu bat sortzen du. // Crea un lector de teclado.
        Random rnd = new Random(); // Ausazko zenbakien sorgailu bat sortzen du. // Crea un generador de números aleatorios.
        int asmatuDitu = 0; // Iragarpen egokien kontagailua. // Contador de pronósticos acertados.
        String[] aukerak = {"1", "X", "2"}; // Ausazko zenbakien sorgailu bat sortzen du. // Opciones posibles de cada partido.


        // -----------------------------
        // Ausazko zenbakien sorgailu bat sortzen du: // Generar resultados aleatorios de los primeros 14 partidos:
        // -----------------------------
        String[] emaitzak = new String[14]; // Array benetako emaitzak gordetzeko. // Array para guardar resultados reales.
        for (int i = 0; i < 14; i++) { // 14 partidoak zeharkatzen ditu. // Recorre los 14 partidos.
            int indice = rnd.nextInt(3); // 0 eta 2 arteko ausazko zenbakia. // Número aleatorio entre 0 y 2.
            emaitzak[i] = aukerak[indice]; // Gorde "1", "X" edo "2" zenbakiaren arabera. // Guarda "1", "X" o "2" según el número.
        }


        // -----------------------------
        // Erabiltzaileari pronostikoak eskatzea: // Pedir pronósticos al usuario:
        // -----------------------------
        String[] pronostikoak = new String[14]; // Pronostikoak gordetzeko array. // Array para guardar pronósticos.
        for (int i = 0; i < 14; i++) { // 14 partidoak zeharkatzen ditu. // Recorre los 14 partidos.
            System.out.println((i + 1) + ". PARTIDOA:"); // Partida-zenbakia erakusten du. // Muestra el número de partido.
            // Erakutsi taldeak partidaren arabera. // Mostrar los equipos según el partido.
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


            // Erabiltzaileak balio baliodun bat sartzea ziurtatzen duen begizta. // Bucle que asegura que el usuario introduzca un valor válido.
            String entrada;
            while (true) {
                System.out.println("Idatzi zure pronostikoa (1 / X / 2): ");
                entrada = sc.next().toUpperCase(); // Bihurtu maiuskula. // Convierte a mayúscula.
                if (entrada.equals("1") || entrada.equals("X") || entrada.equals("2")) {
                    break; // Begiztatik ateratzen da, baliozkoa bada. // Sale del bucle si es válido.
                } else {
                    System.out.println("Balio okerra. Mesedez, sartu 1, X edo 2.");
                }
            }
            pronostikoak[i] = entrada; // Gorde pronostikoa. // Guarda el pronóstico.
            System.out.println(); // Lerro jauzia partidak bereizteko. // Línea en blanco para separar partidos.
        }


        // -----------------------------
        // 15. partida: Golen pronostiko zehatza. // Partido 15: pronóstico exacto de goles.
        // -----------------------------
        String[] aukerak2 = {"0", "1", "2", "M"}; // Gol-aukerak. // Opciones de goles.
        String[] predikzioa15 = new String[2]; // 15. partidako iragarpenak. // Pronósticos del 15º partido.
        String[] emaitzak15 = new String[2]; // 15. partidako emaitza errealak. // Resultados reales del 15º partido.


        System.out.println("15. PARTIDOA:\nDeportivo Alavés VS C.D. Mirandés");
        System.out.println("Sartu bi taldeak sartuko dituen gol kantitate zehatza:");


        // 15. partidaren ausazko emaitzak sortzea. // Generar resultados aleatorios del partido 15.
        for (int h = 0; h < 2; h++) {
            int indice2 = rnd.nextInt(4); // 0 eta 3 arteko ausazko zenbakia. // Número aleatorio entre 0 y 3.
            emaitzak15[h] = aukerak2[indice2]; // Gorde benetako emaitza. // Guarda el resultado real.
        }


        // Pronostikoak eskatu Deportivo Alavesentzat. // Pedir pronósticos para Deportivo Alavés.
        int j = 0; // predikzioa15 gordetzeko indizea. // Índice para guardar en predikzioa15.
        String entrada15;
        while (true) {
            System.out.println("Sartu Deportivo Alavés sartuko dituen gol kantitate zehatza:");
            System.out.println("Idatzi zure pronostikoa (0 / 1 / 2 / M): ");
            entrada15 = sc.next().toUpperCase();
            if (entrada15.equals("0") || entrada15.equals("1") || entrada15.equals("2") || entrada15.equals("M")) {
                break;
            } else {
                System.out.println("Balio okerra. Mesedez, sartu 0, 1, 2 edo M.");
            }
        }
        predikzioa15[j] = entrada15; // Pronostikoa gorde. // Guardar pronóstico.
        j++;


        // C.D. Mirandesentzat pronostikoak eskatzea. // Pedir pronósticos para C.D. Mirandés.
        while (true) {
            System.out.println("Sartu C.D. Mirandés sartuko dituen gol kantitate zehatza:");
            System.out.println("Idatzi zure pronostikoa (0 / 1 / 2 / M): ");
            entrada15 = sc.next().toUpperCase();
            if (entrada15.equals("0") || entrada15.equals("1") || entrada15.equals("2") || entrada15.equals("M")) {
                break;
            } else {
                System.out.println("Balio okerra. Mesedez, sartu 0, 1, 2 edo M.");    
            }
        }
        predikzioa15[j] = entrada15;


        // 15. partidako bi golak asmatu zituen egiaztatu. // Comprobar si acertó ambos goles del partido 15.
        if (emaitzak15[0].equals(predikzioa15[0]) && emaitzak15[1].equals(predikzioa15[1])) {
            asmatuDitu++;
        }


        // -----------------------------
        // Pronostikoak lehen 14 partidetako emaitzekin alderatzea. // Comparar pronósticos con resultados de los primeros 14 partidos.
        // -----------------------------
        for (int i = 0; i < 14; i++) {
            String real = emaitzak[i]; // Benetako emaitza. // Resultado real.
            String tu = pronostikoak[i]; // Erabiltzailearen pronostikoa. // Pronóstico del usuario.
            boolean asmatu = real.equals(tu); // Asmatu duen egiaztatu. // Comprobar si acertó.
            if (asmatu) asmatuDitu++; // Si acertó, sumar al contador. // Si acertó, sumar al contador.
            System.out.println((i + 1) + ". Partidoa -> Benetako emaitza: " + real + 
                               " | Zure pronostikoa: " + tu + 
                               " --> " + (asmatu ? "ASMATU DITUZU" : "EZ DITUZU ASMATU"));
        }


        // Erakutsi 15. partidaren emaitza. // Mostrar resultado del 15º partido.
        System.out.println("15. Partidoa --> Benetako emaitza: Deportivo Alavés " + emaitzak15[0] + 
                           " C.D. Mirandés " + emaitzak15[1]);


        // Erakutsi zenbakia asmatutakoen arabera. // Mostrar número total de aciertos
        System.out.println("\nZure pronostikotik " + asmatuDitu + " asmatu dituzu.");


        // Erakutsi saria asmatutakoen arabera. // Mostrar premio según aciertos.
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


        sc.close(); // Itxi Scanner. // Cerrar el Scanner
    }
}
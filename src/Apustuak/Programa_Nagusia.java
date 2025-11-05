package Apustuak;

import java.util.Scanner;

public class Programa_Nagusia {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("1 = Primitiva");
System.out.println("2 = La Quiniela");
System.out.println("3 = Euromillones");
System.out.println("0 = Amaitu");
System.out.println("Sartu zenbaki bat 0tik - 3-ra");
int Aukera=sc.nextInt();

while (Aukera !=0) {

switch (Aukera) {
case 0:
System.out.println("Programa amaitu da");
break;

case 1:
System.out.println("Exekutatu Primitva programa");
break;

case 2:
System.out.println("Exekutatu La Quiniela programa");
break;

case 3:
Euromillones euromillonea = new Euromillones();
euromillonea.EuromilloiaExekutatu();
break;

default: System.out.println("Zenbaki desegokia, sartu zenbaki balioduna (0-3)");
	
	}
System.out.println("1 = Primitiva");
System.out.println("2 = La Quiniela");
System.out.println("3 = Euromillones");
System.out.println("0 = Amaitu");
System.out.println("Sartu zenbaki bat 0tik - 3-ra");
Aukera=sc.nextInt();

}
}
}
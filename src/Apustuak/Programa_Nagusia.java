package Apustuak;

import java.util.Scanner;

public class Programa_Nagusia {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Sartu zenbaki bat 0tik (Programa amaiera) - 3-ra (Programa aukeraketa)");
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
System.out.println("Exekutatu Euromillones programa");
break;
default: System.out.println("Zenbaki desegokia, sartu zenbaki balioduna");
	
	}
Aukera=sc.nextInt();

}
}
}
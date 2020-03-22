import java.util.Scanner;

public class Datumerweiterung {

	public static int j;   
	public static int m;   
	public static int t;  
	public static int s;   
	public static int m1;  
	public static int m2;  
	public static int mintemp;	// Minute temp 
	
	static String eingabe;
	static String calc = "n";
	
	static int[] monlaeng = new int[]  {31, 28, 31,   30, 31, 30,  	31, 31, 30,   31, 30, 31};
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		do  {

			System.out.println();
			System.out.println("Diese Programm addiert zu einem Datum eine bestimmte Menge an Minuten");
			System.out.println("Bitte geben sie ein Datum im Format 1.Jahr  2.Monat  3.Tag  4.Stunde  5.Minute  6.Minuten-Summand   mit Leerzeichen ein");
			
			j = sc.nextInt();   	// Jahr
			m = sc.nextInt();		// Monat
			t = sc.nextInt();		// Tag
			s = sc.nextInt();		// Stunde
			m1 = sc.nextInt();		// Minute
			m2 = sc.nextInt();		// Delta-Minute
		

			hochrechnenTage();
			berechneDatum();
			System.out.println();
			System.out.println("Ergebnis");		
			System.out.println(j + " " + m + " " + t + " " + s + " " + m1);
		
			System.out.println("Möchten sie eine neue Berechnung j/n ?");
			calc = sc.next();
				
		} while(calc.toString() != "j");

		System.out.println(calc);
		sc.close();	
	}	
	
				
	
	private static void berechneDatum() {

		while(t > monlaeng[m-1])  {
			m++;
			t-= monlaeng[m-2];
			
			while(m > 12)  {
				j++;
				m-= 12;
			}
		}

	}


	private static void hochrechnenTage() {
		
		mintemp = m1 + m2;    		//Summe Minuten
		m1 = mintemp % 60;			//Erzeugung der Rest_Minuten

	
		while (mintemp/60 > 0)  {
			s++;
			mintemp-= 60;
				
			if(s > 23)  {
				t++;
				s-=24;	
			}
		}

	}

}


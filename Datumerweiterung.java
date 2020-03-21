import java.util.Scanner;

public class Datumerweiterung {

	public static int j;   
	public static int m;   
	public static int t;  
	public static int s;   
	public static int m1;  
	public static int m2;  
	public static int min;	// Minute temp 
	
	int[] monlaeng = new int[]  {31, 28, 31,   30, 31, 30,  	31, 31, 30,   31, 30, 31};

	
	public static void main(String[] args) {

		System.out.println("Diese Programm addiert zu einem Datum eine bestimmte Menge an Minuten");
		System.out.println();
		System.out.println("Bitte geben sie ein Datum im Format Jahr Monat Tag Stunde Minute mit Leerzeichen ein");
				
		Scanner sc = new Scanner(System.in);
		
		j = sc.nextInt();   	// Jahr
		m = sc.nextInt();		// Monat
		t = sc.nextInt();		// Tag
		s = sc.nextInt();		// Stunde
		m1 = sc.nextInt();		// Minute
		m2 = sc.nextInt();		// Delta-Minute
		

				
//		System.out.println(j + " " + m +" "+ t + " " + s + " " + m1 + " " + m2);
		
		
	
		// 1. Berechnen der Minute ab 1600 M1 T1 S1 M0
		// 2. Aufaddieren der Minuten m2
		// 3. Umrechten in das Datumsformat
		
		berechneMinuteabStartdatum();
			
		
	}

	private static void berechneMinuteabStartdatum() {
		
		for(int i = 1; m; i++)  {
			
			MinuteinJahr = MinuteimJahr + (monlaeng[i] *  
		}
			
		

		min = j * 
		
		
	}

}


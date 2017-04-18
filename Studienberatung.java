import java.util.*;
public class Studienberatung{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Hast du Abitur?");
		String eingabe = scanner.next();
		if(eingabe.equals("ja")){
			System.out.println("Bist du wissbegierig?");
			eingabe = scanner.next();
			if(eingabe.equals("ja")){
				System.out.println("Auf jeden Fall studieren!");
			}
			else{
				System.out.println("Nicht studieren.");
			}
		}
		else{
			System.out.println("Hast du Fachabitur?");
			eingabe = scanner.next();
			if(eingabe.equals("ja")){
				System.out.println("Hast du eine Berufsausbildung?");
				eingabe = scanner.next();
				if(eingabe.equals("ja")){
					 
				}
				else{
					System.out.println("Besser noch studieren.");
				}
			}
			else{
				System.out.println("Nicht studieren.");
			}
		}
		
	}
}
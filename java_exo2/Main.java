package java_exo2;

import java.util.Scanner;
import java.util.UUID;


public class Main {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		var input=new Scanner(System.in);
	    final int nbEssaisMax=3;
	    int tentative=0;
	    
	
 
	    System.out.println("Merci de compléter les informations suivantes");
		// Ne sert pas car autogenere
		// System.out.printf("ID : ");
		String id = UUID.randomUUID().toString();
		System.out.printf("Nom : ");
		String nom=input.next();
		System.out.printf("Prenom : ");
		String prenom=input.next();
		System.out.printf("Email : ");
		String email=input.next();
		System.out.printf("Mot de passe : ");
		String password=input.nextLine();

		
		
/*		if (Validate.isEmail(email)==true && Validate.isPassword(password)==true)   {
			System.out.println("Compte créé !");
		} else {
			tentative++;
		}
	*/	
		
		if (Validate.isEmail(email)==true && Validate.isPassword(password)==true)   {
		System.out.println("Compte créé !");
	} else {
		tentative++;
	}
		
	}

}

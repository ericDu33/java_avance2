package java_exo2;


public class Users {
	private String id;
	private String nom;
	private String prenom;
	private String email;
	private String password;

	// creation du constructeur qui va affecter les variables entre parentheses aux attributs
	public Users(String id, String nom, String prenom,String email,String password)
	{
	
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		
	}

}
/*System.out.println("Id : ");
input id=input.nextInt();
input.nextLine();

System.out.print("Votre nom : ");
String nom=input.next();

System.out.print("Votre prenom : ");
String prenom=input.next();

System.out.print("Votre email : ");
String nom=input.next();

System.out.print("Votre mot de passe : ");
String prenom=input.nextLine();
*/
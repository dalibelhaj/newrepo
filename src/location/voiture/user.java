package location.voiture;

public class user {

	private String nom;
	private String prenom;
	private int Cin;
	
	public user(int cin,String nom,String prenom)
	{
	this.nom=nom;
	this.Cin=cin;
	this.prenom=prenom; 
		
	}
	public int getcin() {
		
		return Cin;
	}
	
	public String getnom() {
		
		return nom;
	}
	public String getprenom() {
		
		return prenom;
	}
	
}

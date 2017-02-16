
public class Capitale extends Ville {
	private String monument;
	
	public Capitale(){
		super();
		monument = "aucun";
		}
	
	public Capitale(String nom, String pays, int hab, String monument){
		super(nom, pays, hab);
		this.monument = monument;
	}
	
	public void afficher(){
		super.afficher();
		System.out.println("\n\t ===>" +this.monument+ " en est un monument notable");
	}
	
	public String toString(){
		String str = super.toString() + "\n\t ===>" +this.monument+ " en est un monument notable";
		return str;
	}
	
	public String getMonument(){
		return this.monument;
	}
	
	public void setMonument(String monument){
		this.monument = monument;
	}
	
}

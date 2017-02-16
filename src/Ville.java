public class Ville {
	
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;
	
	public Ville(){
		System.out.println("Cr�ation d'une ville ! \n");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	public Ville(String pNom, String pPays, int pNbre)
	{
		System.out.println("Cr�ation d'une ville avec param�tres ! \n");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	// ACCESSEURS :
	
	public String getNom(){
		return nomVille;
	}
	
	public String getNomPays(){
		return nomPays;
	}
	
	public int getNbreHabitants(){
		return nbreHabitants;
	}
	
	public static int getNbreInstancesBis(){
		return nbreInstancesBis;
	}
	
	// MUTATEURS :
	
	public void setNom(String pNom){
		nomVille = pNom;
	}
	
	public void setNomPays(String pNomPays){
		nomPays = pNomPays;
	}
	
	public void setNbreHabitants(int pNbre){
		nbreHabitants = pNbre;
		this.setCategorie();
	}
	
	protected void setCategorie(){
		
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'H'};
		
		int i = 0;
		while(i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;
		
		this.categorie = categories[i];
	}
	
	public String afficher(){
		return "\t" +this.nomVille+ " est une ville situ�e en " +this.nomPays+ ", elle comporte : " +this.nbreHabitants+ " habitant(s), ce qui en fait une ville de cat�gorie : " +this.categorie;
	}
	
	public String toString(){
		return "\t" +this.nomVille+ " est une ville situ�e en " +this.nomPays+ ", elle comporte : " +this.nbreHabitants+ " habitant(s), ce qui en fait une ville de cat�gorie : " +this.categorie;
	}
	
	public String comparer(Ville A){
		String str = new String();
		
		if(A.getNbreHabitants() > this.nbreHabitants)
			str = A.getNom()+" est une ville plus peupl�e que " +this.nomVille;
		else
			str = this.nomVille + " est une ville moins peupl�e que " + A.getNom();
		return str;
	}
	
}

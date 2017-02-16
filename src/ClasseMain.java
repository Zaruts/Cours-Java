
public class ClasseMain {

	public static void main(String[] args) {
		
		Ville[] tableau = new Ville[6];
		
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {100, 1000, 456, 1000000, 50000, 5000000};
		
		for(int i = 0; i<6; i++){
			if(i < 3){
				Ville V = new Ville(tab[i], "France", tab2[i]);
				tableau[i] = V;
			}
			else{
				Capitale C = new Capitale(tab[i], "France", tab2[i], "la Tour Eiffel");
				tableau[i] = C;
			}
		}
		
		for(Ville V : tableau){
			V.afficher();
		}

	}
	
		
	
}

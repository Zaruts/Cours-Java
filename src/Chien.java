
public class Chien extends Canin{
	
	public Chien(){
		
	}
	
	public Chien(String couleur, Integer poids){
		this.couleur = couleur;
		this.poids = poids;
	}
	
	void crier(){
		System.out.println("J'aboie comme un con sans raison");
	}

}

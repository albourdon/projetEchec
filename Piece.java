/**
 * Classe g�n�rique d'une Pi�ce de l'�chiquier
 * @author ALAIN BOURDON
 *
 */
public abstract class Piece implements Deplacement {
	String couleur; // W or B


	public Piece() {
	}
	/**
	 * 
	 * @param couleur
	 */
	public Piece(String couleur) {
		this.couleur=couleur;
	}
	/**
	 * 
	 * 
	 */
	public String getCouleur() {
		return couleur;
	}
	/**
	 * 
	 * @param couleur
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	/**
	 * 
	 */
	
}

/**
 * Classe regroupant les information d'une case de l'échiquier
 * @author ALAIN BOURDON
 *
 */
public class Case {


	char abscisse;

	int ordonnee;

	Piece unePiece;	

	public Case() {
	}
	/**
	 * 
	 * @param abscisse
	 * @param ordonnee
	 */
	public Case(char abscisse,int ordonnee ) {
		this.abscisse=abscisse;
		this.ordonnee=ordonnee;
	}
	/**
	 * 
	 * 
	 */
	public char getAbscisse() {
		return abscisse;
	}
	/**
	 * 
	 * @param abscisse
	 */
	public void setAbscisse(char abscisse) {
		this.abscisse = abscisse;
	}
	/**
	 * 
	 * 
	 */
	public int getOrdonnee() {
		return ordonnee;
	}
	/**
	 * 
	 * @param ordonnee
	 */
	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	public Piece getUnePiece() {
		return unePiece;
	}
	/**
	 * 
	 * @param unePiece
	 */
	public void setUnePiece(Piece unePiece) {
		this.unePiece = unePiece;
	}
}

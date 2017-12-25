

/**
 * Gestion de l'échiquier
 * @author ALAIN BOURDON
 *
 */
public class Echiquier {
	/**
	 * Tableau des cases de l'échiquier
	 */
	Case[]tabCases ;
	/**
	 * Tableau des abscisses de l'échiquier
	 */
	static int []tabV = {1,2,3,4,5,6,7,8};
	/**
	 * Tableau des ordonnées de l'échiquier
	 */
	static char[]tabH = {'a','b','c','d','e','f','g','h'};
	/**
	 * 
	 */
	public Echiquier() {
		tabCases = new Case[64];
	}
	/**
	 * 
	 * @return cases de l'échiquier
	 */
	public Case[] getTabCases() {
		return tabCases;
	}
	/**
	 * 
	 * @param tabCases
	 */
	public void setTabCases(Case[] tabCases) {
		this.tabCases = tabCases;
	}
	
}

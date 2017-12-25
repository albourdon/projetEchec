

/**
 * Gestion de l'�chiquier
 * @author ALAIN BOURDON
 *
 */
public class Echiquier {
	/**
	 * Tableau des cases de l'�chiquier
	 */
	Case[]tabCases ;
	/**
	 * Tableau des abscisses de l'�chiquier
	 */
	static int []tabV = {1,2,3,4,5,6,7,8};
	/**
	 * Tableau des ordonn�es de l'�chiquier
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
	 * @return cases de l'�chiquier
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



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

	/**
	 * Cr�ation de l'�chiquier
	 */
	public  void  creerEchiquier(){
		int i=0;
		for (int k = 0; k < tabV.length; k++) {
			for (int j = 0; j <tabH.length; j++) {
				//System.out.print("cases i "+i+" h "+tabH[j]+" v "+tabV[k]);
				this.tabCases[i]=new Case();
				this.tabCases[i].setAbscisse(tabH[j]);
				this.tabCases[i].setOrdonnee(tabV[k]);
				i++;
			}
		}

	}
	/**
	 * Dupliquer un �chiquier
	 */
	public  Echiquier  dupliqueEchiquier(){
		Echiquier cloneEchiquier = new Echiquier();
		for (int i = 0; i < tabCases.length; i++) {
			cloneEchiquier.tabCases[i] = tabCases[i].clone();
		}
		return cloneEchiquier;
	}

}

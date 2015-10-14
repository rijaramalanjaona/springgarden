package org.yannart.springgarden;

public interface IParcelle {
	
	/**
	 * Arrose les plantes de la parcelle du jardin.
	 * 
	 * @param quantite
	 *            quantite d'eau a verser sur chaque plante.
	 */
	public abstract void arroser(final int quantite);
	
	/**
	 * Met de l'engrais a chaque plante de la parcelle du jardin.
	 * 
	 * @param quantite
	 *            quantite d'engrais a mettre sous chaque plante.
	 */
	public abstract void mettreEngrais(final int quantite);
	
	/**
	 * Affiche les plantes de la parcelle.
	 */
	public abstract void listerPlantes();
	
	/**
	 * Positionne les plantes de facon aleatoire.
	 */
	public abstract void melanger();
	
	/**
	 * Obtient le nom de la parcelle.
	 * 
	 * @return nom de la parcelle.
	 */
	public abstract String getNom();
}

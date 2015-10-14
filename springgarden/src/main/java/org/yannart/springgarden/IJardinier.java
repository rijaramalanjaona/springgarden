package org.yannart.springgarden;

public interface IJardinier {
	/**
	 * Obtient le nom du jardinier.
	 * 
	 * @return le nom du jardinier.
	 */
	public abstract String getNom();
	
	/**
	 * Definit le nom du jardinier.
	 * 
	 * @param nom
	 *            nom du jardinier
	 */
	public void setNom(String nom);
}

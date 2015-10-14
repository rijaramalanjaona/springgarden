package org.yannart.springgarden;

public interface IJardin {
	/**
	 * S'occuper du jardin en nourrissant ses plantes.
	 */
	public abstract void jardiner();
	
	/**
	 * Arrose chaque parcelle du jardin.
	 */
	public abstract void arroser();
	
	/**
	 * Met de l'engrais dans chaque parcelle du jardin.
	 */
	public abstract void mettreEngrais();
	
	/**
	 * Affiche les plantes de chaque parcelle.
	 */
	public abstract void listerParcelles();
	
}

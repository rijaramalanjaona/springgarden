package org.yannart.springgarden;

public class Jardinier implements IJardinier {
	
	/**
	 * Nom du jardinier.
	 */
	private String nom;
	
	/**
	 * {@inheritDoc}
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Monsieur " + nom;
	}
	
}

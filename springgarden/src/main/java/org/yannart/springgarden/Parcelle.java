package org.yannart.springgarden;

import java.util.Collections;
import java.util.List;

/**
 * Une parcelle du jardin contient des plantes.
 */
public class Parcelle implements IParcelle {
	
	/**
	 * Plantes de la zone
	 */
	private List<IPlante> plantes;
	
	/**
	 * Nom de la zone
	 */
	private String nom;
	
	/**
	 * {@inheritDoc}
	 */
	public void arroser(final int quantite) {
		System.out.println(toString() + ":");
		
		for (IPlante plante : plantes) {
			plante.nourriEau(quantite);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void mettreEngrais(final int quantite) {
		System.out.println(toString() + ":");
		
		for (IPlante plante : plantes) {
			plante.nourriEngrais(quantite);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void listerPlantes() {
		System.out.println(toString() + ":");
		
		for (IPlante plante : plantes) {
			System.out.println("    " + plante.getDetail());
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void melanger() {
		Collections.shuffle(plantes);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return nom;
	}
	
	/**
	 * Definit les plantes de la parcelle.
	 * 
	 * @param plantes
	 *            plantes de la parcelle.
	 */
	public void setPlantes(List<IPlante> plantes) {
		this.plantes = plantes;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Definit le nom de la parcelle.
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

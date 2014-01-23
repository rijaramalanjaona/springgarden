package org.yannart.springgarden;

import org.springframework.stereotype.Component;

/**
 * Classe abstraite que declare les methodes communes a toutes les plantes
 */
@Component
public class Plante implements IPlante {

    /**
     * Nom de la plante.
     */
    private String nomPlante;

    /**
     * Quantite d'eau recue.
     */
    private int eau;

    /**
     * Quantite d'engrais recu.
     */
    private int engrais;

    /**
     * {@inheritDoc}
     */
    @Override
    public void nourriEau(final int quantite) {
	System.out.println("    - arrose la plante " + nomPlante + " avec "
		+ quantite + "ml d'eau");
	eau += quantite;
	System.out.println("     --> " + nomPlante + " a maintenant " + eau
		+ "ml d'eau");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void nourriEngrais(final int quantite) {
	System.out.println("    - met " + quantite + "g d'engrais a la plante "
		+ nomPlante);
	engrais += quantite;
	System.out.println("     --> " + nomPlante + " a maintenant " + engrais
		+ "g d'engrais");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
	return nomPlante;
    }

    /**
     * {@inheritDoc}
     */
    public String getDetail() {
	return "- " + nomPlante + " avec " + eau + "ml d'eau et " + engrais
		+ "g d'engrais";
    }

    /**
     * {@inheritDoc}
     */
    public String getNomPlante() {
	return nomPlante;
    }

    /**
     * Definit le nom de la plante.
     * 
     * @param nomPlante
     *            nom de la plante.
     */
    public void setNomPlante(String nomPlante) {
	this.nomPlante = nomPlante;
    }
}

package org.yannart.springgarden;

import org.springframework.stereotype.Component;

/**
 * Mauvaise herbe.
 */
@Component
public class MauvaiseHerbe extends Plante {

    /**
     * Construit une plante de mauvaise herbe.
     */
    public MauvaiseHerbe() {
	super.setNomPlante("MauvaiseHerbe");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void nourriEau(int quantite) {
	System.out.println("    ** La mauvaise herbe vole l'eau !! **");
	super.nourriEau(quantite);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void nourriEngrais(int quantite) {
	System.out.println("    ** La mauvaise herbe vole l'engrais !! **");
	super.nourriEngrais(quantite);
    }
}

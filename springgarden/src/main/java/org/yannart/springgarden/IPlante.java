package org.yannart.springgarden;

public interface IPlante {
    /**
     * Nourri la plante en eau.
     * 
     * @param quantite
     *            quantite d'eau.
     */
    public abstract void nourriEau(int quantite);

    /**
     * Nourri la plante en engrais.
     * 
     * @param quantite
     *            quantite d'engrais.
     */
    public abstract void nourriEngrais(int quantite);

    /**
     * Affiche en detail la plante.
     * 
     * @return detail de la plante.
     */
    public abstract String getDetail();

    /**
     * Obtient le nom de la plante.
     * 
     * @return nom de la plante.
     */
    public abstract String getNomPlante();

}

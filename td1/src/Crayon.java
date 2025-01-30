/**
 * Classe Crayon
 *
 * @author Pellosse Quentin
 * @version 1.0
 */

public class Crayon {
  private final float prix;
  private final String marque;
  private final String couleur;
  private int qte = QTEBASE;

  /**
   * Quantité de crayon
   */
  public static final int QTEBASE = 100;

  /**
   * Quantité de crayon maximum
   */

  public static final int QTEMAXBASE = 1000;

  /**
   * Constructeur de la classe Crayon
   * 
   * @param marque  : marque du crayon
   * @param couleur : couleur du crayon
   * @param prix    : prix du crayon
   */

  public Crayon(String marque, String couleur, float prix) {
    this.marque = marque;
    this.couleur = couleur;
    this.prix = prix;
  }

  /**
   * Autre constructeur de la classe Crayon
   *
   * @param marque  : marque du crayon
   * @param couleur : couleur du crayon
   * @param prix    : prix du crayon
   * @param qte     : quantite de crayon
   */

  public Crayon(String marque, float prix, String couleur, int qte) {
    this(marque, couleur, prix);
    if (qte >= 0 && qte <= QTEMAXBASE) {
      this.qte = qte;
    }
  }

  /**
   * Accesseur de la quantite de crayon
   *
   * @return quantite de crayon
   */

  public int getQte() {
    return qte;
  }

  /**
   * Accesseur de la marque du crayon
   *
   * @return marque du crayon
   */

  public String getMarque() {
    return marque;
  }

  /**
   * Accesseur de la couleur du crayon
   *
   * @return couleur du crayon
   */

  public String getCouleur() {
    return couleur;
  }

  /**
   * Accesseur de la prix du crayon
   *
   * @return prix du crayon
   */

  public float getPrix() {
    return prix;
  }

  /**
   * Méthode toString
   *
   * return une chaîne de caractères représentant l'objet
   *
   * @return chaîne de caractères représentant l'objet
   */

  public String toString() {
    return "Crayon " + marque + " de couleur " + couleur + " de prix " + prix + " à " + qte + " unité(s)";
  }

  /**
   * Défini la quantité de crayon
   *
   * @param quantite
   */

  public void setQte(int quantite) {
    if (quantite >= 0 && quantite <= QTEMAXBASE) {
      this.qte = quantite;
    }
  }

}

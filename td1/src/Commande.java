/**
 * Classe Commande
 *
 * @author Pellosse Quentin
 * @version 1.0
 */

public class Commande {
  public static final int MAX_ACHATS = 100;
  public static int nbCommandes = 0;

  private int numeroCommande;
  private Client papeterie;
  private String laDate;
  private Crayon[] achats = new Crayon[MAX_ACHATS];
  private int nbAchats;

  public Commande(Client client, String date) {
    this.papeterie = client;
    this.laDate = date;
    numeroCommande = ++nbCommandes;
  }

  /*
   * Ajouter un nouvel article à une commande, par la donnée des caractéristiques
   * du crayon et sa quantité
   * 
   * @param crayon
   * 
   * @param quantiteè
   */

  public void ajouterArticle(String couleur, String marque, float prix, int quantite) {
    if (quantite > 0 && quantite <= MAX_ACHATS) {
      Crayon crayon = new Crayon(marque, couleur, prix, quantite);
      achats[nbAchats++] = crayon;
    }
  }

  /**
   * Accesseur a un articles dans la commande
   *
   * @param indice
   * @return un articles dans la commande
   */

  public Crayon getArticle(int indice) {
    if ((indice >= 0) && (indice < nbAchats)) {
      return achats[indice];
    }
    return null;
  }

  /**
   * Modifie la quantité d'un article dans la commande
   *
   * @param indice
   * @param quantite
   * @return true si la quantité a été modifiée, false sinon
   */

  public boolean modifierArticle(int indice, int quantite) {
    if ((indice >= 0) && (indice < nbAchats) && (quantite > 0)) {
      return achats[indice].setQte(quantite);
    }
    return false;
  }

  /**
   * Calcule le prix total de la commande en tenant compte de la remise
   *
   * @return le prix total de la commande en tenant compte de la remise
   */

  public float calculerPrix() {
    float prix = 0;
    for (int i = 0; i < nbAchats; i++) {
      prix += achats[i].getPrix() * achats[i].getQte();
    }
    prix = prix * (1 - papeterie.getRemise());
    return prix;
  }

}

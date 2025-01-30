/**
 * Classe Client
 *
 * @author Pellosse Quentin
 * @version 1.0
 */

public class Client {
  private final String nom;
  private final String SIRET;
  private final String ville;

  private float remise;

  public Client(String nom, String siret, String ville) {
    this.nom = nom;
    this.SIRET = siret;
    this.ville = ville;
  }

  public Client(String nom, String siret, String ville, float remise) {
    this(nom, siret, ville);
    this.remise = remise;
  }

  public String getNom() {
    return nom;
  }

  /**
   * Affiche le nom du client avec le SIRET la ville et la remise
   * 
   * @return le nom du client avec le SIRET la ville et la remise
   */

  @Override
  public String toString() {
    return "Client " + nom + " (SIRET: " + SIRET + ") de " + ville +
        " avec une remise de " + remise + "%";
  }

  /**
   * retourne la remise
   * 
   * @return la remise
   */
  public float getRemise() {
    return remise;
  }

  /**
   * Définit la nouvelle remise
   * 
   * @param remise la nouvelle remise
   */
  public void setRemise(float remise) {
    this.remise = remise;
  }

}

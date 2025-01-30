/*
 * Class Train
 *
 * @author Pellosse Quentin
 * 
 * @version 1.0
 */

public class BilletsTrain implements Billets {
  private final String villeDepart;
  private final String villeArrivee;
  private final int nombreKilometres;
  private final int nombrePersonnes;
  private final float reduction;

  public BilletsTrain(String villeDepart, String villeArrivee, int nombreKilometres, int nombrePersonnes,
      float reduction) {
    this.villeDepart = villeDepart;
    this.villeArrivee = villeArrivee;
    this.nombreKilometres = nombreKilometres;
    this.nombrePersonnes = nombrePersonnes;
    this.reduction = reduction;
  }

  /*
   * Renvoie la ville de départ
   *
   * @return la ville de départ
   */
  @Override
  public String getVilleDepart() {
    return villeDepart;
  }

  /*
   * Renvoie la ville d'arrivée
   *
   * @return la ville d'arrivée
   */
  @Override
  public String getVilleArrivee() {
    return villeArrivee;
  }

  /*
   * Renvoie le nombre de kilomètres parcourus
   *
   * @return le nombre de kilomètres parcourus
   */
  @Override
  public int getNombreKilometres() {
    return nombreKilometres;
  }

  /*
   * Renvoie le nombre de personnes
   *
   * @return le nombre de personnes
   */
  @Override
  public int getNombrePersonnes() {
    return nombrePersonnes;
  }

  /*
   * Renvoie la réduction
   *
   * @return la réduction
   */
  @Override
  public float getReduction() {
    return reduction;
  }

  /*
   * Renvoie le prix du billet
   *
   * @return le prix du billet
   */
  @Override
  public int prixBillet() {
    return 10 * this.nombreKilometres * this.nombrePersonnes;
  }

  /*
   * Affiche les détails du billet
   *
   * @return le billet
   */
  @Override
  public String toString() {
    return "Billet de train. \n" + billetToString();
  }
}

/*
 * Class AgenceDeVoyages
 *
 * @author Pellosse Quentin
 * 
 * @version 1.0
 */

public class Voyages {
  private final String nom;
  private final String prenom;
  private final int nombreDePersonnes;
  private final int MAX_BILLETS = 10;
  private final Billets[] billtes = new Billets[MAX_BILLETS];
  private int nbBillets;

  public Voyage(final String nom, final String prenom) {
    this.nom = nom;
    this.prenom = prenom;
  }

  /*
   * Reserve un billet de train
   *
   * @return le billet de train
   */
  public boolean ajouterBilletTrain(final String villeDepart, final String villeDestination, final int nbKm,
      final int nbPersonnes, final float reduction) {

    final Billet b = new BilletsTrain(villeDepart, villeDestination, nbKm, nbPersonnes, reduction);
    return this.ajouterBillet(b);
  }

  /*
   * Reserve un billet d'avion
   *
   * @return le billet d'avion
   */
  public boolean ajouterBilletAvion(final String villeDepart, final String villeDestination, final int nbKm,
      final int nbPersonnes, final float reduction) {

    final Billet b = new BilletsAvion(villeDepart, villeDestination, nbKm, nbPersonnes, reduction);
    return this.ajouterBillet(b);
  }

  /*
   * Ajoute une reservation
   *
   * @param b le billet
   * 
   * @return true si la reservation a été effectuée, false sinon
   */
  private boolean ajouterReservation(final Billet b) {
    if (nbBillets < MAX_BILLETS) {
      billtes[nbBillets] = b;
      nbBillets++;
      return true;
    }
    return false;
  }

  /*
   * Affiche les détails du billet
   *
   * @return le billet
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < nbBillets; i++) {
      sb.append(billtes[i].toString());
    }
    return sb.toString();
  }

}

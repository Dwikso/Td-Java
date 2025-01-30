/*
 * Interface de la classe Billets
 *
 * @author Pellosse Quentin
 * @version 1.0
 */

public interface Billets {
  public String getVilleDepart();

  public String getVilleArrivee();

  public int getNombreKilometres();

  public int getNombrePersonnes();

  public int prixBillet();

  public float getReduction();

  default String billetToString() {
    return "Billet{" + "Depart : " + getVilleDepart() + ", Arrivee : " + getVilleArrivee() + ", nombreKilometres="
        + getNombreKilometres() + ", prix  : " + (prixBillet() * (1 - getReduction() / 100.0))
        + ", nombrePersonnes=" + getNombrePersonnes() + ", reduction=" + getReduction() + '}';
  }

}

/*
 * Class Beurre
 *
 * @author Pellosse Quentin
 * @version 1.0
 */

public class Beurre implements Aliment {
  private int poids;
  private final String nom;
  private int calories;
  private boolean isDemiSel = false;

  public final static int RATIO_CALORIE = 7;

  public Beurre(int poids, boolean isDemiSel) {
    this(poids);
    this.isDemiSel = isDemiSel;
  }

  public Beurre(int poids) {
    this.poids = poids;
    this.nom = isDemiSel ? "Beurre Demi-Sel" : "Beurre";
    this.calories = poids * RATIO_CALORIE;
  }

  @Override
  public String getNom() {
    return nom;
  }

  @Override
  public int getPoids() {
    return poids;
  }

  @Override
  public int getCalories() {
    return calories;
  }

  public boolean isDemiSel() {
    return isDemiSel;
  }

  @Override
  public String toString() {
    return nom + " - Poids : " + poids + "g - Calories : " + calories + " - Demi-sel : " + (isDemiSel ? "Oui" : "Non");
  }
}

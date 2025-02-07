public class Chocolat implements Aliment {
  private int poids;
  private final String nom;
  private int calories;

  public final static int ratioCalori = 5;

  public Chocolat(int poids) {
    this.poids = poids;
    this.nom = "Chocolat";
    this.calories = poids * ratioCalori;
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

  public String toString() {
    return nom + " -Poids : " + poids + " -Calories : " + calories;
  }
}

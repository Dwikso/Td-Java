public class Oeufs implements Aliment {
  private String nom = "Oeufs";
  private int poids;
  private int calories;
  private int qte;

  public Oeufs(int qte) {
    this.qte = qte;
    this.poids = qte * 60;
    this.calories = qte * 87;
  }

  @Override
  public int getCalories() {
    return calories;
  }

  public int getQte() {
    return qte;
  }

  @Override
  public int getPoids() {
    return poids;
  }

  @Override
  public String getNom() {
    return nom;
  }

  @Override
  public String toString() {
    return nom + " - Poids : " + poids + "g - Calories : " + calories + " - Qte : " + qte;
  }
}

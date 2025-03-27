public class Chocolat {
  public static final String LAPIN = "lapin";
  public static final String CLOCHE = "cloche";
  public static final String OEUF = "oeuf";
  public static final String POULE = "poule";

  private String nom;

  private float poids;

  public Chocolat(String nom, float poids) {
    this.nom = nom;
    this.poids = poids;
  }

  public boolean convient(Enfant e) {
    return (this.poids >= e.getPoids() * (1 - 0.1) / 100) && this.poids <= e.getPoids() * (1 + 0.1) / 100;
  }

}

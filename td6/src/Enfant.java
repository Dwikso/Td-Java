public class Enfant {
  private String prenom;
  private float poids;

  public Enfant(String prenom, float poids) {
    this.prenom = prenom;
    this.poids = poids;
  }

  public float getPoids() {
    return poids;
  }

  public void mangeChocolat(Chocolat c) {
    System.out.println("Miam !");
  }

}

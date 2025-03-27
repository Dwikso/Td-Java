import java.util.HashMap;
import java.util.Map;

public class Ensemble {
  private Map<Integer, Integer> ensemble;

  public Ensemble() {
    this.ensemble = new HashMap<>();
  }

  public void ajouter(int entier) {
    if (!ensemble.containsKey(entier))
      ensemble.put(entier, 1);
    else
      ensemble.put(entier, ensemble.get(entier) + 1);
  }

  public void supprimer(int entier) {
    if (ensemble.containsKey(entier))
      ensemble.remove(entier);
  }

  public void supprimer_n(int entier, int occurences) {
    if (ensemble.containsKey(entier) && occurences <= ensemble.get(entier)) {
      ensemble.put(entier, ensemble.get(entier) - occurences);
    }

  }
}

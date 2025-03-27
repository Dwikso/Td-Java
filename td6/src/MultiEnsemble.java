import java.util.HashMap;
import java.util.Map;

public class MultiEnsemble {
  private Map<Integer, Integer> ensembles;

  public MultiEnsemble() {
    ensembles = new HashMap<>();
  }

  public void ajouter(int element) {
    ensembles.put(element, ensembles.getOrDefault(element, 0) + 1);
  }

  public void supprimer(int element) {
    if (ensembles.containsKey(element)) {
      int occurences = ensembles.get(element);
      if (occurences > 1) {
        ensembles.put(element, occurences - 1);
      } else {
        ensembles.remove(element);
      }
    }
  }

}

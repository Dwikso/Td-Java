import java.util.Map;
import java.util.HashMap;

public class NoeudDico {
  private boolean estFinal;
  private int nbre;
  private Map<Character, NoeudDico> lesSuivants;

  public NoeudDico() {
    this(false);
  }

  public NoeudDico(boolean estMot) {
    estFinal = estMot;
    lesSuivants = new HashMap<Character, NoeudDico>();
  }

  public boolean estFinMot() {
    return estFinal;
  }

  public boolean aDeSuivants() {
    return !lesSuivants.isEmpty();
  }

  public ajouteUnMot(String mot) {
  }

}

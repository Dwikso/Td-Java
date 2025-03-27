import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

  public void ajouteUnMot(String mot) {
    NoeudDico noeudCourant = this;

    for (int i = 0; i < mot.length(); i++) {
      char caractere = mot.charAt(i);

      if (!noeudCourant.lesSuivants.containsKey(caractere)) {
        noeudCourant.lesSuivants.put(caractere, new NoeudDico());
      }

      noeudCourant = noeudCourant.lesSuivants.get(caractere);
    }

    noeudCourant.estFinal = true;
  }

  public boolean supprimerMot(String mot) {
    NoeudDico noeudCourant = this;
    List<NoeudDico> chemin = new ArrayList<>();

    for (char c : mot.toCharArray()) {
      if (!noeudCourant.lesSuivants.containsKey(c)) {
        return false;
      }
      chemin.add(noeudCourant);
      noeudCourant = noeudCourant.lesSuivants.get(c);
    }
    if (!noeudCourant.estFinMot()) {
      return false;
    }
    noeudCourant.nbre--;
    if (noeudCourant.nbre == 0) {
      noeudCourant.estFinal = false;
    }
    return true;
  }

  public int nombreOccurences(String mot) {
    NoeudDico noeudCourant = this;
    List<NoeudDico> chemin = new ArrayList<>();

    for (char c : mot.toCharArray()) {
      if (!noeudCourant.lesSuivants.containsKey(c)) {
        return 0;
      }
      noeudCourant = noeudCourant.lesSuivants.get(c);
    }
    if (!noeudCourant.estFinMot()) {
      return 0;
    }
    return noeudCourant.nbre;
  }

}

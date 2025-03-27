import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class LPA {
  private Collection<Chocolat> lesChocolats = new ArrayList<>();
  private List<Jardin> lesJardins;
  private Jardin monJardin;
  private Iterator<Jardin> iterJardins;

  public LPA(ArrayList<Chocolat> lesChocolats, ArrayList<Jardin> lesJardins) {
    this.lesJardins = lesJardins;
    this.lesChocolats = lesChocolats;
    this.iterJardins = lesJardins.iterator();
    avancer();
  }

  public void deposerChocolatEnfant(Enfant e) {
    Iterator<Chocolat> iterChocolats = lesChocolats.iterator();
    while (iterChocolats.hasNext()) {
      Chocolat c = (Chocolat) iterChocolats.next();
      if (c.convient(e)) {
        e.mangeChocolat(c);
        iterChocolats.remove();
        return;
      }
    }
  }

  public void deposerChocolatJardin() {
    if (monJardin == null)
      return;
    Iterator<Enfant> iterEnfants = monJardin.getLesEnfantsIterator();
    while (iterEnfants.hasNext()) {
      Enfant e = (Enfant) iterEnfants.next();
      deposerChocolatEnfant(e);
    }
  }

  public boolean avancer() {
    if (iterJardins.hasNext()) {
      monJardin = (Jardin) iterJardins.next();
      return true;
    }
    return false;
  }
}

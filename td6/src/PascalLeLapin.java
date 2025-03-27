import java.util.ArrayList;
import java.util.HashSet;

public class PascalLeLapin {
  public static void main(String[] args) {
    Set mesLPA = new HashSet();
    boolean tourner = true;
    while (tourner) {
      tourner = false;
      for (LPA unLPA : mesLPA) {
        unLPA.deposerChocolatJardin();
        tourner = tourner || unLPA.avancer();
      }
    }
  }
}

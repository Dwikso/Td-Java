public class Demo {
  public static void main(String[] args) {
    Aliment beurre = new Beurre(100);
    Aliment beurreSel = new BeurreSel(10, true);
    Aliment choc = new Chocolat(200);
    Aliment oeufs = new Oeufs(4);
    System.out.println(beurre);
    System.out.println(oeufs);
    int total = beurre.getCalories() + choc.getCalories() + oeufs.getCalories();
    total += beurreSel.getCalories();
    System.out.println("Total Calories : " + total);
  }
}

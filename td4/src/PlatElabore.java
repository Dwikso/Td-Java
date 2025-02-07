interface PlatElabore extends Aliment {
  Categorie getCategories();

  Aliment[] getAliments();

  void ajouterMotCle(String motCle);

  boolean aMotCle(String motCle);

  boolean aTousLesMotsCles(String[] filtres);

  String[] getMotsCles();
}

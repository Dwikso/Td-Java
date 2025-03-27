public abstract class Camion extends Vehicule {

  protected double chargeMaximale;
  protected double chargeActuelle;

  public Camion(String immatriculation, double poidsAVide, double chargeMaximale, double chargeActuelle) {
    super(immatriculation, poidsAVide);
    this.chargeMaximale = chargeMaximale;
    this.chargeActuelle = Math.min(chargeActuelle, chargeMaximale); // Empêche une charge initiale invalide
  }

  public double getChargeMaximale() {
    return chargeMaximale;
  }

  public double getChargeActuelle() {
    return chargeActuelle;
  }

  public boolean ajouterCharge(double charge) {
    if (charge > 0 && (this.chargeActuelle + charge) <= this.chargeMaximale) {
      this.chargeActuelle += charge;
      return true;
    }
    return false;
  }

  public boolean retirerCharge(double charge) {
    if (charge > 0 && (this.chargeActuelle - charge) >= 0) {
      this.chargeActuelle -= charge;
      return true;
    }
    return false;
  }

  public boolean calculCharge(double charge) {
    return ajouterCharge(charge);
  }

  @Override
  public String toString() {
    return super.toString() + ", Charge : " + chargeActuelle + "/" + chargeMaximale + " tonnes";
  }
}

class CamionBache extends Camion {
  public CamionBache(String immatriculation) {
    super(immatriculation, 4.0, 20.0, 0.0);
  }

  @Override
  public double calculerVitesseMax() {
    if (this.chargeActuelle == 0) {
      return 130;
    } else if (this.chargeActuelle <= 1.0) {
      return 110;
    } else if (this.chargeActuelle <= 4.0) {
      return 90;
    } else {
      return 80;
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", Type: Camion Bâché, Vitesse Max: " + calculerVitesseMax() + " km/h";
  }
}

class PetitBus extends Vehicule {
  private static final double VITESSE_MAX = 150;

  public PetitBus(String immatriculation) {
    super(immatriculation, 4000);
  }

  @Override
  public double calculerVitesseMax() {
    return VITESSE_MAX;
  }

  @Override
  public String toString() {
    return super.toString() + ", Type: Petit Bus, Vitesse Max: " + VITESSE_MAX + " km/h";
  }
}

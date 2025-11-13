
public class Oxymetre extends CapteurConnectée{
    private double spo2; // saturation en oxygène

    public Oxymetre(String id, String nom) {    
    super(id, nom);
    }

    public void mesurer(){
        spo2= 88 + Math.random()*12;
        valeur=spo2;
    }

    public boolean verifierAlerte() {
        return spo2 < 92; 
    }
    public String toString() {
    return super.toString() + String.format(" [SpO2=%.1f%%]", spo2);
    }

}


public abstract class CapteurConnectée {
    String id;
    String nom;
    Boolean estAbonné;
    double valeur;

    public CapteurConnectée(String id, String nom){
        this.id=id;
        this.nom=nom;
        this.estAbonné=false;

    }

    public String getId(){return id;}
    public String getNom(){ return nom;}
    public boolean EstAbonné(){return estAbonné;}
    public double getValeur(){return valeur;}

    public abstract void mesurer();
    public abstract boolean verifierAlerte();


public String toString() {
return id + "   " + nom + " (abonné=" + estAbonné + ")";
}



}

package hu.szamalk.model;
;
public abstract class MertaniHenger {
    private int hengerDarab;
    private double sugar, magassag;
    public abstract double Henger(double r,double m);
    public abstract double getSugar();
    public abstract void getMagassag();
    public abstract void setSugar(double r);
    public abstract double setMagassag(double m);
    public abstract String toString();
    public abstract double terfogat();
    public abstract int getHengerDarab();
};

package hu.szamalk.model;

public abstract class Cso {
    private double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag){

    }

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag){

    }

    public double getFalvastagsag(){
        return falvastagsag;
    }

    public double terfogat(){
        return 0;
    }
}

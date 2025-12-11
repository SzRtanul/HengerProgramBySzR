package hu.szamalk.model;

public abstract class LyukasHenger extends TomorHenger{
    private double falvastagsag;
    public LyukasHenger(double r,double m, double fv){
        super();
    }
    public double TomorHenger(double r,double m, double fv, double fs){
        return 0;
    }
    @Override
    public String toString(){
        return "";
    }
    public double terfogat(){
        return 0;
    }
}

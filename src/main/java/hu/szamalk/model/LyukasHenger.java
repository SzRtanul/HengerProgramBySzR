package hu.szamalk.model;

public class LyukasHenger extends TomorHenger{
    private double falvastagsag;
    public LyukasHenger(double r,double m, double fv){
        super(r, m);
        this.falvastagsag = fv;
    }

    public double terfogat(){
        //var belso = new MertaniHenger(getSugar()-falvastagsag, getMagassag());
        setSugar(getSugar() - falvastagsag);
        double belso = super.terfogat();
        setSugar(getSugar() + falvastagsag);
        return super.terfogat() - belso;
    }

    @Override
    public String toString() {
        return "LyukasHenger{\n" +
                "\n\tsugar=" + this.getSugar() +
                "\n\tmagassag=" + this.getMagassag() +
                "\n\tterfogat=" + this.terfogat() +
                "\n\tfajsuly=" + this.getFajsuly() +
                "\n\tfalvastagsag=" + this.falvastagsag +
                "\n}";
    }
}

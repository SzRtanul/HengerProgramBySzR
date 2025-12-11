package hu.szamalk.model;

public class TomorHenger extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double r,double m, double fs){
        super(r, m);
        setFajsuly(fs);
    }

    public TomorHenger(double r,double m){
        this(r, m,0);
	}

    public double getFajsuly(){
		return fajsuly;
	}

    public double setFajsuly(double fs){
		return this.fajsuly = fs;
	}

    public double suly(){
        return terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger{\n" +
                "\n\tsugar=" + this.getSugar() +
                "\n\tmagassag=" + this.getMagassag() +
                "\n\tterfogat=" + this.terfogat() +
                "\n\tfajsuly=" + this.getFajsuly() +
                "\n}";
    }
}

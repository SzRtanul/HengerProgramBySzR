package hu.szamalk.model;
public class MertaniHenger {
    private static int hengerDarab;
    private double sugar, magassag;

    public MertaniHenger(double r,double m){
		setSugar(r);
        setMagassag(m);
        MertaniHenger.hengerDarab++;
	}

    public double getSugar(){
		return sugar;
	}

    public double getMagassag(){
        return magassag;
	}

    public void setSugar(double r){
        this.sugar = r;
	}

    public void setMagassag(double m){
		this.magassag = m;
	}

    public double terfogat(){
		return 2 * sugar * Math.PI + 2 * sugar * Math.PI * magassag;
	}

    public static int getHengerDarab(){
		return hengerDarab;
	}

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "\n\tsugar=" + sugar +
                "\n\tmagassag=" + magassag +
                "\n\tterfogat=" + terfogat() +
                "\n}";
    }
}

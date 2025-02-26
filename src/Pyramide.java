public abstract class Pyramide {
    protected double hoehe;

    public Pyramide(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public abstract double calcVolumen();
}

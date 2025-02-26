public class Quadratpyramide extends Pyramide {
    private double seitenlaenge;

    public Quadratpyramide(double seitenlaenge, double hoehe) {
        super(hoehe);
        this.seitenlaenge = seitenlaenge;
    }

    public double berechneGrundflaeche() {
        return seitenlaenge * seitenlaenge;
    }

    @Override
    public double calcVolumen() {
        return (1.0 / 3.0) * berechneGrundflaeche() * getHoehe();
    }

    public void zeigeDaten() {
        System.out.println("Quadratpyramide mit Seitenlänge: " + seitenlaenge);
        System.out.println("Höhe: " + getHoehe());
        System.out.println("Grundfläche: " + berechneGrundflaeche());
        System.out.println("Volumen: " + calcVolumen());
    }

    public static void main(String[] args) {
        Quadratpyramide pyramide = new Quadratpyramide(4, 10);
        pyramide.zeigeDaten();
    }
}

public class Kegelpyramide extends Pyramide {

    private double radius;

    // Konstruktor für Kegelpyramide
    public Kegelpyramide(double radius, double hoehe) {
        super(hoehe);
        this.radius = radius;
    }

    // Getter und Setter für Radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementierung der abstrakten Methode calcVolumen()
    @Override
    public double calcVolumen() {
        return (1.0 / 3.0) * Math.PI * radius * radius * hoehe;
    }

    // Methode zur Berechnung der Oberfläche
    public double calcOberflaeche() {
        double seitenkante = Math.sqrt(radius * radius + hoehe * hoehe);
        double seitenflaeche = Math.PI * radius * seitenkante;
        return Math.PI * radius * radius + seitenflaeche;
    }

}

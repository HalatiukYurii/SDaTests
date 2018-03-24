package zoo;

/**
 * Created by RENT on 2018-03-24.
 */
public class Zwieze {
    private String nazwa;
    private double waga;
    private double wzrost;
    private boolean plec = true;

    public double getBmi() {
        try {
            if (getBmi() == 0) {
            }
        } catch (Exception e) {
            System.out.println("Cos nie tak.");
        }
        return (waga / wzrost) * 2;
    }

    public double nakarm() {
        return waga++;
    }

    public double polozSpac() {
        return waga--;
        return wzrost++;
    }

    public boolean czyGruby() {
        if (>=20 ||)
    }
}

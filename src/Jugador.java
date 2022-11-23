public class Jugador {
    private String name;
    private int points;

    public Jugador(String name) {
        this.name = name;
        points = 0;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + points;
    }


}

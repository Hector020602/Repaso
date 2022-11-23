public class Partida {
    public static final String[] NAMES = {"EVA", "Carlos", "Victor", "Ana", "Luis"};
    private Jugador[] jugadores;

    public Partida(int numPlayers) {
        if (numPlayers > NAMES.length) {
            throw new ArrayIndexOutOfBoundsException("Max number of players is" + NAMES.length);
        }
        jugadores = new Jugador[numPlayers];
        int jugadoresGenerados = 0;
        while (jugadoresGenerados < numPlayers) {
            int index = (int)(Math.random() * NAMES.length);
            Jugador j = new Jugador(NAMES[index]);

            //comprobar si j esta en jugadores o no.

            if (!existeEnJugadores(j, jugadoresGenerados)) {
                jugadores[jugadoresGenerados] = j;
                jugadoresGenerados ++;

            }
        }
    }
    //por cada jugador que hay en jugadores.
    private boolean existeEnJugadores(Jugador j, int jugadoresGenerados) {
        for (int i = 0; i  < jugadoresGenerados; i++) {
            if (j.getName().equals(jugadores[i].getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (Jugador j : jugadores) {
            s += j.toString() + "\n";
        }
        return s;
    }
}

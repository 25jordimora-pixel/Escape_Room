package logica

class Joc {

    // Lista de partidas jugadas
    private var partidaActual: Partida? = null

    // Inicia un nuevo juego con el nombre del jugador y la lista de salas
    fun inciarJoc(nomJugador: String, sales: List<Sala>) {
        
        // Crea un nuevo jugador y una nueva partida, luego inicia la partida
        val jugador = Jugador(nomJugador) // Crea un jugador

        val partida = Partida(jugador, sales) // Crea una partida

        partida.iniciar() // Inicia la partida

        partidaActual = partida // Guarda la partida como partida actual
    }

    // Devuelve la partida actual si existe, de lo contrario devuelve null
    fun obtenirPartidaActual(): Partida? {
        return partidaActual
    }

    // Finaliza la partida actual si existe
    fun finalitzarJoc() {
        partidaActual?.finalitzar()
    }
}
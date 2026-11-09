package logica

class Partida(
    val jugador: Jugador, // Jugador que participa en la partida
    val sales: List<Sala>
) {
    var salaActual: Int = 0 
    private set // La sala actual solo puede ser modificada dentro de la clase Partida

    var iniciada: Boolean = false
    private set // La partida solo puede ser iniciada o finalizada desde dentro de la clase Partida

    var finalitzada: Boolean = false
    private set // La partida solo puede ser finalizada desde dentro de la clase Partida

    // Inicia la partida
    fun iniciar() {
        iniciada = true
    }

    // Cambia a la siguiente sala. 
    // !finalizada: Se pone esto ya que el Escape Room no ha terminado por completo. 
    // salaActual < sales.size - 1: Esta condición comprueba que todavía queden habitaciones por delante
    fun avancarSala() {
        if (iniciada && !finalitzada && salaActual < sales.size -1) {
            salaActual++
        }
    }

    // Devuelve la sala actual
    fun obtenirSalaActual(): Sala? {
        return sales.getOrNull(salaActual)
    }
    
    // Finaliza la partida
    fun finalitzar() {
        finalitzada = true
    }
}
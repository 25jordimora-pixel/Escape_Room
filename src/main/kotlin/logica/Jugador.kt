package logica 

// Cada jugador se le asigna un nombre
class Jugador(val nom: String) { 
    
    // Puntuación del jugador, inicializada en 0 y con un setter privado para evitar modificaciones externas.
    var puntuacio: Int = 0
    private set

    // Inventario del jugador, inicializado como una instancia de la clase Inventari.
    var inventari = Inventari()

    // Agrega puntos a la puntuación del jugador.
    fun afegirPunts(punts: Int) {
        puntuacio += punts
    }

    // Método para que el jugador pueda recoger un objeto, verificando si es agafable antes de añadirlo al inventario.
    fun agafarObjecte(objecte: Objecte) {
        if (objecte.esAgafable) {
            inventari.afegirObjecte(objecte)
        }
    }
}
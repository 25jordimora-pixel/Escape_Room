package logica

class Sala(
    val id: Int, // Identificador único de la sala
    val nom: String, // Nombre de la sala
    val descripcio: String
) {

    // Lista de objetos presentes en la sala
    private val objectes = mutableListOf<Objecte>()

    // Agrega un objeto a la sala
    fun afegirObjecte(objecte: Objecte) {
        objectes.add(objecte)
    }

    // Elimina un objeto de la sala por su ID
    fun eliminarObjecte(id: Int) {
        objectes.removeIf { it.id == id }
    }

    // Verifica si un objeto está en la sala por su ID
    fun teObjecte(id: Int): Boolean {
        return objectes.any { it.id == id }
    }

    // Obtiene la lista de objetos en la sala
    fun obtenirObjectes(): List<Objecte> {
        return objectes
    }
}
package logica

class Inventari {
    private val objectes = mutableListOf<Objecte>()

    // Agrega un objeto al inventario
    fun afegirObjecte(objecte: Objecte) {
        objectes.add(objecte)
    }

    // Elimina un objeto del inventario por su ID
    fun eliminarObjecte(id: Int) {
        objectes.removeIf { it.id == id }
    }

    // Verifica si un objeto está en el inventario por su ID
    fun teObjecte(id: Int): Boolean {
        return objectes.any { it.id == id }
    }

    // Devuelve la lista de objetos en el inventario
    fun mostrarObjectes(): List<Objecte> {
        return objectes
    }
}
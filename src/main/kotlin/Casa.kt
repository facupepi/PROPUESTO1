open class Casa (
    var domicilio : String,
    var descripcion : String,
    disponibilidad : Boolean = true
) : Propiedad(disponibilidad)

{
    override fun obtenerDescripcion(): String {
        return descripcion
    }

    override fun toString(): String {
        return "DOMICILIO: $domicilio - DESCRIPCION: $descripcion"
    }
}

// Que sea open significa que no es una clase final
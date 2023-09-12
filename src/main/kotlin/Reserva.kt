class Reserva(
    var fechaInicio : String,
    var fechaFin : String,
    var montoTotal : Double,
    var cliente: Cliente,
    var propiedad: Propiedad,
    var pago: Pago?
) {
    init {
        this.propiedad.disponibilidad = false //cambiar atributo a la reservva
    }

    override fun toString(): String {
        return "CLIENTE {$cliente} - PROPIEDAD: {$propiedad}\n"
    }
}
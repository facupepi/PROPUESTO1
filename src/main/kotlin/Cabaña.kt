//Al ser cabaña simplemente class, significa que es una clase final

class Cabaña (
    domicilio : String,
    descripcion : String,
    var servicio : String,
    disponibilidad : Boolean = true

) : Casa(domicilio, descripcion, disponibilidad){
}
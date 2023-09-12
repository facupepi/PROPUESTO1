class Cliente (
    var nombre: String,
    var apellido: String,
    var direccion: String,
    var telefono : Int
){
    override fun toString(): String {
        return "NOMBRE: $nombre - APELLIDO: $apellido - DIRECCION: $direccion - TELEFONO: $telefono"
    }
}
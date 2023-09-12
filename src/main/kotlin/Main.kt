fun main() {
    val cliente1 = Cliente("Facu","Pepino","Mitre",1)
    val cliente2 = Cliente("Santi","Villa","Roca",2)
    val cliente3 = Cliente("Joa","Alarca","Garay",3)

    val casa1 = Casa("domicilio1","grande")
    val casa2 = Casa("domicilio2","pequeña")

    val cabaña1 = Cabaña("domicilio3","mediana","aire acondicionado")

    cabaña1.servicio = "nueva calefaccion"

}
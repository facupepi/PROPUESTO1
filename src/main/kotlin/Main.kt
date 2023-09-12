fun main() {
    val cliente1 = Cliente("Facu","Pepino","Mitre",1)
    val cliente2 = Cliente("Santi","Villa","Roca",2)
    val cliente3 = Cliente("Joa","Alarca","Garay",3)

    val casa1 = Casa("domicilio1","grande")
    val casa2 = Casa("domicilio2","pequeña")

    val cabaña1 = Cabaña("domicilio3","mediana","aire acondicionado")

    cabaña1.servicio = "nueva calefaccion"

    var pago1 = Pago("2023",100.0)

    val reserva1 = Reserva("2022","2023",100.0,cliente1,casa1,pago1)
    val reserva2 = Reserva("2020","2021",200.0,cliente2,casa2,null)
    val reserva3 = Reserva("2019","2021",200.0,cliente3,casa2,null)



    var gestor = GestorDeReservaYPago()
    gestor.agregarReserva(reserva1)
    gestor.agregarReserva(reserva2)
    gestor.agregarReserva(reserva3)

    gestor.agregarPago(pago1)

    var reservasCliente1 = gestor.getReservasCliente(cliente1)
    var reservasCasa1 =gestor.getReservasPropiedad(casa2)

    println("\n\nRESERVAS DEL CLIENTE 1---------------------------------- \n" +reservasCliente1 +"RESERVAS DEL CLIENTE 1---------------------------------- \n\n")
    println("\n\nRESERVAS DE LA CASA 1---------------------------------- \n" +reservasCasa1 +"RESERVAS DE LA CASA 1---------------------------------- \n\n")

    println("\n\nRESERVAS NO PAGADAS--------------------------------- \n" +gestor.getReservasNoPagadas()+"RESERVAS NO PAGADAS---------------------------------- \n\n")
}
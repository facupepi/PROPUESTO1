class GestorDeReservaYPago(
    val reservas :  ArrayList<Reserva> = arrayListOf(),
    val pagos : ArrayList<Pago> = arrayListOf()
) {
    fun agregarReserva(ReservaTemp : Reserva){
        reservas.add(ReservaTemp)
    }

    fun agregarPago(pagoTemp : Pago){
        pagos.add(pagoTemp)
    }

    fun getReservasCliente(clienteAcomparar: Cliente) : ArrayList<Reserva>{
        var reservasDelCliente : ArrayList<Reserva> = arrayListOf()

        for(reservaTemp in reservas){

            if(reservaTemp.cliente == clienteAcomparar){
                reservasDelCliente.add(reservaTemp)
            }
        }
        return reservasDelCliente
    }

    fun getReservasPropiedad(propiedadAcomparar: Propiedad) : ArrayList<Reserva>{
        var reservasDeLaPropiedad : ArrayList<Reserva> = arrayListOf()

        for(reservaTemp in reservas){

            if(reservaTemp.propiedad == propiedadAcomparar){
                reservasDeLaPropiedad.add(reservaTemp)
            }
        }
        return reservasDeLaPropiedad
    }
/*
    fun getReservasNoPagadas() : ArrayList<Reserva> {
        var reservasImpagas : ArrayList<Reserva> = reservas
        for(pagoTemp in pagos){
            reservasImpagas.remove(pagoTemp.reserva)
        }
        return reservasImpagas
    }

    fun getReservaNoPagadas(): ArrayList<Reserva> {
        var reservasNoPagadas: ArrayList<Reserva> = arrayListOf()

        for(reserv in reservas){
            var flagh = true
            for(pago in pagos){
                if(reserv ==  pago.reserva)
                    flagh = false
            }
            if(flagh == true){
                reservasNoPagadas.add(reserv)
            }
        }
        return reservasNoPagadas
    }
        fun getReservasNoPagadas() : ArrayList<Reserva> {
        var reservasImpagas : ArrayList<Reserva> = arrayListOf()
        for(reservaTemp in reservas){
            if (!reservaPagada(reservaTemp)){
                reservasImpagas.add(reservaTemp)
            }
        }
        return reservasImpagas
    }

    fun reservaPagada(reservaAComparar : Reserva) : Boolean {
        var flag = false
        for(pagoTemp in pagos){
            if(pagoTemp.reserva == reservaAComparar){
                flag=true
            }
        }
        return flag
    }
*/

    fun getReservasNoPagadas() : ArrayList<Reserva> {
        var reservasImpagas : ArrayList<Reserva> = arrayListOf()
        for(reservaTemp in reservas){
            if (reservaTemp.pago == null){
                reservasImpagas.add(reservaTemp)
            }
        }
        return reservasImpagas
    }




}
# Gestión de Reservas y Pagos

Este proyecto de Kotlin implementa un sistema de gestión de reservas y pagos que incluye clientes, propiedades (casas y cabaña), y un gestor de reservas y pagos.

## Acciones Realizadas

### a. Creación de Clientes

Se ha creado un constructor para la clase `Cliente` que toma 4 parámetros y se han instanciado 3 clientes utilizando este constructor.

### b. Creación de Casas

Se ha implementado un constructor para la clase `Casa` que toma 2 argumentos: descripción y domicilio. Luego, se han instanciado 2 casas con disponibilidad establecida en "true", sin utilizar el método `cambiarEstado`.

### c. Instancia de una Cabaña

Se ha creado una instancia de la clase `Cabaña` que tiene un servicio de calefacción. Posteriormente, se cambió el servicio brindado a "Aire acondicionado".

### d. Reservas

Se ha implementado un constructor para la clase `Reserva` que cambia la disponibilidad de la propiedad a "falso". Luego, se realizaron las siguientes reservas: 
- Cliente 1 con Casa 1
- Cliente 2 con Casa 2
- Cliente 3 con la Cabaña

### e. Gestión de Reservas y Pagos

Se ha creado una clase `GestorDeReservaYPago` para gestionar las reservas y los pagos. Esta clase enlista las reservas y proporciona un método para obtener todas las reservas de un cliente y todas las reservas de una propiedad.

### f. Pago de Propiedad

Se realizó el pago de la propiedad 1 en el `GestorDeReservaYPago`, se enlista el pago y se implementó un método para obtener todas las reservas no pagadas.


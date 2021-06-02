# Guia05-DIED

ReparaFix es una plataforma online que permite que los usuarios registrados contraten servicios de
trabajadores de diversos oficios (albañiles, reparación de ascensores, carpintería, cerrajería, gasistas,
reparación de electrodomésticos, etc.) los cuales poseen un convenio con la empresa para realizar los
trabajos. Cada vez que se les asigna un trabajo se registra el mismo en el trabajador. Además de
conocer la lista de trabajos asignados de cada trabajador se conoce el nombre, el correo electrónico, el
oficio, y el costo por hora que cobra y el porcentaje de comisión.
EL objetivo es ofrecer servicios que pueden ser contratados por el usuario. Para ello, el usuario puede
buscar el catálogo de servicios y elegir de un oficio un servicio estándar (por ejemplo, de reparación,
mantenimiento o instalación) que puede ser desarrollado por cualquier trabajador de ese oficio.
Por otro lado, puede contratar servicios personalizados para los cuales no se tiene un precio previo
dado que depende de los materiales necesarios para realizarlos.
De todos los servicios se conoce el oficio al que pertenece (Albañilería, Cerrajería, Carpintería, etc.) y de
todos los servicios se debe poder calcular el costo de los mismos el cual varía según el tipo de servicio
contratado.
- En los servicios estándares se cobra un monto fijo, definido por ReparaFix para ese servicio más
el plus que cobre el profesional seleccionado.
- En los servicios personalizados, el costo es un valor presupuestado, mas un costo de materiales
y un costo de transporte.
- Además, todos los tipos de servicios pueden ser solicitados como URGENTES por lo que se le
cobra un 50% más del precio.
ReparaFix también ofrece el Alquiler de máquinas y herramientas (escaleras, sierras, filtros,
compresores, bombas de vacío, etc.). En este caso se registra la herramienta alquilada, y el día de inicio,
el día de fin (cuando debe devolver la herramienta) y el día real de devolución.
Cada herramienta tiene un nombre y un costo por día y el costo del alquiler se calcula multiplicando los
días que estuvo la herramienta alquilada por el costo por día. Para saber cuántos días estuvo alquilada
una herramienta se guarda la fecha de devolución. Si la fecha de devolución es nula entonces la
herramienta todavía no ha sido retornada por lo que el precio se calcula al día de hoy.
Para contratar un servicio, un usuario entra a la aplicación online donde puede navegar el catálogo
filtrando que servicio o alquiler contratable requiere y lo puede agregar a su perfil. Al finalizar el mes
automáticamente ReparaFix le debitará de la tarjeta del usuario el monto de los servicios contratados en
ese mes.
Cuando el usuario elije el contratable, indicará en el caso de un servicio, el tipo de servicio, el oficio, y si
es urgente o no. En el caso de que el contratable sea el alquiler de una herramienta, se indica la
cantidad de días que la requiere y el día inicial. y se genera un alquiler con el día inicial y el día final
indicados.
Tareas:
1) Crear un proyecto Java en eclipse de nombre “Guia05-APE” (donde “APE” será su apellido).
2) Subirlo en GitHub en su repositorio.
3) Crear las clases e interfaces necesarias para el proyecto. Puede agregar más clases de las explicadas
en la “clase online”
4) Implementar el método que calcula el costo de un servicio basado en las reglas del enunciado:
a) En los servicios estándares se cobra un monto fijo, definido por ReparaFix para ese servicio más
el plus que cobre el profesional seleccionado.
b) En los servicios personalizados, el costo es un valor presupuestado, más un costo de materiales y
un costo de transporte que se guardan directamente en este tipo de servicio
c) Además, todos los tipos de servicios pueden ser solicitados como URGENTES por lo que se le
cobra un 50% más del precio.
5) Implementar el método que calcula el costo de un alquiler, como el producto de los días que la
herramienta estuvo alquilada (calculando la diferencia en días entre la fecha de entrega real y la
fecha de inicio del alquiler). El sistema por el momento no cobra multa por entregas tardías.
a) Agregar a la clase alquiler un método “enMora” que retorne verdadero si el mismo fue devuelto
con fecha posterior a la contratada, o si aun no fue devuelto pero el día actual es posterior al del
vencimiento.
6) Implementar en los trabajos y en los alquileres el método “finalizado” que retorna verdadero si el en
un trabajo tiene fecha de fin y en el caso de los alquileres, si la herramienta fu devuelta.
7) Implementar en la clase Trabajador un método que permita agregar tareas a un trabajador. Para ello
se debe verificar que:
a) La tarea tiene el mismo oficio que el trabajador sino lanzar una excepción
OficioNoCoincideException
b) Ese día el trabajador no tiene otro trabajo agendado, si es así, lanzar una excepción
AgendaOcupadaException.
8) Implementar en la clase Usuario un servicio “Contratar” donde el usuario puede contratar un
servicio o un alquiler y agregarlo a su lista de contratables. Para este caso se debe validar que:
9) El usuario no puede tener más de dos alquileres sin haber sido devueltos (es decir si quiere alquilar
una herramienta y en su lista de contratables tiene más de 2 alquileres sin devolver entonces no
podrá alquilar y se lanzará una excepción AlquilerNoEntregadoException)

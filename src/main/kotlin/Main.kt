fun main() {
    val depart = Departamento()
    depart.agregarempleado(EmpleadoPorHora("paco",4,24.0,10.0))
    depart.agregarempleado(EmpleadoFijo("fran",5,120.0,10.0))
    depart.agregarempleado(EmpleadoPorHora("ivan",6,233.0,9.7))
    depart.agregarempleado(EmpleadoPorHora("andres",7,212.0,12.0))
    depart.agregarempleado(EmpleadoPorHora("nico",88,230.0,7.0))

    println("Salario total del departamento: ${depart.calcularsalariototal()}€")
    depart.salariounoporuno()
}
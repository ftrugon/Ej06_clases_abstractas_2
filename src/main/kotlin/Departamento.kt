class Departamento(val listaempleados:MutableList<Empleado> = mutableListOf<Empleado>()) {
    fun agregarempleado(emple:Empleado) {
        listaempleados.add(emple)
    }
    fun calcularsalariototal() = listaempleados.sumOf { it.calcularsalario() }

    fun salariounoporuno(){
        listaempleados.forEach { println(it) }
    }

}
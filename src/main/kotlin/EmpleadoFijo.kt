class EmpleadoFijo(nombre:String,id:Int, val salarioFijo:Double, val numPagas:Double):Empleado(nombre ,id) {
    override fun calcularsalario(): Double {
        return salarioFijo * numPagas
    }

}
class EmpleadoPorHora(nombre:String,id:Int,val horasTrabajadas:Double,val tarifaPorHora: Double):Empleado(nombre ,id) {
    override fun calcularsalario(): Double {
        return horasTrabajadas * tarifaPorHora
    }

}
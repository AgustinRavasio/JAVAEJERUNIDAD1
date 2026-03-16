

public class Main {

    public static void main(String[] args) {

            Empleado empleado = new Empleado("agu", "gerente", 3.0);
            Empleado empleado2 = new Empleado("agu2", "ing civil", 6.0);

            Proyecto proyecto = new Proyecto("Casa");
            proyecto.AgregarEmpleado(empleado);
            System.out.println(proyecto.Presupuesto());
            proyecto.AgregarEmpleado(empleado2);
        System.out.println(proyecto.Presupuesto());
            proyecto.EliminarEmpleado(empleado);
        System.out.println(proyecto.Presupuesto());










    }
}
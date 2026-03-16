import java.util.List;
import java.util.ArrayList;

public class Proyecto {

    private String Nombre;
    private Double Presupuesto;
    private List<Empleado> empleados = new ArrayList<>();

    public void AgregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void EliminarEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }

    public double Presupuesto(){
        double suma=0.0;
        for(Empleado p :empleados){
            suma+=p.getSalario();
        }
        this.Presupuesto=suma;
        return Presupuesto;
    }

    public Proyecto(String Nombre) {
        this.Nombre = Nombre;
    }


}

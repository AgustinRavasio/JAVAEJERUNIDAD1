public class Empleado {

    private String Nombre;
    private String Puesto;
    private  double Salario;

    public Double getSalario() {
        return Salario;
    }

    public  Empleado(String NOMBRE, String PUESTO, double Salario ) {
        this.Nombre = NOMBRE;
        this.Puesto = PUESTO;
        this.Salario = Salario;
    }
}

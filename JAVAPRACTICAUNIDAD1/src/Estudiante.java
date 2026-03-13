import java.util.Map;
import java.util.HashMap;

public class Estudiante {

    private String nombre;
    private String legajo;
    private Map<String, Double> notas;

    public Estudiante(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new HashMap<>();
    }

    public void asignarNota(Materia materia, double nota) {
        notas.put(materia.getNombre(), nota);
    }

    public Map<String, Double> getNotas() {
        return notas;
    }
}

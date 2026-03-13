import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Materia materia = new Materia("MATE");
        Materia materia2 = new Materia("LENGUA");
        Materia materia3 = new Materia("TEOLOGIA");


            Estudiante estudiante = new Estudiante("AGU", "1");
            estudiante.asignarNota(materia, 5);
            estudiante.asignarNota(materia2, 7);
            estudiante.asignarNota(materia3, 6);
           var x = estudiante.getNotas();
           System.out.println(x);



    }
}
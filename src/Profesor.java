import java.util.List;

public class Profesor extends Persona{
    private int codigoDocente;
    private String asignatura;
    List<Prestamo> prestamos;

    public int getCodigoDocente() {
        return codigoDocente;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Profesor(String numeroDeTelefono, int edad, String str, int codigoDocente, String asignatura) {
        super(numeroDeTelefono, edad,str);
        this.codigoDocente=codigoDocente;
        this.asignatura=asignatura;
    }

    @Override
    public String toString() {
        return ("Profesor" +
                "codigoDocente=" + codigoDocente +
                ", asignatura= " + asignatura + '\'' +
                ", prestamos=" + prestamos );

    }
}

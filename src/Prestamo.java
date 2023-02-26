import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    List<Prestamo> prestamos;
    private int codigoPrestamo;
    private LocalDate fecha;

    public Prestamo(int codigoPrestamo, LocalDate fecha) {
        this.codigoPrestamo = codigoPrestamo;
        this.fecha = fecha;
    }

    public List<String> getPrestamos() {
        List<String> copia=new ArrayList<>();
        for(int i=0;i<prestamos.size();i++){
            copia.add(String.valueOf(i));
        }
        return copia;
    }

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return ("Prestamo" +
                "codigoPrestamo= " + codigoPrestamo +
                ", fecha=" + fecha);
    }
}

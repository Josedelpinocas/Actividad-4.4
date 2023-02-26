public class Persona {
    protected String numeroDeTelefono;
    protected int edad;
    protected String str;
    public Persona(String numeroDeTelefono,int edad,String str){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
        this.edad=edad;
        this.str=str;
    }

    public String getNumeroDeTelefono() {

        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {

        this.numeroDeTelefono = numeroDeTelefono;
    }

    @Override
    public String toString() {
        return ("Nombre: " + str+
                "Edad: " + edad+
                "Telefono: " + numeroDeTelefono);
    }
}

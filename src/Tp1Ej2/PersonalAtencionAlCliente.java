package Tp1Ej2;

public class PersonalAtencionAlCliente extends Persona {
      private int numeroEmpleado;

    public PersonalAtencionAlCliente(String nombre, String apellido, int edad, int numeroEmpleado) {
        super(nombre, apellido, edad);
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }
}

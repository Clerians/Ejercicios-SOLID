public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajo;

    public EmpleadoTiempoParcial(String nombre, String puesto, double salario) {
        super(nombre, puesto, salario);
        this.horasTrabajo = horasTrabajo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }
    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * horasTrabajo/40;
    }

}

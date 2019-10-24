package cl.juliogodoymunoz.ClasesAbstracta;

public class EmpleadoComision extends Empleados{
	private int clientesCaptados;
	private double comision;
	
	public EmpleadoComision() {
		super();
	}
	
	public EmpleadoComision(String DNI,String nombre,String apellidos,int año,int clientesCap, double comision){
     super(DNI, nombre,apellidos,año);
     clientesCaptados=clientesCap;
     this.comision=comision;
     }
	@Override
	public double getSalario() {
		double salario=clientesCaptados*comision;
		if(salario<950)
			salario=950.0;
		return salario;
	}
    
	public void setClientesCaptados(int clientesCap) {
		clientesCaptados=clientesCap;
	}
	public void setComision(double comision) {
		this.comision=comision;
	}
}

package cl.juliogodoymunoz.ClasesAbstracta;

public class EmpleadoAsalariado extends Empleados{

	private double sueldoFijo;
	//private double adicional=0;
	
	EmpleadoAsalariado(){
		super();
	}
	
	EmpleadoAsalariado(String DNI,String nombre,String apellidos,int a�o, double sueldoFijo){
	   super(DNI,nombre,apellidos,a�o);	
	   this.sueldoFijo=sueldoFijo;
	}
	
	@Override
	public double getSalario() {
		double salario=0;
		salario=sueldoFijo+adicional();
		return salario;
	}
     
	public double adicional() {
		
		double adicional=0;
		int a�os=2019-this.getA�o();
		if(a�os<2) {
			
		}else if(a�os<=3) {
			adicional=sueldoFijo*0.07;
		  }else if(a�os<=8) {
			   adicional=sueldoFijo*0.11;
		     }else if(a�os<=15) {
		    	 adicional=sueldoFijo*0.17;
		        }
		return adicional;
	}

	public void setSueldoFijo(double sueldo) {
		sueldoFijo=sueldo;
	}
  
	
	

}

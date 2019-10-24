package cl.juliogodoymunoz.ClasesAbstracta;

public class EmpleadoAsalariado extends Empleados{

	private double sueldoFijo;
	//private double adicional=0;
	
	EmpleadoAsalariado(){
		super();
	}
	
	EmpleadoAsalariado(String DNI,String nombre,String apellidos,int año, double sueldoFijo){
	   super(DNI,nombre,apellidos,año);	
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
		int años=2019-this.getAño();
		if(años<2) {
			
		}else if(años<=3) {
			adicional=sueldoFijo*0.07;
		  }else if(años<=8) {
			   adicional=sueldoFijo*0.11;
		     }else if(años<=15) {
		    	 adicional=sueldoFijo*0.17;
		        }
		return adicional;
	}

	public void setSueldoFijo(double sueldo) {
		sueldoFijo=sueldo;
	}
  
	
	

}

package cl.juliogodoymunoz.ClasesAbstracta;


public abstract class Empleados {
	   private String DNI;
	   private String nombre;
	   private String apellidos;
	   private int año;
	   
       public Empleados(String DNI,String nombre,String apellidos,int año){
         this.DNI=DNI;
         this.nombre=nombre;
         this.apellidos=apellidos;
         this.año=año;
       }
       public Empleados() {
    	   
       }
       
       public void imprimir() {
    	   System.out.println(nombre+" "+apellidos+". DNI: "+DNI+", año de alta: "+año+", salario: "+getSalario());
       }
       public abstract double getSalario();
       
       public void setDNI(String DNI) {
    	   this.DNI=DNI;
       }
       
       public void setNombre(String nombre) {
    	   this.nombre=nombre;
       }
       public void setApellidos(String apellidos) {
    	   this.apellidos=apellidos;
       }
       public void setAño( int año) {
    	  this.año=año;
       }
       public String getDNI() {
    	   return DNI;
       }
       public String getNombre() {
    	   return nombre;
       }
       public String getApellidos() {
    	   return apellidos;
       }
       public int getAño() {
    	   return año;
       }
       
       public void mostrarTodos(Empleados[] empleado) {
    	  for(int i=0;i<empleado.length;i++) {
    		  empleado[i].imprimir();
    	  }
       }
       public String sueldoMayor(Empleados[] empleado) {
    	   Empleados aux=empleado[0];
    	   for(int i=1;i<empleado.length-1;i++) {
     		   if(aux.getSalario()<empleado[i].getSalario())
    		   aux=empleado[i];
     	  }
    	   return "nombre :"+aux.getNombre()+" "+aux.getApellidos()+" Salario: "+aux.getSalario();
       }
}

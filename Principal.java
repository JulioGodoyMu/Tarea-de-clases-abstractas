package cl.juliogodoymunoz.ClasesAbstracta;

public class Principal {

	public static void main(String[] args) {
		Empleados[] empleados=new Empleados[4];
		empleados[0]=new EmpleadoAsalariado("6546546Z","Antonio","López",2014,1125);
        empleados[1]=new EmpleadoComision("465464D","Sandra","Nieto",2011,169,7.10);
        EmpleadoComision empleado=new EmpleadoComision();
        empleado.setNombre("Manuel");
        empleado.setApellidos("Ruíz");
        empleado.setDNI("4654654D");
        empleado.setAño(2010);
        empleado.setClientesCaptados(35);
        empleado.setComision(6.90);
        empleados[2]=empleado;
        EmpleadoAsalariado empleado2=new EmpleadoAsalariado();
        empleado2.setNombre("Maria");
        empleado2.setApellidos("Ramos");
        empleado2.setDNI("77879878F");
        empleado2.setAño(2011);
        empleado2.setSueldoFijo(1055);
        empleados[3]=empleado2;
       // empleados[0].imprimir();
        //empleados[1].imprimir();
        //empleados[2].imprimir();
        //empleados[3].imprimir();
        System.out.println(empleados[0].sueldoMayor(empleados));
        empleados[0].mostrarTodos(empleados);
        
	}

}

package test;


import modelo.Alumno;
import persistencia.GestorPersistencia;

public class TestConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BUSCAR
		
		/*
		GestorPersistencia gestorPersistencia = new GestorPersistencia();
		Alumno nuevoAlumno = gestorPersistencia.buscaPorID(8);
		System.out.println(nuevoAlumno);
		gestorPersistencia.cerrar();
		*/
		
		// INSERTAR ALUMNO
		
		/*
		GestorPersistencia gPersistencia = new GestorPersistencia();
	
		Alumno nuevoAlumno = getAlumno();
		if(gPersistencia.insertarAlumno(nuevoAlumno)) {
			
			
			System.out.println("Se ha insertado correctamente");
			
		} else {
			System.out.println("Ha habido un error");
		}
		*/
		
		// ACTUALIZAR ALUMNO 
		/*
		GestorPersistencia gestorPersistencia = new GestorPersistencia();
		Alumno nuevoAlumno = gestorPersistencia.buscaPorID(8);
		System.out.println(nuevoAlumno);
				
		nuevoAlumno.setApellido("NUEVO APELLIDO");
		
		if(gestorPersistencia.actualizarAlumno(nuevoAlumno)) { 
			System.out.println("Actualizacion correcta");
		}
		else {
			System.out.println("Ha fallado la actualizacion");
		}
		gestorPersistencia.cerrar();
		*/
		
		// BORRAR
		GestorPersistencia gestorPersistencia = new GestorPersistencia();
		Alumno nuevoAlumno = gestorPersistencia.buscaPorID(47);
		System.out.println(nuevoAlumno);
		if(gestorPersistencia.borrarAlumno(nuevoAlumno)) {
			System.out.println("SE HA BORRADO CORRECTAMENTE");
			
		} else {
			System.out.println("HA FALLADO EL BORRADO");
		}
		
	
	}

	private static Alumno getAlumno() {
		
		 Alumno alumno =new Alumno (0,"TEST22", "TEST22", "TEST22", "TEST22", 10);
		return alumno;
	}

}

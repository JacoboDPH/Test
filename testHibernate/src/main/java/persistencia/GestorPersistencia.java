package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.Alumno;


public class GestorPersistencia {

	EntityManagerFactory factoria;
	
	
	public GestorPersistencia () {
		this.factoria = Persistence.createEntityManagerFactory("miBaseDeDatos");
	}
	
	public Alumno buscaPorID(int id) {
				
		
		EntityManager unEntityManager = this.factoria.createEntityManager();
		Alumno unAlumno = unEntityManager.find(Alumno.class, id);
		unEntityManager.close();
		
		return unAlumno;
		
	}
	
	public boolean insertarAlumno(Alumno a) {

		EntityManager unEntityManager = this.factoria.createEntityManager();
		EntityTransaction transaccion = unEntityManager.getTransaction();
		transaccion.begin();
		unEntityManager.persist(a);


		try {
			transaccion.commit();

		} catch (Exception e) {
			return false;
		}
		finally {
			unEntityManager.close();
			
		}
		return true;
	}
	
	public boolean actualizarAlumno(Alumno a) {
		
		EntityManager unEntityManager = this.factoria.createEntityManager();
		EntityTransaction transaccion = unEntityManager.getTransaction();
		transaccion.begin();
		
	
		try {
			Alumno alumnoMerge = unEntityManager.merge(a);
			unEntityManager.persist(alumnoMerge);
			transaccion.commit();

		} catch (Exception e) {
			return false;
		}
		finally {
			unEntityManager.close();
			
		}
		return true;

	}
	
	public boolean borrarAlumno (Alumno a) {
		
		EntityManager unEntityManager = this.factoria.createEntityManager();
		EntityTransaction transaccion = unEntityManager.getTransaction();
		transaccion.begin();
		
	
		try {
			Alumno alumnoMerge = unEntityManager.merge(a);
			unEntityManager.remove(alumnoMerge);
			transaccion.commit();

		} catch (Exception e) {
			return false;
		}
		finally {
			unEntityManager.close();
			
		}
		return true;
		
	}
	
	public void cerrar(){
		this.factoria.close();

	}
	
}

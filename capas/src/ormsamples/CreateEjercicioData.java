/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateEjercicioData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Entidad oRMEntidad = orm.EntidadDAO.createEntidad();
			// Initialize the properties of the persistent object here
			orm.EntidadDAO.save(oRMEntidad);
			orm.Usuario3 oRMUsuario3 = orm.Usuario3DAO.createUsuario3();
			// Initialize the properties of the persistent object here
			orm.Usuario3DAO.save(oRMUsuario3);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEjercicioData createEjercicioData = new CreateEjercicioData();
			try {
				createEjercicioData.createTestData();
			}
			finally {
				orm.EjercicioPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateEjercicioData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Entidad oRMEntidad = orm.EntidadDAO.loadEntidadByQuery(null, null);
			// Update the properties of the persistent object
			orm.EntidadDAO.save(oRMEntidad);
			orm.Usuario3 oRMUsuario3 = orm.Usuario3DAO.loadUsuario3ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Usuario3DAO.save(oRMUsuario3);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Entidad by EntidadCriteria");
		orm.EntidadCriteria oRMEntidadCriteria = new orm.EntidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEntidadCriteria.uid.eq();
		System.out.println(oRMEntidadCriteria.uniqueEntidad());
		
		System.out.println("Retrieving Usuario3 by Usuario3Criteria");
		orm.Usuario3Criteria oRMUsuario3Criteria = new orm.Usuario3Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMUsuario3Criteria.uid.eq();
		System.out.println(oRMUsuario3Criteria.uniqueUsuario3());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEjercicioData retrieveAndUpdateEjercicioData = new RetrieveAndUpdateEjercicioData();
			try {
				retrieveAndUpdateEjercicioData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEjercicioData.retrieveByCriteria();
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

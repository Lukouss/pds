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
			orm.Contacto oRMContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(oRMContacto);
			orm.Usuario3 oRMUsuario3 = orm.Usuario3DAO.loadUsuario3ByQuery(null, null);
			// Update the properties of the persistent object
			orm.Usuario3DAO.save(oRMUsuario3);
			orm.Empresa oRMEmpresa = orm.EmpresaDAO.loadEmpresaByQuery(null, null);
			// Update the properties of the persistent object
			orm.EmpresaDAO.save(oRMEmpresa);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria oRMContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMContactoCriteria.uid.eq();
		System.out.println(oRMContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Usuario3 by Usuario3Criteria");
		orm.Usuario3Criteria oRMUsuario3Criteria = new orm.Usuario3Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMUsuario3Criteria.uid.eq();
		System.out.println(oRMUsuario3Criteria.uniqueUsuario3());
		
		System.out.println("Retrieving Empresa by EmpresaCriteria");
		orm.EmpresaCriteria oRMEmpresaCriteria = new orm.EmpresaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//oRMEmpresaCriteria.uid.eq();
		System.out.println(oRMEmpresaCriteria.uniqueEmpresa());
		
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

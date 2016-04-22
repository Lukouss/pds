/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteEjercicioData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.EjercicioPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto oRMContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(oRMContacto);
			orm.Usuario3 oRMUsuario3 = orm.Usuario3DAO.loadUsuario3ByQuery(null, null);
			// Delete the persistent object
			orm.Usuario3DAO.delete(oRMUsuario3);
			orm.Empresa oRMEmpresa = orm.EmpresaDAO.loadEmpresaByQuery(null, null);
			// Delete the persistent object
			orm.EmpresaDAO.delete(oRMEmpresa);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEjercicioData deleteEjercicioData = new DeleteEjercicioData();
			try {
				deleteEjercicioData.deleteTestData();
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

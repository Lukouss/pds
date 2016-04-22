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
			orm.Contacto oRMContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dirrecion, cargo, rut, empresau, telefono, mail, apellido, nombre
			orm.ContactoDAO.save(oRMContacto);
			orm.Usuario3 oRMUsuario3 = orm.Usuario3DAO.createUsuario3();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : password, nickname
			orm.Usuario3DAO.save(oRMUsuario3);
			orm.Empresa oRMEmpresa = orm.EmpresaDAO.createEmpresa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : entidad, rlegal, rubro, rut, nombre, dirrecion
			orm.EmpresaDAO.save(oRMEmpresa);
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

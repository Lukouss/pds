/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListEjercicioData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Contacto...");
		orm.Contacto[] oRMContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		int length = Math.min(oRMContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMContactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario3...");
		orm.Usuario3[] oRMUsuario3s = orm.Usuario3DAO.listUsuario3ByQuery(null, null);
		length = Math.min(oRMUsuario3s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMUsuario3s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empresa...");
		orm.Empresa[] oRMEmpresas = orm.EmpresaDAO.listEmpresaByQuery(null, null);
		length = Math.min(oRMEmpresas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMEmpresas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria oRMContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMContactoCriteria.uid.eq();
		oRMContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] oRMContactos = oRMContactoCriteria.listContacto();
		int length =oRMContactos== null ? 0 : Math.min(oRMContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
		System.out.println("Listing Usuario3 by Criteria...");
		orm.Usuario3Criteria oRMUsuario3Criteria = new orm.Usuario3Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMUsuario3Criteria.uid.eq();
		oRMUsuario3Criteria.setMaxResults(ROW_COUNT);
		orm.Usuario3[] oRMUsuario3s = oRMUsuario3Criteria.listUsuario3();
		length =oRMUsuario3s== null ? 0 : Math.min(oRMUsuario3s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMUsuario3s[i]);
		}
		System.out.println(length + " Usuario3 record(s) retrieved."); 
		
		System.out.println("Listing Empresa by Criteria...");
		orm.EmpresaCriteria oRMEmpresaCriteria = new orm.EmpresaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEmpresaCriteria.uid.eq();
		oRMEmpresaCriteria.setMaxResults(ROW_COUNT);
		orm.Empresa[] oRMEmpresas = oRMEmpresaCriteria.listEmpresa();
		length =oRMEmpresas== null ? 0 : Math.min(oRMEmpresas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEmpresas[i]);
		}
		System.out.println(length + " Empresa record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEjercicioData listEjercicioData = new ListEjercicioData();
			try {
				listEjercicioData.listTestData();
				//listEjercicioData.listByCriteria();
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

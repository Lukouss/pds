/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListEjercicioData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Entidad...");
		orm.Entidad[] oRMEntidads = orm.EntidadDAO.listEntidadByQuery(null, null);
		int length = Math.min(oRMEntidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMEntidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario3...");
		orm.Usuario3[] oRMUsuario3s = orm.Usuario3DAO.listUsuario3ByQuery(null, null);
		length = Math.min(oRMUsuario3s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(oRMUsuario3s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Entidad by Criteria...");
		orm.EntidadCriteria oRMEntidadCriteria = new orm.EntidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//oRMEntidadCriteria.uid.eq();
		oRMEntidadCriteria.setMaxResults(ROW_COUNT);
		orm.Entidad[] oRMEntidads = oRMEntidadCriteria.listEntidad();
		int length =oRMEntidads== null ? 0 : Math.min(oRMEntidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(oRMEntidads[i]);
		}
		System.out.println(length + " Entidad record(s) retrieved."); 
		
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

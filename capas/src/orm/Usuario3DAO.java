/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Usuario3DAO {
	public static Usuario3 loadUsuario3ByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadUsuario3ByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 getUsuario3ByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return getUsuario3ByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadUsuario3ByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 getUsuario3ByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return getUsuario3ByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Usuario3) session.load(orm.Usuario3.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 getUsuario3ByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Usuario3) session.get(orm.Usuario3.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario3) session.load(orm.Usuario3.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 getUsuario3ByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario3) session.get(orm.Usuario3.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario3(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return queryUsuario3(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario3(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return queryUsuario3(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3[] listUsuario3ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return listUsuario3ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3[] listUsuario3ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return listUsuario3ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario3(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Usuario3 as Usuario3");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario3(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Usuario3 as Usuario3");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario3", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3[] listUsuario3ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario3(session, condition, orderBy);
			return (Usuario3[]) list.toArray(new Usuario3[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3[] listUsuario3ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario3(session, condition, orderBy, lockMode);
			return (Usuario3[]) list.toArray(new Usuario3[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadUsuario3ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadUsuario3ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario3[] usuario3s = listUsuario3ByQuery(session, condition, orderBy);
		if (usuario3s != null && usuario3s.length > 0)
			return usuario3s[0];
		else
			return null;
	}
	
	public static Usuario3 loadUsuario3ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario3[] usuario3s = listUsuario3ByQuery(session, condition, orderBy, lockMode);
		if (usuario3s != null && usuario3s.length > 0)
			return usuario3s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario3ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return iterateUsuario3ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario3ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return iterateUsuario3ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario3ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Usuario3 as Usuario3");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario3ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Usuario3 as Usuario3");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario3", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 createUsuario3() {
		return new orm.Usuario3();
	}
	
	public static boolean save(orm.Usuario3 usuario3) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().saveObject(usuario3);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Usuario3 usuario3) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().deleteObject(usuario3);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Usuario3 usuario3) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().getSession().refresh(usuario3);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Usuario3 usuario3) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().getSession().evict(usuario3);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario3 loadUsuario3ByCriteria(Usuario3Criteria usuario3Criteria) {
		Usuario3[] usuario3s = listUsuario3ByCriteria(usuario3Criteria);
		if(usuario3s == null || usuario3s.length == 0) {
			return null;
		}
		return usuario3s[0];
	}
	
	public static Usuario3[] listUsuario3ByCriteria(Usuario3Criteria usuario3Criteria) {
		return usuario3Criteria.listUsuario3();
	}
}

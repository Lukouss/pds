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

public class EntidadDAO {
	public static Entidad loadEntidadByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadEntidadByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad getEntidadByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return getEntidadByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadEntidadByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad getEntidadByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return getEntidadByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Entidad) session.load(orm.Entidad.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad getEntidadByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Entidad) session.get(orm.Entidad.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entidad) session.load(orm.Entidad.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad getEntidadByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Entidad) session.get(orm.Entidad.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntidad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return queryEntidad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntidad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return queryEntidad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad[] listEntidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return listEntidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad[] listEntidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return listEntidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEntidad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Entidad as Entidad");
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
	
	public static List queryEntidad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Entidad as Entidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entidad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad[] listEntidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEntidad(session, condition, orderBy);
			return (Entidad[]) list.toArray(new Entidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad[] listEntidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEntidad(session, condition, orderBy, lockMode);
			return (Entidad[]) list.toArray(new Entidad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadEntidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return loadEntidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Entidad[] entidads = listEntidadByQuery(session, condition, orderBy);
		if (entidads != null && entidads.length > 0)
			return entidads[0];
		else
			return null;
	}
	
	public static Entidad loadEntidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Entidad[] entidads = listEntidadByQuery(session, condition, orderBy, lockMode);
		if (entidads != null && entidads.length > 0)
			return entidads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEntidadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return iterateEntidadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntidadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.EjercicioPersistentManager.instance().getSession();
			return iterateEntidadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEntidadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Entidad as Entidad");
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
	
	public static java.util.Iterator iterateEntidadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Entidad as Entidad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Entidad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad createEntidad() {
		return new orm.Entidad();
	}
	
	public static boolean save(orm.Entidad entidad) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().saveObject(entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Entidad entidad) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().deleteObject(entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Entidad entidad) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().getSession().refresh(entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Entidad entidad) throws PersistentException {
		try {
			orm.EjercicioPersistentManager.instance().getSession().evict(entidad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Entidad loadEntidadByCriteria(EntidadCriteria entidadCriteria) {
		Entidad[] entidads = listEntidadByCriteria(entidadCriteria);
		if(entidads == null || entidads.length == 0) {
			return null;
		}
		return entidads[0];
	}
	
	public static Entidad[] listEntidadByCriteria(EntidadCriteria entidadCriteria) {
		return entidadCriteria.listEntidad();
	}
}

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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EntidadCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	
	public EntidadCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		mail = new StringExpression("mail", this);
		telefono = new StringExpression("telefono", this);
	}
	
	public EntidadCriteria(PersistentSession session) {
		this(session.createCriteria(Entidad.class));
	}
	
	public EntidadCriteria() throws PersistentException {
		this(orm.EjercicioPersistentManager.instance().getSession());
	}
	
	public Entidad uniqueEntidad() {
		return (Entidad) super.uniqueResult();
	}
	
	public Entidad[] listEntidad() {
		java.util.List list = super.list();
		return (Entidad[]) list.toArray(new Entidad[list.size()]);
	}
}


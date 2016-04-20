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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EntidadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	
	public EntidadDetachedCriteria() {
		super(orm.Entidad.class, orm.EntidadCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
	}
	
	public EntidadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EntidadCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
	}
	
	public Entidad uniqueEntidad(PersistentSession session) {
		return (Entidad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entidad[] listEntidad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entidad[]) list.toArray(new Entidad[list.size()]);
	}
}


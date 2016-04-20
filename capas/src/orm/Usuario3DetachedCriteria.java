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

public class Usuario3DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nickname;
	public final StringExpression password;
	
	public Usuario3DetachedCriteria() {
		super(orm.Usuario3.class, orm.Usuario3Criteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nickname = new StringExpression("nickname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Usuario3DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Usuario3Criteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nickname = new StringExpression("nickname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
	}
	
	public Usuario3 uniqueUsuario3(PersistentSession session) {
		return (Usuario3) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario3[] listUsuario3(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario3[]) list.toArray(new Usuario3[list.size()]);
	}
}


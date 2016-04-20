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

public class Usuario3Criteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression nickname;
	public final StringExpression password;
	
	public Usuario3Criteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		nickname = new StringExpression("nickname", this);
		password = new StringExpression("password", this);
	}
	
	public Usuario3Criteria(PersistentSession session) {
		this(session.createCriteria(Usuario3.class));
	}
	
	public Usuario3Criteria() throws PersistentException {
		this(orm.EjercicioPersistentManager.instance().getSession());
	}
	
	public Usuario3 uniqueUsuario3() {
		return (Usuario3) super.uniqueResult();
	}
	
	public Usuario3[] listUsuario3() {
		java.util.List list = super.list();
		return (Usuario3[]) list.toArray(new Usuario3[list.size()]);
	}
}


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

public class EmpresaCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression dirrecion;
	public final StringExpression nombre;
	public final StringExpression rut;
	public final StringExpression rubro;
	public final StringExpression rlegal;
	public final CollectionExpression entidad;
	
	public EmpresaCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		dirrecion = new StringExpression("dirrecion", this);
		nombre = new StringExpression("nombre", this);
		rut = new StringExpression("rut", this);
		rubro = new StringExpression("rubro", this);
		rlegal = new StringExpression("rlegal", this);
		entidad = new CollectionExpression("ORM_Entidad", this);
	}
	
	public EmpresaCriteria(PersistentSession session) {
		this(session.createCriteria(Empresa.class));
	}
	
	public EmpresaCriteria() throws PersistentException {
		this(orm.EjercicioPersistentManager.instance().getSession());
	}
	
	public orm.ContactoCriteria createEntidadCriteria() {
		return new orm.ContactoCriteria(createCriteria("ORM_Entidad"));
	}
	
	public Empresa uniqueEmpresa() {
		return (Empresa) super.uniqueResult();
	}
	
	public Empresa[] listEmpresa() {
		java.util.List list = super.list();
		return (Empresa[]) list.toArray(new Empresa[list.size()]);
	}
}


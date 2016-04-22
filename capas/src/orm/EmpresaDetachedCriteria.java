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

public class EmpresaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression dirrecion;
	public final StringExpression nombre;
	public final StringExpression rut;
	public final StringExpression rubro;
	public final StringExpression rlegal;
	public final CollectionExpression entidad;
	
	public EmpresaDetachedCriteria() {
		super(orm.Empresa.class, orm.EmpresaCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		dirrecion = new StringExpression("dirrecion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		rubro = new StringExpression("rubro", this.getDetachedCriteria());
		rlegal = new StringExpression("rlegal", this.getDetachedCriteria());
		entidad = new CollectionExpression("ORM_Entidad", this.getDetachedCriteria());
	}
	
	public EmpresaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EmpresaCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		dirrecion = new StringExpression("dirrecion", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		rut = new StringExpression("rut", this.getDetachedCriteria());
		rubro = new StringExpression("rubro", this.getDetachedCriteria());
		rlegal = new StringExpression("rlegal", this.getDetachedCriteria());
		entidad = new CollectionExpression("ORM_Entidad", this.getDetachedCriteria());
	}
	
	public orm.ContactoDetachedCriteria createEntidadCriteria() {
		return new orm.ContactoDetachedCriteria(createCriteria("ORM_Entidad"));
	}
	
	public Empresa uniqueEmpresa(PersistentSession session) {
		return (Empresa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empresa[] listEmpresa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empresa[]) list.toArray(new Empresa[list.size()]);
	}
}


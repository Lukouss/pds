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

public class Empresa {
	public Empresa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_EMPRESA_ENTIDAD) {
			return ORM_entidad;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid;
	
	private String dirrecion;
	
	private String nombre;
	
	private String rut;
	
	private String rubro;
	
	private String rlegal;
	
	private java.util.Set ORM_entidad = new java.util.HashSet();
	
	/**
	 * llave
	 */
	private void setUid(int value) {
		this.uid = value;
	}
	
	/**
	 * llave
	 */
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	/**
	 * dirrecion
	 */
	public void setDirrecion(String value) {
		this.dirrecion = value;
	}
	
	/**
	 * dirrecion
	 */
	public String getDirrecion() {
		return dirrecion;
	}
	
	/**
	 * nombre
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * rut
	 */
	public void setRut(String value) {
		this.rut = value;
	}
	
	/**
	 * rut
	 */
	public String getRut() {
		return rut;
	}
	
	/**
	 * rubro
	 */
	public void setRubro(String value) {
		this.rubro = value;
	}
	
	/**
	 * rubro
	 */
	public String getRubro() {
		return rubro;
	}
	
	public void setRlegal(String value) {
		this.rlegal = value;
	}
	
	public String getRlegal() {
		return rlegal;
	}
	
	private void setORM_Entidad(java.util.Set value) {
		this.ORM_entidad = value;
	}
	
	private java.util.Set getORM_Entidad() {
		return ORM_entidad;
	}
	
	public final orm.ContactoSetCollection entidad = new orm.ContactoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_EMPRESA_ENTIDAD, orm.ORMConstants.KEY_CONTACTO_EMPRESAU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}

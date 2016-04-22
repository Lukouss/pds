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

public class Contacto {
	public Contacto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CONTACTO_EMPRESAU) {
			this.empresau = (orm.Empresa) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid;
	
	private String nombre;
	
	private String apellido;
	
	private String mail;
	
	private String telefono;
	
	private orm.Empresa empresau;
	
	private String rut;
	
	private String cargo;
	
	private String dirrecion;
	
	public void setUid(int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setMail(String value) {
		this.mail = value;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	/**
	 * cargo principal
	 */
	public void setCargo(String value) {
		this.cargo = value;
	}
	
	/**
	 * cargo principal
	 */
	public String getCargo() {
		return cargo;
	}
	
	public void setDirrecion(String value) {
		this.dirrecion = value;
	}
	
	public String getDirrecion() {
		return dirrecion;
	}
	
	public void setEmpresau(orm.Empresa value) {
		if (empresau != null) {
			empresau.entidad.remove(this);
		}
		if (value != null) {
			value.entidad.add(this);
		}
	}
	
	public orm.Empresa getEmpresau() {
		return empresau;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Empresau(orm.Empresa value) {
		this.empresau = value;
	}
	
	private orm.Empresa getORM_Empresau() {
		return empresau;
	}
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}

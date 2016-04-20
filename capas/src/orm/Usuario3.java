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

public class Usuario3 {
	public Usuario3() {
	}
	
	private int uid;
	
	private String nickname;
	
	private String password;
	
	/**
	 * llave primaria
	 */
	public void setUid(int value) {
		this.uid = value;
	}
	
	/**
	 * llave primaria
	 */
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	/**
	 * apodo
	 */
	public void setNickname(String value) {
		this.nickname = value;
	}
	
	/**
	 * apodo
	 */
	public String getNickname() {
		return nickname;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}

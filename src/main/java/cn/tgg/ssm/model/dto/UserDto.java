/**
 * 
 */
package cn.tgg.ssm.model.dto;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3618995144047193970L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

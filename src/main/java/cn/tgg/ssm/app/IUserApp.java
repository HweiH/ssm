/**
 * 
 */
package cn.tgg.ssm.app;

import cn.tgg.ssm.model.dto.UserDto;

/**
 * @author Administrator
 *
 */
public interface IUserApp {

	UserDto getUserById(Integer userId);
	
}

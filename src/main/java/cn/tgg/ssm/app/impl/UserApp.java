/**
 * 
 */
package cn.tgg.ssm.app.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.tgg.ssm.app.IUserApp;
import cn.tgg.ssm.common.util.BeanUtil;
import cn.tgg.ssm.model.dto.UserDto;
import cn.tgg.ssm.model.entity.User;
import cn.tgg.ssm.service.IUserService;

/**
 * @author Administrator
 *
 */
@Component
public class UserApp implements IUserApp {

	@Resource
	private IUserService userService;
	
	@Override
	public UserDto getUserById(Integer userId) {
		User user = this.userService.getUserById(userId);
		UserDto userDto = new UserDto();
		BeanUtil.transalte(user, userDto);
		return userDto;
	}

}

/**
 * 
 */
package cn.tgg.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tgg.ssm.dao.IUserDao;
import cn.tgg.ssm.model.entity.User;
import cn.tgg.ssm.service.IUserService;

/**
 * @author Administrator
 *
 */
@Service
public class UserService implements IUserService {

	@Resource
	private IUserDao userDao;
	
	/* (non-Javadoc)
	 * @see cn.tgg.ssm.service.IUserService#getUserById(java.lang.Integer)
	 */
	@Override
	public User getUserById(Integer userId) {
		
		// Ìí¼ÓÒµÎñÂß¼­...
		
		return this.userDao.selectByPrimaryKey(userId);
	}

}

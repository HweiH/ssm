/**
 * 
 */
package cn.tgg.ssm;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.tgg.ssm.app.IUserApp;
import cn.tgg.ssm.model.dto.UserDto;

/**
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "/WEB-INF/spring/root-context.xml" })
public class TestMyBatis {

	// 日志
	private static final Logger logger = LoggerFactory.getLogger(TestMyBatis.class);

	@Resource
	private IUserApp userApp;
	
	@Test
	public void testGetUserById() {
		UserDto userDto = userApp.getUserById(2);
		logger.info(JSON.toJSONString(userDto));
	}
	
}

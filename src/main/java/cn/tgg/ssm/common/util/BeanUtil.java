/**
 * 
 */
package cn.tgg.ssm.common.util;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Administrator
 *
 */
public class BeanUtil {
	
	// 日志
	private static final Logger log = LoggerFactory.getLogger(BeanUtil.class);

	// 工具类，构造方法私有化
	private BeanUtil() {
	}

	/**
	 * ×通过常规反射形式 DTO对象转换为实体对象。如命名不规范或其他原因导致失败。
	 * 
	 * @param t
	 *            源转换的对象
	 * @param e
	 *            目标转换的对象
	 * 
	 */
	public static <T, E> void transalte(T t, E e) {
		Method[] tms = t.getClass().getDeclaredMethods();
		Method[] tes = e.getClass().getDeclaredMethods();
		for (Method m1 : tms) {
			if (m1.getName().startsWith("get")) {
				String mNameSubfix = m1.getName().substring(3);
				String forName = "set" + mNameSubfix;
				for (Method m2 : tes) {
					if (m2.getName().equals(forName)) {
						// 如果类型一致，或者m2的参数类型是m1的返回类型的父类或接口
						boolean canContinue = m2.getParameterTypes()[0].isAssignableFrom(m1.getReturnType());
						if (canContinue) {
							try {
								m2.invoke(e, m1.invoke(t));
								break;
							} catch (Exception e1) {
								log.debug("DTO 2 Entity转换失败");
								e1.printStackTrace();
							}
						}
					}
				}
			}

		}
		log.debug("转换完成");

	}

}

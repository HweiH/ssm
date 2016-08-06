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
	
	// ��־
	private static final Logger log = LoggerFactory.getLogger(BeanUtil.class);

	// �����࣬���췽��˽�л�
	private BeanUtil() {
	}

	/**
	 * ��ͨ�����淴����ʽ DTO����ת��Ϊʵ��������������淶������ԭ����ʧ�ܡ�
	 * 
	 * @param t
	 *            Դת���Ķ���
	 * @param e
	 *            Ŀ��ת���Ķ���
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
						// �������һ�£�����m2�Ĳ���������m1�ķ������͵ĸ����ӿ�
						boolean canContinue = m2.getParameterTypes()[0].isAssignableFrom(m1.getReturnType());
						if (canContinue) {
							try {
								m2.invoke(e, m1.invoke(t));
								break;
							} catch (Exception e1) {
								log.debug("DTO 2 Entityת��ʧ��");
								e1.printStackTrace();
							}
						}
					}
				}
			}

		}
		log.debug("ת�����");

	}

}

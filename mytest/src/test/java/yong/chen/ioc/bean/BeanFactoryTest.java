package yong.chen.ioc.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author 陈勇
 * @Date 2020/9/28 9:51
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimpleLoad() {
		Resource resource = new ClassPathResource("beanFactoryTest.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());
	}
}
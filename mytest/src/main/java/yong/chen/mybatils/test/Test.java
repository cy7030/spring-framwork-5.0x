package yong.chen.mybatils.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yong.chen.mybatils.IndexDao;
import yong.chen.mybatils.app.AppConfig;

/**
 * @author 陈勇
 * @Date 2020/9/28 19:40
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.getBean(IndexDao.class).query();
		System.out.println(annotationConfigApplicationContext.getBean("indexDao").getClass().getName());
	}
}

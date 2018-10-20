package guru.springframework.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware{

	public LifeCycleDemoBean(){
		System.out.println("I'm in LifeCycleBean Constructor");
	}
	
	@Override
	public void setBeanName(String name) {
		System.out.println("My bean name is " + name);
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("The LifeCycleDemoBean has been terminated");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("The LifeCycleDemoBean has his properties set");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application context has been set");
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean factory has been set");
		
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("The post construct annotated method has been called");
	}
	
	@PreDestroy
	public void preDesproy() {
		System.out.println("The preDestroy annotated method has been called");
	}
	
	public void beforeInit() {
		System.out.println("Before Init called by Bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("After Init called by Bean Post Processor");
	}
}

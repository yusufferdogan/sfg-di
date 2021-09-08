//package guru.springframework.sfgdi.services;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.*;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
//@Component
//public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
//        BeanFactoryAware, ApplicationContextAware {
//
//
//    public LifeCycleDemoBean() {
//        System.out.println("## I'm in the LifeCycleBean Constructor");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("##destroy##\t\t\t The Lifecycle bean has been terminated ");
//
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("#afterPropertiesSet#\t\t\t The LifeCycleBean has its properties set!");
//
//    }
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("#setBeanFactory#\t\t\t Bean Factory has been set");
//    }
//
//    @Override
//    public void setBeanName(String name) {
//        System.out.println("#setBeanName#\t\t\t My Bean Name is: " + name);
//
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println("#setApplicationContext#\t\t\t Application context has been set");
//    }
//
//    @PostConstruct
//    public void postConstruct(){
//        System.out.println("#postConstruct#\t\t\t The Post Construct annotated method has been called");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        System.out.println("#preDestroy#\t\t\t The Predestroy annotated method has been called");
//    }
//
//    public void beforeInit(){
//        System.out.println("#beforeInit#\t\t\t - Before Init - Called by Bean Post Processor");
//    }
//
//    public void afterInit(){
//        System.out.println("#afterInit#\t\t\t - After init called by Bean Post Processor");
//    }
//}

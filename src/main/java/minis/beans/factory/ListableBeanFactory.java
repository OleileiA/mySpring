package minis.beans.factory;

import com.minis.beans.BeansException;
import com.minis.beans.factory.BeanFactory;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {

	boolean containsBeanDefinition(String beanName);

	int getBeanDefinitionCount();

	String[] getBeanDefinitionNames();

	String[] getBeanNamesForType(Class<?> type);

	<T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

}


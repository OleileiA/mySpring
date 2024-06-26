package com.minis.beans.factory.config;

import com.minis.beans.BeansException;
import com.minis.beans.factory.support.AbstractBeanFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAutowireCapableBeanFactory
						extends AbstractBeanFactory implements AutowireCapableBeanFactory {
	private final List<com.minis.beans.factory.config.BeanPostProcessor> beanPostProcessors = new ArrayList<com.minis.beans.factory.config.BeanPostProcessor>();

	public void addBeanPostProcessor(com.minis.beans.factory.config.BeanPostProcessor beanPostProcessor) {
		this.beanPostProcessors.remove(beanPostProcessor);
		this.beanPostProcessors.add(beanPostProcessor);
	}
	public int getBeanPostProcessorCount() {
		return this.beanPostProcessors.size();
	}
	public List<com.minis.beans.factory.config.BeanPostProcessor> getBeanPostProcessors() {
		return this.beanPostProcessors;
	}

	public Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)
			throws BeansException {

		Object result = existingBean;
		for (com.minis.beans.factory.config.BeanPostProcessor beanProcessor : getBeanPostProcessors()) {
			beanProcessor.setBeanFactory(this);
			result = beanProcessor.postProcessBeforeInitialization(result, beanName);
			if (result == null) {
				return result;
			}
		}
		return result;
	}

	public Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName)
			throws BeansException {

		Object result = existingBean;
		for (BeanPostProcessor beanProcessor : getBeanPostProcessors()) {
			result = beanProcessor.postProcessAfterInitialization(result, beanName);
			if (result == null) {
				return result;
			}
		}
		return result;
	}
}

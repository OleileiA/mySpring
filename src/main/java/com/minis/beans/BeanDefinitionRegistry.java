package com.minis.beans;

public interface BeanDefinitionRegistry {
	void registerBeanDefinition(String name, com.minis.beans.BeanDefinition bd);
	void removeBeanDefinition(String name);
	BeanDefinition getBeanDefinition(String name);
	boolean containsBeanDefinition(String name);
}

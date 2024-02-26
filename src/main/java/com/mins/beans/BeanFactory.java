package com.mins.beans;

import com.mins.BeanDefinition;

public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Boolean containsBean(String name);

    void registerBean(String beanName, Object obj);
}

package com.mins.beans;

import com.mins.BeanDefinition;

public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    void registerBeanDefinition(BeanDefinition bd);

}

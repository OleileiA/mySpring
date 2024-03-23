package minis.beans.factory.config;

import com.minis.beans.factory.ListableBeanFactory;
import com.minis.beans.factory.config.AutowireCapableBeanFactory;

public interface ConfigurableListableBeanFactory
		extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

}

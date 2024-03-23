package minis.context;

import com.minis.context.ApplicationEvent;

public interface ApplicationEventPublisher {
	void publishEvent(ApplicationEvent event);
	void addApplicationListener(ApplicationListener listener);
}

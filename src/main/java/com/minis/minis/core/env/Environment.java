package com.minis.minis.core.env;

public interface Environment extends PropertyResolver {
	String[] getActiveProfiles();

	String[] getDefaultProfiles();

	boolean acceptsProfiles(String... profiles);

}


package com.minis.minis.beans;

import com.minis.beans.PropertyValue;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues{
	private final List<com.minis.beans.PropertyValue> propertyValueList;

	public PropertyValues() {
		this.propertyValueList = new ArrayList<com.minis.beans.PropertyValue>(10);
	}

	public List<com.minis.beans.PropertyValue> getPropertyValueList() {
		return this.propertyValueList;
	}

	public int size() {
		return this.propertyValueList.size();
	}

	public void addPropertyValue(com.minis.beans.PropertyValue pv) {
		this.propertyValueList.add(pv);
	}

//	public void addPropertyValue(String propertyType, String propertyName, Object propertyValue) {
//		addPropertyValue(new PropertyValue(propertyType, propertyName, propertyValue));
//	}

	public void removePropertyValue(com.minis.beans.PropertyValue pv) {
		this.propertyValueList.remove(pv);
	}

	public void removePropertyValue(String propertyName) {
		this.propertyValueList.remove(getPropertyValue(propertyName));
	}


	public com.minis.beans.PropertyValue[] getPropertyValues() {
		return this.propertyValueList.toArray(new com.minis.beans.PropertyValue[this.propertyValueList.size()]);
	}

	public com.minis.beans.PropertyValue getPropertyValue(String propertyName) {
		for (com.minis.beans.PropertyValue pv : this.propertyValueList) {
			if (pv.getName().equals(propertyName)) {
				return pv;
			}
		}
		return null;
	}

	public Object get(String propertyName) {
		PropertyValue pv = getPropertyValue(propertyName);
		return (pv != null ? pv.getValue() : null);
	}

	public boolean contains(String propertyName) {
		return (getPropertyValue(propertyName) != null);
	}

	public boolean isEmpty() {
		return this.propertyValueList.isEmpty();
	}


}


package com.minis.minis.test;

import com.minis.beans.factory.annotation.Autowired;
import com.minis.test.BaseBaseService;

public class BaseService {
	@Autowired
	private com.minis.test.BaseBaseService bbs;

	public com.minis.test.BaseBaseService getBbs() {
		return bbs;
	}
	public void setBbs(BaseBaseService bbs) {
		this.bbs = bbs;
	}
	public BaseService() {
	}
	public void sayHello() {
		System.out.print("Base Service says hello");
		bbs.sayHello();
	}
}

package com.springbook.ioc.injection;

import java.util.List;
import java.util.Set;

public class CollectionBean {
	private Set<String> addressSet;
	private List<String> addressList;
	
	public void setAddressList(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	public List<String> getAddressList() {
		return addressList;
	}
}

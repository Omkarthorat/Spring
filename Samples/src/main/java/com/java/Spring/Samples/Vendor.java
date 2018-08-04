package com.java.Spring.Samples;

public class Vendor {

	private int vendorId;
	private String vendorName;
	private String vendorAddress;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	@Override
	public String toString() {
		return "\n Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ "]";
	}

	public Vendor() {
		super();
		System.out.println("vendor default const");	}

	
	public Vendor(int vendorId, String vendorName, String vendorAddress) {
		super();
		System.out.println("vendor param const");
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
	}


}

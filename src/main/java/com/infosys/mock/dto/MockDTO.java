package com.infosys.mock.dto;

import java.time.LocalDate;
import java.util.Date;

public class MockDTO {
	private String plnt;
	private String purchDoc;

	private String createdOn;
	private String vendor;
	
	private String material;
	
	private String currency;
	private double netPrice;

	public String getPlnt() {
		return plnt;
	}

	public void setPlnt(String plnt) {
		this.plnt = plnt;
	}

	public String getPurchDoc() {
		return purchDoc;
	}

	public void setPurchDoc(String purchDoc) {
		this.purchDoc = purchDoc;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	@Override
	public String toString() {
		return "MockDTO [plnt=" + plnt + ", purchDoc=" + purchDoc + ", createdOn=" + createdOn + ", vendor=" + vendor
				+ ", material=" + material + ", currency=" + currency + ", netPrice=" + netPrice + "]";
	}

	
	
	
    
   
}

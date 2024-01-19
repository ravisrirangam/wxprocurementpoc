package com.infosys.mock.entity;


import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;


import javax.persistence.Entity;



import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity

public class Mock {
	//@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	//@NotNull
	//@Pattern(regexp="^-\\d+$", message="Invalid Request")
	
	private String plnt;
	private String purchDoc;

	private String createdOn;
	private String vendor;
	
	private String material;
	
	private String currency;
	private double netPrice;
	private String pOrg;
	private String commodity;
	private String matDoc;
	private String pstgDate;
	private double orderQuantity;
	private double grQty;
	private double grValue;
	private double per;

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
	

	public String getpOrg() {
		return pOrg;
	}

	public void setpOrg(String pOrg) {
		this.pOrg = pOrg;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public String getMatDoc() {
		return matDoc;
	}

	public void setMatDoc(String matDoc) {
		this.matDoc = matDoc;
	}

	public String getPstgDate() {
		return pstgDate;
	}

	public void setPstgDate(String pstgDate) {
		this.pstgDate = pstgDate;
	}

	public double getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(double orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getGrQty() {
		return grQty;
	}

	public void setGrQty(double grQty) {
		this.grQty = grQty;
	}

	public double getGrValue() {
		return grValue;
	}

	public void setGrValue(double grValue) {
		this.grValue = grValue;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Mock [plnt=" + plnt + ", purchDoc=" + purchDoc + ", createdOn=" + createdOn + ", vendor=" + vendor
				+ ", material=" + material + ", currency=" + currency + ", netPrice=" + netPrice + ", pOrg=" + pOrg
				+ ", commodity=" + commodity + ", matDoc=" + matDoc + ", pstgDate=" + pstgDate + ", orderQuantity="
				+ orderQuantity + ", grQty=" + grQty + ", grValue=" + grValue + ", per=" + per + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(commodity, createdOn, currency, grQty, grValue, matDoc, material, netPrice, orderQuantity,
				pOrg, per, plnt, pstgDate, purchDoc, vendor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mock other = (Mock) obj;
		return Objects.equals(commodity, other.commodity) && Objects.equals(createdOn, other.createdOn)
				&& Objects.equals(currency, other.currency)
				&& Double.doubleToLongBits(grQty) == Double.doubleToLongBits(other.grQty)
				&& Double.doubleToLongBits(grValue) == Double.doubleToLongBits(other.grValue)
				&& Objects.equals(matDoc, other.matDoc) && Objects.equals(material, other.material)
				&& Double.doubleToLongBits(netPrice) == Double.doubleToLongBits(other.netPrice)
				&& Double.doubleToLongBits(orderQuantity) == Double.doubleToLongBits(other.orderQuantity)
				&& Objects.equals(pOrg, other.pOrg)
				&& Double.doubleToLongBits(per) == Double.doubleToLongBits(other.per)
				&& Objects.equals(plnt, other.plnt) && Objects.equals(pstgDate, other.pstgDate)
				&& Objects.equals(purchDoc, other.purchDoc) && Objects.equals(vendor, other.vendor);
	}

	
    
    
	


	
}

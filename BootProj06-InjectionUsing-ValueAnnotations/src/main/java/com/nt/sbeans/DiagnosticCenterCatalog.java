package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("center")
//@PropertySource("info.properties")
public class DiagnosticCenterCatalog {

	@Value("${dc.xrayRate}")
	private Double xrayPrice;
	@Value("${dc.ctscanRate}")
	private Double ctscanPrice;
	@Value("${dc.mriscanRate}")
	private Double MRIScanPrice;
	@Value("${dc.ecgscanRate}")
	private Double ecgPrice;

	public Double getXrayPrice() {
		return xrayPrice;
	}

	public void setXrayPrice(Double xrayPrice) {
		this.xrayPrice = xrayPrice;
	}

	public Double getCtscanPrice() {
		return ctscanPrice;
	}

	public void setCtscanPrice(Double ctscanPrice) {
		this.ctscanPrice = ctscanPrice;
	}

	public Double getMRIScanPrice() {
		return MRIScanPrice;
	}

	public void setMRIScanPrice(Double mRIScanPrice) {
		MRIScanPrice = mRIScanPrice;
	}

	public Double getEcgPrice() {
		return ecgPrice;
	}

	public void setEcgPrice(Double ecgPrice) {
		this.ecgPrice = ecgPrice;
	}

	@Override
	public String toString() {
		return "DiagnosticCenterCatalog [xrayPrice=" + xrayPrice + ", ctscanPrice=" + ctscanPrice + ", MRIScanPrice="
				+ MRIScanPrice + ", ecgPrice=" + ecgPrice + "]";
	}

}

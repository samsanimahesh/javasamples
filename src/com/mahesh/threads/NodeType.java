package com.mahesh.threads;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="nodeType")
@XmlAccessorType(XmlAccessType.FIELD)
public class NodeType {
	private String connectivityInfoId;
	private int connectivityInfoIdValue;
	private String connectivityInfoMo;
	private int connectivityInfoMoValue;
	private boolean fmSupported;
	private boolean cmSupported;
	private boolean pmSupported;
	
	public String getConnectivityInfoId() {
		return connectivityInfoId;
	}
	public void setConnectivityInfoId(String connectivityInfoId) {
		this.connectivityInfoId = connectivityInfoId;
	}
	public int getConnectivityInfoIdValue() {
		return connectivityInfoIdValue;
	}
	public void setConnectivityInfoIdValue(int connectivityInfoIdValue) {
		this.connectivityInfoIdValue = connectivityInfoIdValue;
	}
	public String getConnectivityInfoMo() {
		return connectivityInfoMo;
	}
	public void setConnectivityInfoMo(String connectivityInfoMo) {
		this.connectivityInfoMo = connectivityInfoMo;
	}
	public int getConnectivityInfoMoValue() {
		return connectivityInfoMoValue;
	}
	public void setConnectivityInfoMoValue(int connectivityInfoMoValue) {
		this.connectivityInfoMoValue = connectivityInfoMoValue;
	}
	public boolean isFmSupported() {
		return fmSupported;
	}
	public void setFmSupported(boolean fmSupported) {
		this.fmSupported = fmSupported;
	}
	public boolean isCmSupported() {
		return cmSupported;
	}
	public void setCmSupported(boolean cmSupported) {
		this.cmSupported = cmSupported;
	}
	public boolean isPmSupported() {
		return pmSupported;
	}
	public void setPmSupported(boolean pmSupported) {
		this.pmSupported = pmSupported;
	}

	
}



import java.util.ArrayList;
import java.util.Collections;

public class WifiNetwork implements Comparable<WifiNetwork> {
	private String ID, time, LAT, LON, ALT, SSID, MAC, Frecuency, Signal;

	public WifiNetwork() {
		this.ID = null;
		this.time = null;
		this.LAT = null;
		this.LON = null;
		this.ALT = null;
		this.SSID = null;
		this.MAC = null;
		this.Frecuency = null;
		this.Signal = null;

	}

	public WifiNetwork(String[] line) {
		this.ID = line[0];
		this.time = line[4];
		this.LAT = line[7];
		this.LON = line[8];
		this.ALT = line[9];
		this.SSID = line[2];
		this.MAC = line[1];
		this.Frecuency = convertToFrequency(Integer.parseInt(line[5]));
		this.Signal = line[6];
	}

	public WifiNetwork(WifiNetwork Other) {
		this.ID = Other.ID;
		this.time = Other.time;
		this.LAT = Other.LAT;
		this.LON = Other.LON;
		this.ALT = Other.ALT;
		this.SSID = Other.SSID;
		this.MAC = Other.MAC;
		this.Frecuency = Other.Frecuency;
		this.Signal = Other.Signal;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLAT() {
		return LAT;
	}

	public void setLAT(String lAT) {
		LAT = lAT;
	}

	public String getLON() {
		return LON;
	}

	public void setLON(String lON) {
		LON = lON;
	}

	public String getALT() {
		return ALT;
	}

	public void setALT(String aLT) {
		ALT = aLT;
	}

	public String getSSID() {
		return SSID;
	}

	public void setSSID(String sSID) {
		SSID = sSID;
	}

	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		MAC = mAC;
	}

	public String getFrecuency() {
		return Frecuency;
	}

	public void setFrecuency(String frecuency) {
		Frecuency = frecuency;
	}

	public String getSignal() {
		return Signal;
	}

	public void setSignal(String signal) {
		Signal = signal;
	}

	public String printCommonProp() {
		return this.time + "," + this.ID + "," + this.LAT + "," + this.LON + "," + this.ALT;
	}

	public String toString() {
		return this.SSID + "," + this.MAC + "," + this.Frecuency + "," + this.Signal;
	}

	public int compareTo(WifiNetwork wn) {

		return this.getSignal().compareTo(wn.getSignal());
	}

	// ***************************PRIVATE*****************************

	private String convertToFrequency(int channel) {
		int frequency;
		if (channel >= 1 && channel <= 14) {
			frequency = (channel - 1) * 5 + 2412;
			return frequency + "";
		} else if (channel >= 36 && channel <= 165) {
			frequency = (channel - 34) * 5 + 5170;
			return frequency + "";
		}
		return "";
	}

}

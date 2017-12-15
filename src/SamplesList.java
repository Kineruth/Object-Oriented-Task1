package src;

import java.util.ArrayList;
/**
 * Date: 23-11-2017
 * This class represents an ArrayList of all the samples created from the file.
 * The samples are sorted by signals in an ascending order.
 * @author Kineret Ruth Nahary & Yakir Amar
 *
 */
public class SamplesList {
	private ArrayList<Sample> unitedSamples;
/**
 * Default constructor.
 */
	public SamplesList() {
		this.unitedSamples = new ArrayList<Sample>();
	}
	/**
	 * Copy Constructor
	 * @param s other array list with samples
	 */
	public SamplesList(ArrayList<Sample> s){
		this.unitedSamples =s;
	}
	
/**
 * This function adds a sorted sample (by signals) to this united. 
 * @param sample a given sample of WiFiNetworks.
 */
	public void add(Sample sample) {
		ArrayList<WiFiNetwork> sortedNetworks =sortBySignal(sample.getCommonNetworks()); 
		sample.setCommonNetworks(sortedNetworks);
		this.unitedSamples.add(sample);
	}
/**
 * 
 * @return this united size.
 */
	public int listSize() {
		return this.unitedSamples.size();
	}
/**
 * 
 * @param i a given index.
 * @return this united's Sample at the given index.
 */
	public Sample getSample(int i) {
		return this.unitedSamples.get(i);
	}
/**
 * 
 * @return this united ArrayList.
 */
	public ArrayList<Sample> getSamplesList() {
		return this.unitedSamples;
	}
/**
 * This function sorts a given Sample of WiFiNetworks before adding it to this united ArrayList.
 * It sorts all the WiFiNetworks in the Sample by signals in an ascending order using the Comparable's compareTo function.
 * Adds to the list up till 10 WiFiNetworks.
 * @param sampleNetworks a given Sample's WiFiNetworks' ArrayList.
 * @return a sorted WiFiNetworks' ArrayList.
 */
	public ArrayList<WiFiNetwork> sortBySignal(ArrayList <WiFiNetwork>sampleNetworks) {
		ArrayList<WiFiNetwork> networks = new ArrayList<WiFiNetwork>();
		sampleNetworks.sort(null);
		for (int i = 0; (i < 10) &&( i <sampleNetworks.size()); i++) {
			networks.add(sampleNetworks.get(i));
		}
		return networks;

	}


}

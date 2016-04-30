package Proxy.Lab3.Choice2;

import java.util.Hashtable;
/*Real Subject*/
public class ReferenceCountedHashTable extends Hashtable {

	private int proxyCount = 1;

	// Constructor
	public ReferenceCountedHashTable() {
		super();
	}

	// Return a copy of this object with proxyCount set back to 1.
	public synchronized Object clone() {
		ReferenceCountedHashTable copy;
		copy = (ReferenceCountedHashTable) super.clone();
		copy.proxyCount = 1;
		return copy;
	}

	// Return the number of proxies using this object.
	synchronized int getProxyCount() {
		return proxyCount;
	}

	// Increment the number of proxies using this object by one.
	synchronized void addProxy() {
		proxyCount++;
	}

	// Decrement the number of proxies using this object by one.
	synchronized void removeProxy() {
		proxyCount--;
	}

}

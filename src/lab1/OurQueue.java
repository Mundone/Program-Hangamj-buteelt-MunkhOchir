package lab1;

public class OurQueue {
	Object arr[];
	
	
	public OurQueue(int defaultLength) {
		if(defaultLength < 1)
			System.out.println("Queue 1 урттай байж болохгүй.");
		arr = new Object[defaultLength];
	}
	
	public OurQueue() {
		this(2);
	}
	
	int getLength() {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				return i;
			}
		}
		return arr.length;
	}
	void add(Object elementToAdd) {
		if(getLength()+1 == arr.length) {
			Object newArr[] = new Object[arr.length*2];
			newArr[0] = elementToAdd;
			System.arraycopy(arr, 0, newArr, 1, getLength());
			arr = newArr;
		}
		else {
			if(getLength() != 0) {
				for(int i=getLength()-1; i>=0; i--) {
					arr[i+1] = arr[i];
				}
				
			}
			arr[0] = elementToAdd;
		}
	}
	
	void remove() {
		arr[getLength()-1] = null;
	}
	
	boolean isExist(Object element) {
		for(int i=0; i<getLength(); i++) {
			if((arr[i].toString()).equals(element.toString()))
				return true;
		}
		return false;
	}
	
	public String toString() {
		String s = "";
		for(int i=0; i<getLength(); i++) {
			s += arr[i] + " ";
		}
		return s;
	}
//	public Object isEmpty()
//	{	
//		return 0;
//	}
	public Object getFrontElement()
	{
		return arr[0];
	}
	public Object getRearElement()
	{
		return arr[getLength()-1];
	}
	//sjvdngviodrv
}

package megha_practices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashDemo {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		//Set hs=new TreeSet();
		System.out.println("Size:\t"+hs.size());
		System.out.println("Content:\t"+hs);
		hs.add(new Integer(6));
		hs.add(new Integer(6));
		hs.add(new Integer(6));
		hs.add(new Integer(-20));
		hs.add(new Integer(0));
		hs.add(new Integer(100));
		hs.add(new Integer(4));
		hs.add("megha");
		System.out.println("Size:\t"+hs.size());
		System.out.println("Content:\t"+hs);
		System.out.println("Retriving the data");
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
			
		}

	}

}

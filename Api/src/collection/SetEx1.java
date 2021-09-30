package collection;

import java.awt.List;
import java.security.cert.CollectionCertStoreParameters;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* Set - 중복을 허용하지 않음, 순서가 없다.
 * 	   - 구현클래스 - HashSet, TreeSet
 */

public class SetEx1 {
	public static void main(String[] args) {
		
		Collection<Integer> d = new HashSet<Integer>();
		
		Set<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		
		System.out.println(set1);
		System.out.println();
		 
		for(String str : set1) {
			System.out.println(str);
		}
		
		System.out.println();
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("4");
		set2.add("1");
		
		for(String str : set2) {
			System.out.println(str);
		}
		
	}
}

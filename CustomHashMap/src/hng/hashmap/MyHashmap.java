package hng.hashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashmap {
	
	class KvPair{
		Object key;
		Object value;
		
		public void add(Object k, Object v) {
			this.key=k;
			this.value=v;
		}
	}
		
		private KvPair kv;
		private List<KvPair> ListKV;
		
		public MyHashmap() {
			this.ListKV = new ArrayList<KvPair>();
		}
		
		public void put(Object k,Object v) {
			this.kv=new KvPair();
			kv.add(k, v);
			for(int i=0;i<ListKV.size();i++) {     // Check for the same key before adding in List
				KvPair kv1 = ListKV.get(i);
				if(kv1.key.equals(k)) {
					ListKV.remove(i);             // Removing duplicates
					break;
				}
			}
			ListKV.add(kv);
		}
		
		public Object get(Object k) {
			for(int i=0;i<ListKV.size();i++) {
				KvPair li = ListKV.get(i);
				if(k==li.key) {
					return li.value;
					
				}
			}
			return null;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashmap my = new MyHashmap();
		my.put(1, 1);
		my.put(2, 4);
		my.put(3, 9);
		my.put(4, 16);
		my.put(3, 4);
	
		System.out.println(my.get(3));

	}

}

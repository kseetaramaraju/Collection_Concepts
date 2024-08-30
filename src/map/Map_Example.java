package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Example {
	public static void main(String[] args) {


		Map<Integer,String> map=new HashMap<Integer, String>();

		map.put(1,"ram");
		map.put(2,"abiram");
		map.put(3,"ramkumar");

		Set<Integer> keySet = map.keySet();

		for(Integer k:keySet)
		{
			System.out.println(k+" --> "+map.get(k));
		}

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for(Entry<Integer,String> e:entrySet)
		{
			System.out.println(e.getKey()+"----->"+e.getValue());
		}


	}
}

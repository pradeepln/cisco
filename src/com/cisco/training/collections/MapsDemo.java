package com.cisco.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo {

	public static void main(String[] args) {
		Map<String,Integer> runsMap = new LinkedHashMap<>();
		
		runsMap.put("Virat",100);
		runsMap.put("Tewatia", 35);
		runsMap.put("Warner",83);
		
		int runsByVirat = runsMap.get("Virat");
		System.out.println("Virat = "+runsByVirat);
		
		Integer runsByRohit = runsMap.get("Rohit");
		System.out.println("Rohit = "+runsByRohit);
		
		Set<String> keys = runsMap.keySet();
		for(String aKey : keys) {
			System.out.println(aKey + " ---> "+ runsMap.get(aKey));
		}
	}

}

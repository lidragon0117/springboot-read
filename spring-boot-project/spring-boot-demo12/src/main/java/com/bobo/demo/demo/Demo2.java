package com.bobo.demo.demo;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : lilong
 * @date : 2025-06-09 17:00
 * @description :
 */
public class Demo2 {
	public static void main(String[] args) {
		ServiceLoader<String> providers = ServiceLoader.load(String.class);
		Iterator<String> iterator = providers.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println("结果:"+next);
		}
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("5");
		list1.add("6");

		List<String> list2 = new ArrayList<String>();
		list2.add("2");
		list2.add("3");
		list2.add("7");
		list2.add("8");
		List<String> listAll = list1.parallelStream().collect(toList());
		List<String> listAll2 = list2.parallelStream().collect(toList());
		listAll.addAll(listAll2);

		// 去重并集
		List<String> listAllDistinct = listAll.stream().distinct().collect(toList());
		System.out.println("---得到去重并集 listAllDistinct---");
		listAllDistinct.parallelStream().forEachOrdered(System.out :: println);

		System.out.println("---原来的List1---");
		list1.parallelStream().forEachOrdered(System.out :: println);
		System.out.println("---原来的List2---");
		list2.parallelStream().forEachOrdered(System.out :: println);

		//SpringApplication.run(DemoApplication.class, args);
	}

}

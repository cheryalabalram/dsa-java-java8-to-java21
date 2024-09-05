package com.balram.demo.java8;

import java.util.Arrays;

import static com.balram.demo.ds.sorting.SortngTech.insertionSort;

public class Sample {

	public static void temp() {

//		List<String> strings = List.of("Balram","Ch","Hyderabad","Ch");
//		String s = "Balram";
//		Set<Character> characters = new HashSet<>();
//		for (int i=0; i< s.length()-1; i++){
//			char c = s.charAt(i);
//			if(characters.add(c)){
//
//			}else{
//				System.out.println("Duplicated character : " +c);
//			}
//
//
//		}

//	}
//}

//a =10;
// b =20;']

//a=a

//		strings.forEach( string -> {
////			System.out.println(string);
//		});
//
//		strings
//				.stream()
//				.distinct()
//				.forEach( e -> System.out.println(e));

		int[] ints = {6,5,2,8,9,4};
		Arrays.stream(ints).boxed().forEach(System.out::print);
		for(int i=0; i<ints.length-1; i++){
				if(ints[i] > ints[i+1]){
					int temp = ints[i];
					ints[i] = ints[i+1];
					ints[i+1] = temp;
			}
		}

		System.out.println();
		Arrays.stream(ints).boxed().forEach(System.out::print);
		System.out.println();
		swap();
	}

	public static final void swap(){
		int[] ints = {2,1};
		int temp = ints[1];
		ints[1] = ints[0];
		ints[0] = temp;
		Arrays.stream(ints).boxed().forEach(System.out::println);
	}

	public static void swapIntsWithTemp(){
		int a = 5;
		int b = 10;

		System.out.println("Before swap: a = " + a + ", b = " + b);

		// Swap without a temporary variable using arithmetic
		a = a + b; // a now becomes 15
		b = a - b; // b now becomes 5
		a = a - b; // a now becomes 10

		System.out.println("After swap: a = " + a + ", b = " + b);
	}



	public static void main(String[] args) {
		int[] ints = {6,5,2,8,9,4};
		insertionSort(ints);
//		selectionSort(ints);
//		bubbleSort(ints);
//		Arrays.stream(ints).boxed().forEach(System.out::println);
//		swapIntsWithTemp();
	}
}

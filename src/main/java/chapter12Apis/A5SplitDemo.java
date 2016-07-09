package chapter12Apis;

public class A5SplitDemo {
	public static void main(String[] args) {
		for(String token : "A,B,C".split(",")){
			System.out.println(token);
		}
		
		for(String token : "AaaBaaC".split("aa")){
			System.out.println(token);
		}
	}
}

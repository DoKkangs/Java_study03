package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);  //java와 android가 합쳐지는게 아니라 새로운 메모리 공간이 생성됨.
		
		
		System.out.println(System.identityHashCode(java)); 
		
		
	}
}

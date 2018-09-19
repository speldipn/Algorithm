package fastcampus;

public class Fibonachi {

	public static void main(String[] args) {	
		
		System.out.println(prob(2));
		System.out.println(prob(3));
		System.out.println(prob(4));		
		System.out.println(prob(5));
		System.out.println(prob(10));
		System.out.println(prob(100));		
		System.out.println(prob(300));
		
		
		// 강의 풀이
		//1 . 첫번째 두번째 세번재 값을 저장할 변수를 선언한다.
		//2. 수열의 총 개수를 저장하는 결과변수를 선언한다.
		//3. 앞의 두수를 더한값이 입력값 x보다 작을때까지 반복문을 실행한다.
			// 3.1 반복문 안에서 결과변수의 카운트를 증가시킨다.
		//4. 결과 변수를 출력한다.
		
		System.out.println();
		
		int x = 10;
		int a = 0;
		int b = 1;
		int c = 1;
		
		int count = 2;
		System.out.print("0.1.");
		
		while(true) {
			c = a + b;
			
			if(c >= x)break;			
			System.out.print(c + ".");
			
			a = b;
			b = c;
			
			count = count + 1;
		}
		System.out.println();
		System.out.println(count);	
	}
	
	static int prob(int value) {
		int count = 3;		
		int pos = 3;
		
		if(value <= 1) {
			System.out.println("1보다 큰 값을 대입하세요");
			return (-1);
		}	
		
		while(getFibonachi(pos) < value) {
			pos = pos + 1;
			count = count + 1;
		}
		
		return count;		
	}
	
	static int getFibonachi(int index) {
		int result = 0;
		
		if(index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
			
		} else {
			return(getFibonachi(index-2) + getFibonachi(index-1));			
		}		
	}
	
	static void getFibonachiArray(int count) {
		for(int i = 0; i < count; ++i) {
			System.out.print(getFibonachi(i));
			System.out.print(" ");
		}
		System.out.println();		
	}
	

}

package prob5;

public class MainApp {

	public static void main(String[] args) {
		try {
			MyStack stack = new MyStack(3); // 리사이즈, 스트링 버퍼 
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				// 런타임 에러
				// generic을 사용하지 않으면 코드 작성시 타입 체크를 하지 않음
				// Integer s = (Integer)stack.pop();
				String s = stack.pop();    //비어 있지 않으면 스트링 객체를 하나씩 배출
				
				System.out.println( s );   
			}

			System.out.println("======================================");

			stack = new MyStack(3);
			stack.push("Hello");                //헬로를 넣고

			System.out.println(stack.pop());    //헬로 빼고
			System.out.println(stack.pop());    //에러 발생 
			
		} catch ( MyStackException ex) {
			System.out.println( ex );
		}

	}

}

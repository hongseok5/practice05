package prob5;

public class MyStack {
	
	
	private int top;
	private String[] buffer;
	

	public MyStack(int i) {
		top = -1;
		buffer = new String[i];
	}

	public boolean isEmpty() {

	
		return top==-1;
	}

	public void push(String string) {
		if( top == buffer.length - 1 ) { //stack is full
			resize();
		}
		
		buffer[ ++top ] = string;

	}

	public String pop() throws MyStackException {
		if( isEmpty() ) {
			throw new MyStackException( "stack is empty" );
		}
		String result = buffer[ top ];
		buffer[ top-- ] = null;        //없으면 무한루프
		
		return result;
	}


	public void resize() {
		String [] temp = new String [top*2];
		for( int i = 0; i <= top; i++ ) {
			temp[ i ] = buffer[ i ];
		}
		
		
		buffer=temp;
	}
	
}

package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		/*
		
		9 5 3 8 60 20 1   // i, i+1 자리 바꾸고 i+1이랑 i+2가 값 비교 , 바꾸지 않음 i+3과 i+4가 비교해서 바꿈....i+3(3)은 뒤에서 두번째 안착 
		9 5 8 60 20 3 1   // 한번 반복 
		9 5 8 60 20 3 1   // 두 번째 반복. 다시 i 부터 시작. i+1 자리 바꾸고 i+2 는 뒤에서 세 번째 안착.  
		9 8 60 20 5 3 1   // 세 번째 반복 . 8이   60,  20과 연속으로 바뀜 
		9 60 20 8 5 3 1   // 마지막 반복, 9가 제자리로 
		
		
		*/
		
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}

		
				for(int j=0;j<6;j++) {
		
				int left=0;
				int right=left+1;
				
				for(int i=0; i<6; i++) {
				if(array[left+i]<array[right+i]){
				temp = array[left+i];
				array[left+i] = array[right+i];
				array[right+i] = temp;
				
				} // if문
				}// 내부 for문
				
				}//외부 포문 
				
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
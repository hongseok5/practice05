package prob3;

public class Sparrow extends Bird {

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		this.getName();
		System.out.println("참새("+name+")가 날아 다닙니다");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("참새("+name+")가 소리내어 웁니다");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참새의 이름은(" + name + ")입니다.";
	}
	
}

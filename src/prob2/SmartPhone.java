package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if ( function.equals("음악") ) {
			playMusic();
			return;
		}
		
		else if ( function.equals("통화") ) {
			super.execute(function);
		}
		else if ( function.equals("앱") ) {
			app();
		}
		else 
			System.out.println("명령을 확인할 수 없습니다.");
			
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	protected void app() {
		System.out.println("앱 실행");
	}
	
	
	
	
}

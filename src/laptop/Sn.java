package laptop;

import java.util.ArrayList;
import java.util.Scanner;

//1.노트북 스펙 -스펙 크기.무게로작성하고  - 클래스(Spec) - 승대

//2. 가격 - 30만원부터 180만원까지 설정 - 클래스 (Price) - 주남
		
//3. 제조사 - 4군데 - 삼성. 엘지 . 아수스 . 레노버 - 클래스(Sn) - 병원

//메인 - 스펙 가격 제조사를 입력해서 원하는 결과물 찾기 


public class Sn {
	
	private String Sn;

	public String getSn() {
		return Sn;
	}
	
	public void setSn(String sn) {
		this.Sn = sn;
	}
	
	public ArrayList Snname() {
		
		ArrayList name = new ArrayList();
		name.add("삼성");
		name.add("엘지");
		name.add("아수스");
		name.add("레노버");
		return name;
		
	}
	
	
	
}

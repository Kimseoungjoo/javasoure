package object;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	
	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) { 
		// value1.equals(value2)
		// Object obj = value2 
		
		// Object obj = value2; obj.value(X) -> 자식 객체로 형변환 
		// 캐스팅을 무조건 해야한다 
		Value v = (Value)obj;
		
		if(this.value == v.value) {
			return true;
		}
		return false /*super.equals(obj)<< 주소 값을 가져온다*/;
	}
	
	//toString 오버라이딩
	// int 값을 문자열로 변경 : int+"", String.valueOf(int)
	@Override
	public String toString() {
		
		
		return value+""/*super.toString()주소 값*/;
	}
	
}

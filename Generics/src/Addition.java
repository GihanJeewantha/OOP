
public class Addition<T> {
	T number1;
	T number2;

	public T cal(T res) {
		res=number1+number2;
		return res;
	}
}

public class test{
	public static void main(String[] args) {
		Addition<Integer> ob = new Addition<>();
		ob.cal(34);
		
	}
}


public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	public static boolean isEven(int num){
		if (num % 2 == 0) {
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int num){
		if(num % 2 == 0){
			return false;
		}
		else{
			return true;
		}
	}
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger number){
		if(number.value % 2 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isOdd(MyInteger number){
		if(number.value % 2 ==0){
			return false;
		}
		else{
			return true;
		}
	}
	public static boolean isPrime(MyInteger number){
			for(int i=2;i<number.value;i++) {
		        if(number.value%i==0)
		            return false;
		    }
		    return true;
	}
	public boolean equals(int num){
		if(num == this.value){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean equals(MyInteger number){
		if (number.value == this.value){
			return true;
		}
		else {
			return false;
		}
	}
	public static int parseInt(){
		char [] newValue ={'1','2','3','4','5'};
		return Integer.parseInt(String.valueOf(newValue));
	}
	public static int parseInt(String o){
		return Integer.parseInt("o");
	}
}
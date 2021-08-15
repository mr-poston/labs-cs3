public class BaseConversion {
	private String number;
	private int base;

	public BaseConversion(String num, int b) {
	
	}

	public void setNumBase(String num, int b) {

	}

	private int convertToTen() {
		int digits = number.length();
		int base10 = 0;


		return base10;
	}

	public String getNum(int newBase) {
		int base10 = convertToTen();
		String newNum = "";


		return newNum + "-" + newBase;
	}

	public String toString() {
		return number + "-" + base;
	}
}

package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registerNumber {
	public static boolean checkRegNum(String regNum) {
		Pattern pattern =Pattern.compile("[\\u0410-\\u044f]{2}[\\d]{2}([0-2][0-9]|[3][0-2])([0-2][0-9]|[3][0-1][\\d]{2})");
		Matcher matcher = pattern.matcher(regNum);
        if (matcher.find()){
            return true;
        }
        return false;
        /*
         * U+0410  U+042F  tom useg  [\\u0410-\\u044f]{2}\\d\\d
         * U+0430   U+044F  jijig useg[1-3[01]][\\d]{2}
         * */
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pattern p=new Pattern.("[,\\s]+");

		Scanner input = new Scanner(System.in);
		System.out.println("SSNNNNNNNN  РД оруулна уу:");
		String regNum = input.nextLine();
		if(checkRegNum(regNum)==true) {
			System.out.print("Зөв утга оруулсан байна.");
		}
		else {
			System.out.print("Өгөгдсөн загвараар оруулна уу.");
		}
	}

}


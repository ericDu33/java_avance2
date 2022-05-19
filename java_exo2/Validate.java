package java_exo2;

import java.util.regex.Pattern;

public class Validate {

	public static boolean isEmail(String email) {
		boolean ok= false;
		
		// test si @ et un .
		if (Pattern.matches(".+@.+\\..+", email) == true){
			ok = true;
		} 
		
		return ok;		
	}

	public static boolean isPassword(String password) {
		boolean ok=false;
		
		if (password.length()>=8 && password.length()<=20) {
			ok = true;
		}
		return ok;
	}

}

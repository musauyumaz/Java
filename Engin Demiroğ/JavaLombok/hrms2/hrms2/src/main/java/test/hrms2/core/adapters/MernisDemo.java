package test.hrms2.core.adapters;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class MernisDemo {

	

	private final String tcNOPattern = "[0-9]"; //Final : Bu ifadenin disina cikilamaz

	public boolean isValidNationolityIdentity(String tcNo) {
	
		
		
	if (tcNo.length() != 11) {
			return false;
		}	
		Pattern pattern = Pattern.compile(tcNOPattern);
		return pattern.matcher(tcNo).find();
	}
	
}

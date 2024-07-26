package business.concreters;

import business.abstracts.UserVerificationService;

public class UserVerificitionManager implements UserVerificationService{

	@Override
	public boolean validate() {
		System.out.println("dogrulama basarılı");
		return true;
	}


}

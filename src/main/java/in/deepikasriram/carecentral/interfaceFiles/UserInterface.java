package in.deepikasriram.carecentral.interfaceFiles;

import in.deepikasriram.carecentral.model.User;

public interface UserInterface extends Base<User> {
	
	public abstract User findByEmail(String  email);
	public abstract int count();
	
}

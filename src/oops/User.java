// runtime polymorphism or dynamic polymorphism

package oops;

public class User {
	
	public static void main (String args[]){
		
		SmartPhone st= new SmartPhone();
		st.calling();
		st.voicemail();
		st.texting();
		
		//Phone p;
		
		// p=new Phone();
		//p= new Mobile();
		//p=new SmartPhone();
		//p.calling();
		//p.dialing();
		
	}

}

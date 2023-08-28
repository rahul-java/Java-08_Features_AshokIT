package Java_08_Features.Optional_Class;

import java.util.Optional;

public class User {

	public String getUserNameById(Integer id)
	{
		if(id==100)
			return "Raja";
		else if(id==101)
			return "Rani";
		else if(id==102)
			return "John";
		else return null;
		
	}
	
	public Optional<String> getUserName(Integer id)
	{
		String name=null;
		if(id==100)
			name= "Raja";
		else if(id==101)
			name= "Rani";
		else if(id==102)
			name= "John";
		
		 return Optional.ofNullable(name);
		
	}
}

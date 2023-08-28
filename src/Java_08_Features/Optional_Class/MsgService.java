package Java_08_Features.Optional_Class;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id");
		int userId = sc.nextInt();
		User user = new User();
		String userNameById = user.getUserNameById(userId);
		
		if(userNameById!=null)
		{
			String  msg="Hello , "+userNameById.toUpperCase();
			System.out.println(msg);
		}
		else {
			System.out.println("Invalid ID, No Data found !");
		}
		
		Optional<String> optional = user.getUserName(userId);
		if(optional.isPresent())
		{
			String name = optional.get();
			System.out.println(name.toUpperCase()+" ::: Hello ");
		}
		else {
			System.out.println(":::: Invalid ID");
		}
	}
}

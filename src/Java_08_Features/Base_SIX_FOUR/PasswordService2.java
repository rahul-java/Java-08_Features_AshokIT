package Java_08_Features.Base_SIX_FOUR;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordService2 {

	public static void main(String[] args) throws Exception {
		
		//MessageDigest SHA-256
		
		String pwd="rahul@123";
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		byte[] digest = messageDigest.digest();
		String encryptedPwd = new String(digest);
		System.out.println("Encrypted Pwd SHA-256 ::: "+encryptedPwd);  //��B�����șo�$'�A�d��L���xR�U
		
		//First Encrypt this pwd
		//Then Encode it for more safety
		
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(digest);
		String encryptedEncodedPwd = new String(encode);
		System.out.println("Encrypted+Encoded Pwd ::: "+encryptedEncodedPwd);  //47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=
		
	}
}

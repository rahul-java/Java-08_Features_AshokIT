package Java_08_Features.Base_SIX_FOUR;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static void main(String[] args) {
		
		//Base64 uses
		
		String pwd="rahul@123";
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		String encodedPwd = new String(encode);
		System.out.println("Encoded Pwd : "+encodedPwd);  //cmFodWxAMTIz
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedPwd);
		String decodedPwd = new String(decode);
		System.out.println("Decoded Pwd : "+decodedPwd);  //rahul@123
	}
}

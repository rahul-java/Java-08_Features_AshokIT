package Java_08_Features.Nashorn_Engine;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Demo {
	public static void main(String[] args) {
		
		//Nashorn Engine is used to execute Java Script code using JVM.
		// run command in command prompt
		//jjs hello.js
		
		//to call that js file in java
		ScriptEngine engineByName = new ScriptEngineManager().getEngineByName("Nashorn");
		try {
			engineByName.eval(new FileReader("hello.js"));
			
		} catch (FileNotFoundException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

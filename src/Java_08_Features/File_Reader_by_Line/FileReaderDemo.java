package Java_08_Features.File_Reader_by_Line;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		
		/*
		FileReader fr=new FileReader(new File("info.txt"));
		BufferedReader br=new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		*/
		
		String fileName="info.txt";
		try(Stream<String> stream=Files.lines(Paths.get(fileName)))
		{
			//stream.forEach(line->System.out.println(line));
			stream.filter(line->line.startsWith("H")).forEach(line->System.out.println(line));
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}

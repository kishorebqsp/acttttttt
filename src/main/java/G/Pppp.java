package G;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Pppp {
public static String abc(String path){
String s="";
	{
	try{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		s=p.getProperty("url");
	}
	catch(Exception e)
	{
		
	}
return s;

}}}

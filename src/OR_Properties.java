import java.io.IOException;
import java.util.Properties;

import junit.framework.Test;

public class OR_Properties 
{

	public static void main(String[] args) throws IOException 
	{
		Properties properties = new Properties();
		try 
		{
			properties.load(Test.class.getClassLoader().getResourceAsStream("config.properties"));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		String name = properties.getProperty("name");
		System.out.println(name);
	}

}

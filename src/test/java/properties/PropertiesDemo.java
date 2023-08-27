package properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties property =new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/Users/v-gujjavani/OneDrive - Microsoft/Documents/Course P/basic/config/sample.properties");
			property.load(fis);
			System.out.println(property.getProperty("firstname")+" First Name");
			System.out.println(property.getProperty("lastname")+" Last Name");
			System.out.println(property.getProperty("location")+" Location");
			System.out.println(property.getProperty("country")+" Country");
			System.out.println(property.getProperty("experience")+" experience");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

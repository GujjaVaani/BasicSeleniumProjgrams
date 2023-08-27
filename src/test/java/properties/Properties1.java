package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {
	public static Properties prop = null;

	public static void loadPropertiesFile() {
		try {
			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					"C:/Users/v-gujjavani/OneDrive - Microsoft/Documents/Course P/basic/config/sample2.properties");

			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

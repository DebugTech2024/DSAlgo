package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;
	private final String configFilePath= "./src/test/resources/config/config.properties";
	
	public Properties init_prop() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(configFilePath);
			prop.load(fis);
			//String urlname=prop.getProperty("url");
		}catch(FileNotFoundException exp) {
			exp.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	return prop;
}
	public String init_url() {
		String homeurl=prop.getProperty("url");
		System.out.println(homeurl);
		return homeurl;
		
	}
	public String homeurl() {
		String homepageurl=prop.getProperty("homepage");
		if(homepageurl != null)
		return homepageurl;
		else
			throw new RuntimeException("homeurl not specified in config.properties file");
		
	}
	public String setBrowser() {
		String browser=prop.getProperty("browser");
		return browser;

	}
	private static String browserType;

		public static String getBrowserType() throws Throwable {

			
			if(browserType != null)

			return browserType;

			else

			throw new RuntimeException("browser not specified in the config.properties file.");

			}
		public static void setBrowserType(String browser) {
			// TODO Auto-generated method stub
			browserType=browser;
		}
	
	}
	
	
	

package Utility;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class  ConfigFileReader {
private static Properties prop;
private final static String configFilePath= "configs/config.properties";

//public ConfigFileReader() {
	public static  Properties init_prop() {

File  ConfigFile=new File(configFilePath);

try {

FileInputStream configFileReader=new FileInputStream(ConfigFile);

      prop = new Properties();

try {

      prop.load(configFileReader);

      configFileReader.close();

    } catch (IOException e) 

      {

        System.out.println(e.getMessage());

      }

  }  catch (FileNotFoundException e) 

      {

        System.out.println(e.getMessage());

throw new RuntimeException("config.properties not found at config file path"  + configFilePath);

      }
return prop ;

  }

public String getApplicationUrl() {

String applicationurl= prop.getProperty("url.base");

if(applicationurl != null)

return applicationurl;

else

throw new RuntimeException("Application url not specified in the config.properties file.");

}


public String getUserName() {

String username= prop.getProperty("username");

if(username != null)

return username;

else

throw new RuntimeException("username not specified in the config.properties file.");

}


public String getPassword() {

String password= prop.getProperty("password");

if(password != null)

return password;

else

throw new RuntimeException("password not specified in the config.properties file.");

}


public static  String getBrowser() {

String browser= prop.getProperty("browser");

if(browser != null)

return browser;

else

throw new RuntimeException("browser not specified in the config.properties file.");

}
public String homeurl() {
	String homepageurl=prop.getProperty("homepage");
	if(homepageurl != null)
	return homepageurl;
	else
		throw new RuntimeException("homeurl not specified in config.properties file");

}


public  long getTimeout() {

String timeout= prop.getProperty("timeout");

if(timeout != null)

return Long.parseLong(timeout);

else

throw new RuntimeException("Timeout not specified in the config.properties file.");

}


public String getEnvironment() throws Exception {

String environment= prop.getProperty("environment");


if(environment != null)

return environment;

else

throw new  Exception("Environment not specified in the config.properties file.");

}

private static String browserType = null;

public static void setBrowserType(String browser) {

      browserType = browser;

	}

	public static  String getBrowserType() throws Throwable {

		if (browserType != null)

			return browserType;

		else

			throw new RuntimeException("browser not specified in the testng.xml");

	}

	

}



	









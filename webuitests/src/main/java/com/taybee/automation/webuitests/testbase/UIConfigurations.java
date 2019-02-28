package com.taybee.automation.webuitests.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.taybee.automation.report.Report;
import com.taybee.automation.report.Status;
import com.taybee.automation.webuitests.testbase.enums.UIConfigEnum;

public class UIConfigurations {

	private final String DEFUALTUICONFIGFILE = "UIConfig";
	private String baseURL;
	private String username;
	private String password;
	private String browserType;

	public UIConfigurations(String uiConfigFile) {
		try {
			Properties p = getObjectRepository(uiConfigFile);
			this.baseURL = p.getProperty(UIConfigEnum.BASEURL.getPropertyKey());
			this.username = p.getProperty(UIConfigEnum.USERNAME.getPropertyKey());
			this.password = p.getProperty(UIConfigEnum.PASSWORD.getPropertyKey());
			this.browserType = p.getProperty(UIConfigEnum.BROWSERTYPE.getPropertyKey());
		} catch (IOException e) {
			Report.report("Faild to read config file:" + uiConfigFile, Status.FAIL);
		}

	}

	public Properties getObjectRepository(String uiConfigFile) throws IOException {
		Properties p = new Properties();
		// Read object repository file
		if (uiConfigFile == null || uiConfigFile.equals("")) {
			uiConfigFile = DEFUALTUICONFIGFILE;
		}
		String uiConfigPath = UIConfigurations.class.getClassLoader()
				.getResource("configurations/" + uiConfigFile + ".properties").getPath();
		InputStream stream = new FileInputStream(new File(uiConfigPath));
		// load all objects
		p.load(stream);
		return p;
	}

	public String getBaseURL() {
		return this.baseURL;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

	public String getBrowserType() {
		return this.browserType;
	}
}

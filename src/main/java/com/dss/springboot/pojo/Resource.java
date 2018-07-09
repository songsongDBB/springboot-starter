package com.dss.springboot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration		//表示这个类是通过属性资源文件映射进来的值
@PropertySource(value = "classpath:resource.properties")		//属性资源文件的位置
@ConfigurationProperties(prefix = "com.dss.opensource")			//资源文件中各个属性的前缀
public class Resource {

	private String name;
	private String website;
	private String language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Resource [name=" + name + ", website=" + website + ", language=" + language + "]";
	}

	public Resource(String name, String website, String language) {
		super();
		this.name = name;
		this.website = website;
		this.language = language;
	}

	public Resource() {
		super();
	}

}

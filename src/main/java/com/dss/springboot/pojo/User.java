package com.dss.springboot.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
	
//@JsonIgnoreProperties({"password","age"})		//表示将类里面不需要返回的属性列在这里
public class User {

	private String name;
	
	//@JsonIgnore			//表示这个属性值不需要返回给前台
	private String password;
	private Integer age;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")			//表示将日期格式转换成固定的形式输出
	private Date birthday;
	
	@JsonInclude(Include.NON_NULL)				//表示当这个值为null时，不返回
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", birthday=" + birthday + ", desc="
				+ desc + "]";
	}

	public User(String name, String password, Integer age, Date birthday, String desc) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.birthday = birthday;
		this.desc = desc;
	}

	public User() {
		super();
	}

}

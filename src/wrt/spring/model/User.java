package wrt.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class User {
	
	private Long id;
	@NotNull(message="不能为空")
	@Size(min=1, max=5, message="最小1位，最多5位字符")
	private String username;
	@Pattern(regexp="[0-9a-zA-Z]{2,23}", message="最少两位字符，包含数字和字符")
    private String password;  
	@Range(min=1, max=200, message="大于1小于200")
    private Integer age;
  
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
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
  
}

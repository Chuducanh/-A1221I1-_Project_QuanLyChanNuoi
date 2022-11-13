package vn.codegym.test_farm.dto;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import vn.codegym.test_farm.model.User;

import javax.validation.constraints.*;
import java.util.Date;

@Data
public class EmployeeDto {
    private Long id;
    @NotBlank
    @Size(max = 42)
    private String name;
    @NotBlank
    @Size(min = 9, max = 12)
    private String identityNumber;
    @NotNull
    private Date birthday;
    @NotNull
    private boolean gender;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String img_url;

    private User user;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String identityNumber, Date birthday, boolean gender, String email, String img_url, User user) {
        this.id = id;
        this.name = name;
        this.identityNumber = identityNumber;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.img_url = img_url;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public User getUser() {
        return user;
    }

    public void setUserDto(User user) {
        this.user = user;
    }
}

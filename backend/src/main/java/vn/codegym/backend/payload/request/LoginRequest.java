package vn.codegym.backend.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class LoginRequest {
    @Pattern(regexp = "^[a-zA-Z0-9_-]*$")
    @NotBlank
    private String username;
    @NotBlank
    @Size(min = 6)
    private String password;
}
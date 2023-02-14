package mx.edu.utez.ventas.controller.user.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {
    private Long id;
    @NotEmpty
    private String fullname;
    @NotEmpty
    private String email;
    @NotEmpty
    @Size(min = 3, max = 15)
    private String password;
}

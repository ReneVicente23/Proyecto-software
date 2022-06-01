package bo.edu.ucb.ingsoft.bot.dto.apidto;

public class AuthApiDto {
    private String username;
    private String password;

    public AuthApiDto() {
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
}

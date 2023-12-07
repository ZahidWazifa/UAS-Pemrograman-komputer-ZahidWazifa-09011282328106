package Soal8;

public class Login {
    // ? gunakan private agar data tetap original
    private String username;
    private String password;
    private Status status;
    // ? constructor untuk menambahkan data ke database

    public Login(String username, String password, Status status) {
        this.username = username;
        this.password = password;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

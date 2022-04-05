package day35_Encapsulation.Tasks2;

public class Credentials {
    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        if (username != null)
            this.username = username;
    }

    public void setPassword(String password) {
        if (isStrongPassword(password))
            this.password = password;
    }

    private boolean isStrongPassword(String password) {
        if (password.length() >= 8 && !password.contains(" ")) {
            boolean letter = false, digit = false, spacial = false;
            int i = 0;
            while (!letter || !digit || !spacial && i < password.length()) {
                if (Character.isLetter(password.charAt(i))) letter = true;
                else if (Character.isDigit(password.charAt(i))) digit = true;
                else spacial = true;
                if (letter && digit && spacial) return true;
                i++;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
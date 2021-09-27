package tasks.task4;

public class AuthorFromUML {
    private final String name;
    private String email;
    private final char gender;

    AuthorFromUML(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", gender=" + getGender() +
                '}';
    }
}

class TestAuthor {
    public static void main(String[] args) {
        AuthorFromUML author = new AuthorFromUML("Boris", "bor@example.com", 'm');
        System.out.println(author);
        author.setEmail("borNew@example.com");
        System.out.println(author);
    }
}
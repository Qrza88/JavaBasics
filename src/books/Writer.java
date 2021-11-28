package books;
//1. Stwórz klasę reprezentującą książkę. Książka jest określona przez tytuł, cenę, autora, ISBN. Autor ma imię, nazwisko, płeć. Pozwól na odczyt wszystkich właściwości książki oraz autora, ale nie na ich zmianę spoza klasy.

public class Writer {
    private String firstName;
    private String lastName;
    private String sex;

    public Writer( String firstName, String lastName, String sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " /" + sex + "/";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }
}

import java.util.Objects;

class Author {
    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Имя - " + firstName + " , Фамилия -" + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if ((this.firstName == ((Author) obj).firstName) && (this.lastName == ((Author) obj).lastName)) {
            b = true;
        }
        return b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

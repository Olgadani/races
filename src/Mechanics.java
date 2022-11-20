import java.util.Objects;

public class Mechanics <T extends Transport>{
    private final String name;

    private final String surname;
    private final String company;

    public Mechanics(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(T t) {
        return t.service();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics<?> mechanics = (Mechanics<?>) o;
        return Objects.equals(name, mechanics.name) && Objects.equals(surname, mechanics.surname) && Objects.equals(company, mechanics.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

package CarRacing;

import java.util.Objects;

public class Mechanic<T extends Car> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t) {
        return t.service();
    }

    public void repair(T t) {
        t.repair();
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

    @Override
    public String toString() {
        return name + " "+ surname + " из компании " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && surname.equals(mechanic.surname) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}

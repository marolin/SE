import java.util.Scanner;

/**
 * student information
 */

public class studentIdentity {
    private String name, city, country, id, group, telephone, dob;
    studentIdentity field = new studentIdentity();

    public studentIdentity() {

    }

    public studentIdentity(String name, String city, String country, String group, String telephone, String dob) {
        setName(name);
        setCity(city);
        setCountry(country);
        setGroup(group);
        setTel(telephone);
        setDate(dob);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return this.telephone;
    }

    public void setTel(String telephone) {
        this.telephone = telephone;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        return this.dob;
    }

    public void setDate(String dob) {
        this.dob = dob;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public static studentIdentity inputdata() {
        Scanner scanner = new Scanner(System.in);
        studentIdentity student = new studentIdentity();

        System.out.print("enter your name: ");
        student.setName(scanner.nextLine());
        System.out.print("enter the city: ");
        student.setCity(scanner.nextLine());
        System.out.print("enter the country: ");
        student.setCountry(scanner.nextLine());
        System.out.print("enter contact: ");
        student.setTel(scanner.nextLine());
        System.out.print("enter your group: ");
        student.setGroup(scanner.nextLine());
        System.out.println("enter you date of birth: ");
        student.setDate(scanner.nextLine());

        return student;
    }

    @Override
    public String toString() {
        return "Student{\n" + "name: " + name + " " + "\ncity: " + city + " " + "\nTelephone: " + telephone + " "
                + "\ngroup: " + group + "\ndate of birth: " + dob + "\n}";
    }
}

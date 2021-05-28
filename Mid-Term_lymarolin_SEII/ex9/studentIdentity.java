import java.util.*;
import java.text.ParseException;
import javax.swing.GroupLayout.Group;

/**
 * student information
 */

public class studentIdentity {
    private String name, city, country, id, group, telephone;
    private Date dob;
    private int year;
    studentIdentity field = new studentIdentity();

    public studentIdentity() {

    }

    public studentIdentity(String name, String city, String country, String group, String telephone, Date dob, String id, int year) {
        setName(name);
        setID(id);
        setYear(year);
        setGroup(group);
        setDate(dob);
        setTel(telephone);
        setCity(city);
        setCountry(country);
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        Exception.checkEmptyBlankNull(name, "student name");
        this.name = name;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if(year < 1 || year > 5){
            throw new IllegalArgumentException("study year between 1 and 5.");
        }
        this.year = year;
    }
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        Exception.checkEmptyBlankNull(city, "\ncity: ");
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        Exception.checkEmptyBlankNull(country, "\ncountry: ");
        this.country = country;
    }

    public String getTel() {
        return this.telephone;
    }

    public void setTel(String telephone) {
        char[] number = telephone.toCharArray();
        if(number.length  )
        this.telephone = telephone;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) throws GroupNameException {
        char[] Group = group.toCharArray();
        if(Group[0] != 'I' && Group[0] != 'T'){
            throw new GroupNameException("\ngroups must start with I = engineering or T = technician.");
        }
        int y = Group[1];
        if((y < 1 && y >5) || (y < 1 && y > 2)){
            throw new GroupNameException("\ninvalid year.");
        }
        if(Group.length < 5){
            for(int i =2; i<Group.length; i++){
                if(!(Group[i] >= 'A' && Group[i] <= 'Z'))
                throw new GroupNameException("\n group should be ended by Latin alphabets.");
            }
        }else{
            throw new GroupNameException("\n group should contain characters & number.")
        }
        this.group = group;
    }

    public Date Date() {
        return this.dob;
    }

    public void setDate(String dob) throws BirthdayException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,  calendar.get(Calendar.YEAR) - 15);
        Date fifDate = calendar.getTime();
        if(dob.compareTo(fifteen)> 0)
            throw new BirthdayException();
        this.dob = dob;
    }


    public static studentIdentity inputdata() {
        Scanner scanner = new Scanner(System.in);
        studentIdentity student = new studentIdentity();

        System.out.print("enter your name: ");
        student.setName(scanner.nextLine());
        System.out.print("enter your id: ");
        student.setID(scanner.nextLine());
        System.out.print("enter year you in: ");
        student.setYear(scanner.nextLine());
        System.out.print("enter your group: ");
        student.setGroup(scanner.nextLine());
        System.out.print("enter the city: ");
        student.setCity(scanner.nextLine());
        System.out.print("enter the country: ");
        student.setCountry(scanner.nextLine());
        System.out.print("enter contact: ");
        student.setTel(scanner.nextLine());
        
        return student;
    }

    @Override
    public String toString() {
        return "Student{\n" + "name: " + name + " " + "\ncity: " + city + " " + "\nTelephone: " + telephone + " "
                + "\ngroup: " + group + "\ndate of birth: " + dob + "\n}";
    }
}

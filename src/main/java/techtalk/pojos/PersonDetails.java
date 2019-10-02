package techtalk.pojos;

import java.util.List;
import java.util.Map;

public class PersonDetails {
    private String name;
    private int age;
    private List<String> primaryHobbies;
    private List<String> secondaryHobbies;
    private Map<String, String> primaryAddress;
    private Map<String, String> secondaryAddress;
    private Profession profession;
    private String largeText1;
    private String largeText2;



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getPrimaryHobbies() {
        return primaryHobbies;
    }

    public List<String> getSecondaryHobbies() {
        return secondaryHobbies;
    }

    public Map<String, String> getPrimaryAddress() {
        return primaryAddress;
    }

    public Map<String, String> getSecondaryAddress() {
        return secondaryAddress;
    }

    public String getLargeText1() {
        return largeText1;
    }

    public String getLargeText2() {
        return largeText2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrimaryHobbies(List<String> primaryHobbies) {
        this.primaryHobbies = primaryHobbies;
    }

    public void setSecondaryHobbies(List<String> secondaryHobbies) {
        this.secondaryHobbies = secondaryHobbies;
    }

    public void setPrimaryAddress(Map<String, String> primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public void setSecondaryAddress(Map<String, String> secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public void setLargeText1(String largeText1) {
        this.largeText1 = largeText1;
    }

    public void setLargeText2(String largeText2) {
        this.largeText2 = largeText2;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Profession getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", primaryHobbies=" + primaryHobbies +
                ", secondaryHobbies=" + secondaryHobbies +
                ", primaryAddress=" + primaryAddress +
                ", secondaryAddress=" + secondaryAddress +
                ", profession=" + profession +
                ", largeText1='" + largeText1 + '\'' +
                ", largeText2='" + largeText2 + '\'' +
                '}';
    }
}

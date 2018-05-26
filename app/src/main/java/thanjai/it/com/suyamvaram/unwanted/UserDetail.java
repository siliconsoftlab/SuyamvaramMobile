package thanjai.it.com.suyamvaram.unwanted;

import android.media.Image;

import java.util.UUID;

public class UserDetail {

    private UUID Id;
    private String name;
    private int age;
    private int height;
    private int weight;
    private String Education;
    private String Profession;
    private String Address;
public UserDetail()
{
    Id=UUID.randomUUID();
}
    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", Education='" + Education + '\'' +
                ", Profession='" + Profession + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}

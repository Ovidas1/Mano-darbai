package lt.vcs;

/**
 *
 * @author Ovidas
 */
public class Person {
private String fName;
private String lName;
private Integer age;
private Gender gender;

public Person(String fName,String lName,Integer age,Gender gender){
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.gender = gender;           
}

@Override
public String toString (){
    return super.toString() + " : Person (vardas: " + fName + "; pavarde: " + lName +")";
}

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}


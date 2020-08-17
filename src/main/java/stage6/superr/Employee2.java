package stage6.superr;

public class Employee2 {
    public String name;
    public String email;
    public int experience;

    // write constructor

    public Employee2(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }


    // write getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee2 {

    // write fields
    public String mainLanguage;
    String[]  skills;

    // write constructor

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }


    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee2 {

    // write fields
    public boolean phd;
    String[] methods;

    // write constructor

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }


    // write getters


    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}
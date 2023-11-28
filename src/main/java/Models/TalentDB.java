package Models;

public class TalentDB {

    private int id ;
    private String name ;
    private int experience ;
    private String techStack ;
    private String currCompany ;
    private int currCTC ;
    private int expCTC ;
    private String location ;

    private String resumeFile ;

    //we need to have default constructor add data using json format
    public TalentDB(){};

    public TalentDB(int id , String name, int experience, String techStack, String currCompany, int currCTC, int expCTC, String location, String resumeFile) {
        this.name = name;
        this.experience = experience;
        this.techStack = techStack;
        this.currCompany = currCompany;
        this.currCTC = currCTC;
        this.expCTC = expCTC;
        this.location = location;
        this.id = id ;
        this.resumeFile = resumeFile;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getCurrCompany() {
        return currCompany;
    }

    public void setCurrCompany(String currCompany) {
        this.currCompany = currCompany;
    }

    public int getCurrCTC() {
        return currCTC;
    }

    public void setCurrCTC(int currCTC) {
        this.currCTC = currCTC;
    }

    public int getExpCTC() {
        return expCTC;
    }

    public void setExpCTC(int expCTC) {
        this.expCTC = expCTC;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getResumeFile() {
        return resumeFile;
    }

    public void setResumeFile(String resumeFile) {
        this.resumeFile = resumeFile;
    }
}

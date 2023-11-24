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



    public String getResumeFile() {
        return resumeFile;
    }

    public int getID(){
        return this.id ;
    }
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getCurrCompany() {
        return currCompany;
    }

    public int getCurrCTC() {
        return currCTC;
    }

    public int getExpCTC() {
        return expCTC;
    }

    public String getLocation() {
        return location;
    }
}

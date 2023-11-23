package com.example.gettingIntoTheWorldOfAPI.s;
import java.util.* ;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
           private Repository repoObj ;

    public String addTalentToDB(TalentDB talent){

        //we will process some data here before sending data to repo to add data to DB
        //now we processed data and we can call repo class annotation to add processed data to DB
        return repoObj.addTalentToDB(talent);
    }

    public String getResumeWithMaxExp(){
        //get the raw data from the repository layer
        List<TalentDB> talentDBList = repoObj.getTalentList();

        int expCTC = 0 ;
        String resume="";
        int exp = 0 ;

        //running a loop to get the resume of candidate with most experience and if more candidates have same experience
        //candidate with less expectedCTC will get priority
        for(TalentDB talent : talentDBList){

            if(talent.getExperience()>exp){
                exp = talent.getExperience();
                resume = talent.getResumeFile();
                expCTC = talent.getExpCTC();
            }
            else if(talent.getExperience() == exp){
                    if(talent.getExpCTC()<expCTC){
                        resume = talent.getResumeFile();
                        expCTC = talent.getExpCTC();
                    }
            }
        }
            return "here is your candidate with "+exp+" year experience " + resume + " and he is expecting "+ expCTC +"LPA";
    }

    public TalentDB getCandidate(int cndId){

        return repoObj.getCandidate(cndId);
    }

}

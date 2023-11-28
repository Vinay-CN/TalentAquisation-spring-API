package Respository;

import Models.TalentDB;

import java.util.* ;
import java.util.HashMap;

@org.springframework.stereotype.Repository
public class hiringRepository {

    HashMap<Integer, TalentDB> talentDB = new HashMap<>();

    public String addTalentToDB(TalentDB talent){
        //get the talent id
         int id = talent.getId();
        //add the talent to talentDB
         talentDB.put(id,talent);
         return "A new talent has been added to talentDB with "+id;
    }

    public List<TalentDB> getTalentList(){
        //this will return all the values as List
        return talentDB.values().stream().toList();
    }

    public TalentDB getCandidate(int cndID){
        return talentDB.get(cndID);
    }
}

package com.example.gettingIntoTheWorldOfAPI.s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
        private Service serviceObj;

    @PostMapping("/addTalent")
    public String addTalent(@RequestBody TalentDB talent){

        //now call service layer object to process the data before adding
        String status = serviceObj.addTalentToDB(talent);
        return  status;

    }

    @GetMapping("/getResumeWithMaxExp")
    public String getResumeWithMaxExp(){

        return serviceObj.getResumeWithMaxExp();

    }

    @GetMapping("/getCandidate/{cndID}")
    public TalentDB getCandidate(@PathVariable int cndID){

        return serviceObj.getCandidate(cndID);
    }

}

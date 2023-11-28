package Controllers;

import Service.hiringService;
import Models.TalentDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hiring") //this will be added to the path and we can access  this class endpoints using this pathname
public class hiringController {

    @Autowired
        private hiringService hiringServiceObj;

    @PostMapping("addTalent")
    public ResponseEntity addTalent(@RequestBody TalentDB talent){
        System.out.println("add Talent method called");
        //now call service layer object to process the data before adding
        String status = hiringServiceObj.addTalentToDB(talent);
        return  new ResponseEntity(status, HttpStatus.OK);

    }

    @GetMapping("getResumeWithMaxExp")
    public String getResumeWithMaxExp(){

        return hiringServiceObj.getResumeWithMaxExp();

    }

    @GetMapping("/getCandidate/{cndID}")
    public TalentDB getCandidate(@PathVariable int cndID){

        return hiringServiceObj.getCandidate(cndID);
    }

}

package com.example.gettingIntoTheWorldOfAPI.s;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class API {
        HashMap<Integer,userDB> userDB = new HashMap<>();
    @GetMapping("/addition")

    public String addition(){
        return "Call Add two numbers fucntion";
    }
    //requestParam
    @GetMapping("/addTwoNum")
    public String addTwoNum(@RequestParam("operand1") int operand1 , @RequestParam("operand2") int op2){
        int result = operand1 + op2 ;
        return "Sum of numbers is "+result;
    }

    @GetMapping("/addUser")
    public String addUser(@RequestParam("name") String name ,
                          @RequestParam("userID") int userID,
                          @RequestParam("age") int age,
                          @RequestParam("location") String location) {
        //create object for userDB class
        userDB userDB1 = new userDB(name,userID,age,location);
        userDB.put(userID,userDB1);
        return "user "+name+" with "+userID+" has been added to dataBase successfully";
    }

    @GetMapping("/getUser")
    public String getuser(@RequestParam("userID") int userID){
        userDB userDB1 = userDB.get(userID);
        return "name = "+userDB1.name +" age = "+ userDB1.age + " location = " + userDB1.location  ;
    }

}

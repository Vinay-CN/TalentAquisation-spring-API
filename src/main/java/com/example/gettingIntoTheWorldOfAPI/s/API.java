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



//here using reuqestparam i am creating object explicitly
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
        return "name = "+userDB1.getName() +" age = "+ userDB1.getAge() + " location = " + userDB1.getLocation()  ;

    }




 //using RequestBody no need to create any objects from the value we got , it will automatically creates
    @PostMapping("/addEmpInfo")
    public String addEmpInfo(@RequestBody userDB user ) {

        int key = user.getId();

        System.out.println("User"+user.getId()+" has been added sucessfully");

        userDB.put(key,user);
        System.out.println(user.toString());
        return "employee "+user.getId() +" has been added sucessfully " ;

    }



    @GetMapping("/getEmpinfo")
    public userDB getEmpInfo(@RequestParam("EmpID") Integer empID){

        userDB user = userDB.get(empID);
        return user;

    }




    //using path variable
    @GetMapping("/getEmpinfo/{empID}")
    public userDB empInfo(@PathVariable("empID") int empId){

        userDB user = userDB.get(empId);
        return user ;

    }



}

package com.rock_paper_scissor;


import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Objects;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class game {
    // ArrayList<String> list = new ArrayList<>(Arrays.asList("rock", "paper", "scissor"));
    ArrayList<String> list = new ArrayList<String>();
    {
        list.add("rock");
        list.add("paper");
        list.add("scissor");       
    } 
    
    public String handle(String userInput) {
        Random random = new Random();
        int index = random.nextInt(3);

        String comp = list.get(index);
        
        if(userInput.equals(comp)){
            return "You choose : "+ userInput +"<br>"+ "Computer choose : "+comp
            +"<br>"+"So TIE";
        }
        if(userInput.equals(list.get(0)) && comp.equals(list.get(2))){
            return "You choose : "+ list.get(0) +"<br>"+ "Computer choose : "+ list.get(2)+"<br>"+"So You Win";
        }
        if(userInput.equals(list.get(1)) && comp.equals(list.get(0))){
            return "You choose : "+ list.get(1) +"<br>"+ "Computer choose : "+ list.get(0)+"<br>"+"So You Win";
        }
        if(userInput.equals(list.get(2)) && comp.equals(list.get(1))){
            return "You choose : "+ list.get(2) +"<br>"+ "Computer choose : "+ list.get(1)+"<br>"+"So You Win";
        }
        // if(userInput.equals(list.get(2)) && comp.equals(list.get(0))){
        //     return "You choose : "+ list.get(2) +"<br>"+ "Computer choose : "+ list.get(0)+"<br>"+"So Computer Win";
        // }
        // if(userInput.equals(list.get(0)) && comp.equals(list.get(1))){
        //     return "You choose : "+ list.get(0) +"<br>"+ "Computer choose : "+ list.get(1)+"<br>"+"So Computer Win";
        // }
        // if(userInput.equals(list.get(1)) && comp.equals(list.get(2))){
        //     return "You choose : "+ list.get(1) +"<br>"+ "Computer choose : "+ list.get(2)+"<br>"+"So Computer Win";
        // }
        // if( userInput.equals("rock") && comp.equals("scissor")){
        //         return "you win";
        // }
        // if( userInput.equals("paper") && comp.equals("rock")){
        //     return "you win";
        // }
        // if(userInput.equals("scissor") && comp.equals("paper")){
        //         return "You Win";
        // }
                
        return "You choose : "+ userInput + "<br>"+ "Computer choose : "+ list.get(index) +"<br>" +"So Computer Win";
    } 
}

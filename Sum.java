// adding the sum of 1 to 100
// first off create the loop that counts 1 - 100
// create a variable (global variable) where we would be storing the number...adding them together
// create the loop that counts 1 - 100
// then using the variable and loop together, you put that for each time the loop runs the number should be added to the sum variable each time it iterates
// print out the number

public class Sum{
        public static void main(String[] args){
        int addition = 0;
        
        for(int counter = 1; counter <= 100; counter++){
        addition += counter;
}
        System.out.println(addition);
}
}

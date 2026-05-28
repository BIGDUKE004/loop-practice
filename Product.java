// product of 1-5, which is 1*2*3*4*5
// 1*2, value * 3, value * 4, value * 5
// so we can have a container where we store the values that we have mutiplied together into then initalize to 0
// create a loop that start from 1 and end at 5
// each time the loop iterate it should multiply the value inside the container with the value the loop is holding at the moment

public class Product{
    public static void main(String[] args){

    int value = 1;

    for(int counter = 1; counter <= 5; counter++){
        value *= counter;
}
    System.out.println(value);
}
}

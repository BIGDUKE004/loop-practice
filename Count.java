//count how many numbers are greater than 10 in an array
//compare each value with 10
//pick up each element in the array and compare it with the variable storing 10
//we would need a counter to count the numbers that are greater than 10
//print out the counter

public class Count{
        public static void main(String[] args){
        
        int [] array = {4, 15, 22, 8, 13};
        int large = 0;
        int comparison = 10;

        for(int counter = 0; counter < array.length; counter++){
        if(array[counter] > comparison){
        large++;
}
}

System.out.println(large);
}
}

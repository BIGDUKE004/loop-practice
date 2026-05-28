import java.util.Arrays;
public class Sorting{
    public static void main(String[] args){

int [] array = {43, 555, 78, 1, 3, 2};
    // this for loop is to pick one element at a time to compare with the rest
for(int index = 0; index < array.length; index++){
 // this is to pick the second element int the array
        for(int sec = index + 1; sec < array.length; sec++){
    // this is to compare the two element together 
        if(array[index] > array[sec]){
    // this is to swap the element if the condition is true
        int temp = array[index];
        array[index] = array[sec];
        array[sec] = temp;
}
}      
}
System.out.print(Arrays.toString(array));
}
}

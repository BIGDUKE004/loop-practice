public class Largest{
    public static void main(String[] args){

int [] array = {4, 8, 1, 9, 2};
int largestNum = array[0];

for(int count = 0; count < array.length; count++){
if(largestNum < array[count]){
largestNum = array[count];
}
}
System.out.println(largestNum);

}
}

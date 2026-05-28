// find the largest number input from five user input 
//  collect five user input
// compare it
//  print the result 

public class LargestNumber{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

int count = 1; 
int num = 0;
int largest = 0;

while(count <= 5){

System.out.print("enter a number: ");
num = input.nextInt();

if(num > largest){
largest = num; 

}

count++;

}

System.out.println(largest);

}
}

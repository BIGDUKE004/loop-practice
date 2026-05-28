// find the smallest number input from five user input 
//  collect five user input
// compare it
//  print the result 

public class SmallestNumber{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

int count = 1; 
int num = 0;
int smallest = 0;

System.out.print("enter a number: ");
smallest = input.nextInt();

while(count <= 4){

System.out.print("enter a number: ");
num = input.nextInt();

if(smallest > num){
smallest = num; 

}

count++;
}

System.out.println(smallest);

}
}

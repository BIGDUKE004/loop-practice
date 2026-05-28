public class Total{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);
int sum = 0;
int count = 1;

while(count <= 5){
System.out.print("enter a number: ");
int num = input.nextInt();
sum += num;
count++;
}
System.out.println(sum);


}
}

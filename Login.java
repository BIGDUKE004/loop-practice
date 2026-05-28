public class Login{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);
int password= 1234;
int count = 1;

while(count != 0){
System.out.print("enter your password: ");
int num = input.nextInt();

if(num == password){
System.out.println("log in successful");
break;
}

count++;
}



}
}

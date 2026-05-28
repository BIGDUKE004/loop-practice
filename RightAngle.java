// print a rigt angle triangle with astericks

public class RightAngle{
    public static void main(String[] args){

    for(int space = 1; space <= 10; space++){
        for(int star = 1; star <= space; star++){
        System.out.print("*");
}    
        System.out.println();
}



System.out.println();
System.out.println();



 for(int space = 10; space >= 1; space--){
        for(int star = space; star >= 1; star--){
        System.out.print("*");
}    
        System.out.println();
}



System.out.println();
System.out.println();



for(int line = 1; line <= 10; line++){
    for(int space = 1; space <= line; space++){      
 System.out.print(' ');
}

for(int star = 10; star >= line; star--){
  System.out.print("*");
}

System.out.println();
}



System.out.println();
System.out.println();



for(int line = 1; line <= 10; line++){

        for(int space = 10; space >= line; space--){

System.out.print(' ');
}

        for(int star = 1; star <= line; star++){
System.out.print("*");
}

System.out.println();
}


}
}

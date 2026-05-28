public class Inverted{
    public static void main(String[] args){
int space = 0;
for(int line = 1; line <= 4; line++){
    for(space = 1; space <= line; space++){
System.out.print(' ');
}
    for(int star = 1; star <= (8 - (2 * line - 1)); star++){
System.out.print("*");
}

    System.out.println();
}

}
}







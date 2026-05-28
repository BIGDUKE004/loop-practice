public class Pyramid{
    public static void main(String[] args){

for(int line = 5; line >= 1; line--){
    for(int space = line; space >= 1; space--){
System.out.print(' ');
}
    for(int star = 1; star <= 10 - (2 * line - 1); star++){
System.out.print("*");
}
System.out.println();
}

}
}

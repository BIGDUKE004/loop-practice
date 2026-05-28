public class CheckBoard{
    public static void main(String[] args){

        for(int row = 1; row <= 8; row++){
            for(int columns = 1; columns <= 8 ; columns++){
if((row + columns) % 2 == 0){
System.out.print("  x ");
} else{
System.out.print("  o ");
}

}
System.out.println();
}


}
}

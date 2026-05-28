// print from 1 - 20
// now i have an understanding of how loop works and iterate, i now added a condition which states that if the counter modulous 2 is not equals to 0 (meaning that if you divide the number by 2 and the raminder is not equals to 0, it can be either 1 or any number) that it should print it out since we know that even numbers are numbers that can be divided by 2
public class Odd{
    public static void main(String[] args){
    for(int counter = 1; counter <= 20; counter++){
if(counter % 2 != 0){
System.out.println(counter);
}
}
}
}

public class numberpattern {
    public static void main(String[] args) {

        //wap to print the following number pattern:
// 1234567
// 2345671
// 3456712
// 4567123
// 5671234
// 6712345
// 7123456
        for(int i = 1; i<=7; i++){
            for(int j = i; j <=7; j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

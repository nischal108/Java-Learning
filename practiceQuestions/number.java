
public class number {
    public static void main(String[] args) {
        int r =4;
        int c = 7;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==r|| i+j==5 || j-i ==3){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            

            
            System.out.println();
        }
    }
}

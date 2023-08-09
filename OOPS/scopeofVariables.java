//class level scope
   class hero {
    int  a;
    int b ;

        static void actor(int a,int b){
        int add = a+b;
        int sub = a-b;

        System.out.println(add);
        System.out.println(sub);
    }
}





public class scopeofVariables {
    public static void main(String[] args) {
        // hero man = new hero();
        hero.actor(7,5);
        
    }
    
}

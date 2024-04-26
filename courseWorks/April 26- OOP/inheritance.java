class human {
    String species = "homosapiens";
    int legs = 2;
    int eyes = 2;

    boolean canWalk() {
        if (this.legs == 2) {
            return true;
        } else {
            return false;
        }
    }
}

class girls extends human {
    String hair = "long";
    boolean dancer = true;

    boolean CanDance() {
        if (dancer) {
            return true;
        } else {
            return false;
        }
    }
}

public class inheritance {
    public static void main(String[] args) {
        human human1 = new human();
        girls girl1 = new girls();
        human1.legs = 4;
        System.out.println(human1.canWalk());
        System.out.println(girl1.canWalk());

    }
}
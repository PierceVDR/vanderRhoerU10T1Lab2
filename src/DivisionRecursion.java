public class DivisionRecursion {
    public static void main(String [] args) {
        System.out.println(recursiveDivision(128));
    }

    public static int recursiveDivision(int num) {
        System.out.println("recursiveDivision called: num = " + num);
        if (num == 0) {
            System.out.println("Base case achieved, returning 0");
            return 0;
        } else {
            System.out.println("Making recursive call: " + num + " + recursiveDivision(" + num + " / 2)");
            int recurse = recursiveDivision(num / 2);
            int returnVal = num + recurse;
            System.out.println("Returning " + num + " + " + recurse + ", or " + returnVal);
            return returnVal;
        }
    }
}

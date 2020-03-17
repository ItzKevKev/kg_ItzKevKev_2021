import java.util.HashMap;

public class InjectionCheck {
    public static void main(String[] args){
        if(args.length < 2 || args.length > 2){
            System.out.println("false");
            System.exit(0);
        }

        HashMap<Character,Character> mappingCheck = new HashMap<>();
        String s1 = args[0];
        String s2 = args[1];



    }
}

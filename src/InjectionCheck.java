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

        for(int i = 0; i < s1.length(); i++){
            if(mappingCheck.containsKey(s1.charAt(i)) && mappingCheck.get(s1.charAt(i)) != s2.charAt(i)){
                System.out.println("false");
                System.exit(0);
            }else{
                mappingCheck.put(s1.charAt(i),s2.charAt(i));
            }
        }

        System.out.println("true");

    }
}

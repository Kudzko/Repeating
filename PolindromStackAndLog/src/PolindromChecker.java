import java.util.Stack;

public class PolindromChecker {

    public static boolean checkPolindrom(String word){

        char[]           spellWord = word.toLowerCase().toCharArray();
        Stack<Character> stack =     new Stack<>();
        boolean          result =    true;
        int              lengh = spellWord.length;

        for (int i = 0; i < lengh /2 ; i++){
            stack.push(spellWord[i]);
            Test.LOGGER.info( i +" adding to stack: " + spellWord[i]);
        }

        Character temp;

        for (int i =(lengh%2 == 0)? lengh/2 : (lengh/2+1);
                        i < spellWord.length; i++){
            temp = stack.pop();

            Test.LOGGER.info(" Comparre first part word with second: " +
                    spellWord[i] + " and " + temp);
            if (spellWord[i] != temp){
                result = false;
                Test.LOGGER.info("Word is not polindrom");
                return result;
            }
        }
        Test.LOGGER.info("Word is polindrom");
        return result;
    }
}

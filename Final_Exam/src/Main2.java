/**
 * Created by kkang on 12/17/2016.
 */
public class Main2 {
    public static int checkDouble (String text, String key) {
        int counter = 0;
        int position = text.indexOf(key);
        if (position == -1) {
            return counter;
        } else {
            counter += key.length();
        }

        return counter + checkDouble(text.substring(position+counter), key);
    }

    public static void main(String[] args) {
        //                  0123456789
        String textwords1 = "java is just java";
        String keyword1 = "java";

        String textwords2 = "Holy fucking shit I did it UMBC FINAL EXAM! fucking shit!!";
        String keyword2 = "fucking shit";

        String textwords3 = "aAAAAaaa damnAAAAaaaAAAAA damn";
        String keyword3 = " damn";

        // result  8
        System.out.println(checkDouble(textwords1, keyword1));

        // result 24
        System.out.println(checkDouble(textwords2, keyword2));

        // result 10
        System.out.println(checkDouble(textwords3, keyword3));
    }
}


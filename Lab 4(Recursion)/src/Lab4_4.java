/**
 * Created by kkang on 12/1/2016.
 */
public class Lab4_4 {
    //Given a string, recursively (no loops) a new string where all the
    //lowercase 'a' chars have been changed to 'b' chars.

    //changeAtoB("codea") → "codeb"
    //changeAtoB("aahiaa") → "bbhibb"
    //changeAtoB("ahiahia") → "bhibhib"

    public static String changeAtoB(String str) {
        char ch;
        if(str.length() == 0) {
            return str;
        }
        ch = str.charAt(0);
        if(ch == 'a') {
            return 'b' + changeAtoB(str.substring(1));
        }
        return ch + changeAtoB(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(changeAtoB("codea"));
    }
}

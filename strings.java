/**
 * strings
 */
public class strings {

    public static void main(String[] args) {

        //Strings werden initialisiert
        String str1 = "Hallo";
        String str2 = "hallo";
        String str3 = "text ist dumm";
        String str4 = "String 5 1 5 1";
        String str5 = "BlaBLaBlaa";
        String str6 = "ghuhuhuss";

        Boolean ef = "Text ist dumm".equals(str3);
        System.out.println(ef);

        int ka = str1.compareTo(str2);
        System.out.println(ka);

        ka = str1.compareToIgnoreCase(str2);
        System.out.println(ka);

        ka = str5.indexOf("a");
        System.out.println(ka);

        str6.replace("hu","ha");
        System.out.println(str6);

        str4.replaceAll("(//d)", "funf");
        System.out.println(str4);

        StringBuffer buffer = new StringBuffer(str5);
        for (int i = 0; i < 10; i++){
            buffer.append("bla");
        }

        String bufferString = new String(buffer);

        System.out.println(bufferString);





    }
}
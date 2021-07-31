package problem.section1;

public class Cap1_sec1 {

    static String str;
    public static void main(String[] args) {
        switch (str) {
            case "10" : str += "10";
            default : str += "def";
            case "20" : str += "20";
        }
        System.out.println(str);
    }
}

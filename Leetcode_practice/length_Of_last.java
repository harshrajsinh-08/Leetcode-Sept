public class length_Of_last{
    public static void main(String[] args){
        String s = "Hello My name is Harshraj";
        s=s.trim();
        System.out.println(s.length()-s.lastIndexOf(" ") -1);
    }
}
import java.util.Arrays;

class anaGram {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        if(Arrays.equals(s1, t1)) {
            return true;
        } else {
            return false;
        }
    }





    public static void main(String[] args) {
        anaGram sol = new anaGram();

        String s1 = "listen";
        String s2 = "silent";
        System.out.println(s1 +" " + s2);
        System.out.println("Is anagram: " + sol.isAnagram(s1, s2));

        String s3 = "hello";
        String s4 = "world";
        System.out.println(s3 +" " + s4);
        System.out.println("Is anagram: " + sol.isAnagram(s3, s4));
    }
}

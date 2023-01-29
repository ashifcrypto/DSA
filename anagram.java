import java.util.Arrays;
class anagram {
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "siletn";
        char[] cstr1 = str1.toCharArray();
        char[] cstr2 = str2.toCharArray();
        Arrays.sort(cstr1);
        Arrays.sort(cstr2);
        System.out.println(cstr1);
        System.out.println(cstr2);
        // System.out.println(cstr1.equals(cstr2));
        // boolean check = Arrays.equals(cstr1, cstr2) ;
        // System.out.println(check);
        boolean check = true;
        for (int i = 0; i < cstr1.length; i++)
        {
            if(cstr1[i] != cstr2[i])
            {
                check=false;
            }
        }
        if(!check)
        {
            System.out.println("its not anagram");
        }
        else{
            System.out.println("its an anagram");
        }
    }
}

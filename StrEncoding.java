public class StrEncoding {
    public static void main(String[] args)
    {
        String s="aaaabbbccd";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1)) {
                count++;
            }
            else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);
        System.out.println(sb.toString());
    }
}

//Output
//a4b3c2d1

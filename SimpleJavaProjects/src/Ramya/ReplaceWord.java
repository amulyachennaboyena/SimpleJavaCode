package Ramya;


public class ReplaceWord
{
    public static void main(String args[])
    {
        
        String s="Java split example using string function";

        
        String replace="split";
        
        String replacewith="replace";
        s=s+" ";
        String newsen="";String temp="";
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x!=' ')
            {
                temp=temp+x;
            }
            else
            {
                if(replace.equals(temp))
                {
                    newsen=newsen+replacewith;
                }
                else
                {
                    newsen=newsen+temp;
                }
                newsen=newsen+" ";
                temp="";
            }
        }
        System.out.println("The new sentence is :"+"\n"+newsen);
    }
}

package javahelpaphdcandidateout;

import java.util.Scanner;

public class JavaHelpAPhDCandidateOut {

    // https://open.kattis.com/problems/helpaphd
    // simple calculation program
    // accepted kattis
    
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        int numOfTests=GetInt(in);
        
        String[] ans = new String[numOfTests];
        String temp;
        for (int i = 0; i < ans.length; i++) 
        {
            temp =GetString(in);
            if(StringTypeIsAddOp(temp))
            {
                ans[i]=AddOp(String2IntArray(temp));
            }
            else
                ans[i]="skipped";
        }
        PrintArray(ans);
    }
    
    private static void PrintArray(String[] arr)
    {
        for (String string : arr) {
            System.out.println(string);
        }
    }
    
    private static String AddOp(int[] arr)
    {
        return String.valueOf(arr[0]+arr[1]);
    }
    
    private static int[] String2IntArray(String str)
    {
        String[] res = str.split("[+]");
        int[] numbers=new int[res.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(res[i]);
        }
        return numbers;
    }
    
    private static boolean StringTypeIsAddOp(String str)
    {
        if(str.contains("+"))
            return true;
        else    // if(str.contains("="))
            return false;   
    }
            
    private static String GetString(Scanner input)
    {
        String str =input.nextLine();
        return str;
    }
    private static int GetInt(Scanner input)
    {
        int res=Integer.parseInt(input.nextLine());
        return res;
    }
}

package Recursion_Leetcode_Questions_Lec_4;
public class Generate_Parentheses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        Parentheses(n,0,0,"");
	}
	public static void  Parentheses(int n,int open,int close,String ans) {
		if(open==n&&close==n) {
			System.out.print(ans+" ");
			return;
		}
		if(close<open) {
			Parentheses(n,open,close+1,ans+")");			
		}
		if(open<n) {
			Parentheses(n,open+1,close,ans+"(");
		}
	}
}

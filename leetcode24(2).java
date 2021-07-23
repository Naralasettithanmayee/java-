class Solution1
 {
    public boolean isValid(String s)
 {
         Stack<Character> str=new Stack<Character>();
        char[] ch=str.toCharArray();
        char t;
        for(char i:ch)
        {
            t=st.empty()?'&':st.peek();
            if(t=='(' && i==')')
                st.pop();
            else if(t=='{' && i=='}')
                st.pop();
            else if(t=='[' && t==']')
                st.pop();
            else
                st.push(i);
        }
        return(st.empty()?true:false); 
    }
}
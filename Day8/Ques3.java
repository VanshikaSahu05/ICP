class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");
        for(int i=1;i<arr.length;i++){
            if (arr[i].equals("..")) {
                if(!st.isEmpty()){
                    st.pop();

                }
            }
            else if (arr[i].equals("") || arr[i].equals(".")) { 

            }
            else{
                st.push(arr[i]);
            }
        }
        ArrayList<String> ls = new ArrayList<>();
        String s ="";
        if(st.isEmpty()){
            return "/";
        }
        while(!st.isEmpty()){
            ls.add(st.pop());
        }
        Collections.reverse(ls);
        for(int i=0;i<ls.size();i++){
            s+="/"+ls.get(i);
        }
        return s;
    }
}
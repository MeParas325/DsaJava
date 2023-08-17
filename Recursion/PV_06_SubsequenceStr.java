public class PV_06_SubsequenceStr {
    static public void subsequence(String str, int n, String newString){
        if(n == str.length()){
            System.out.println(newString);
            return;
        }
        else{
            char ch = str.charAt(n);
            subsequence(str, n+1, newString+ch);
            subsequence(str, n+1, newString);
        }
    }
    static public void main(String args[]){
        String str = "Paras";
        System.out.println("Old String is:"+str);
        subsequence(str, 0, "");
    }
}

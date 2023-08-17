public class PV_04_EndXXX {
    static int count;
    public static void endXXX(String str, String s, int idx, char x){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                s = s + x;
            }
            System.out.println("New String is:"+s);
            return;

        }
        else{
            if(str.charAt(idx) == x){
                count++;
                endXXX(str, s, idx+1, x);
            }
            else{
                s = s + str.charAt(idx);
                endXXX(str, s, idx+1, x);
            }
        }
    }
    static public void main(String args[]){
        String str = "abcdxzxxt";
        endXXX(str, "", 0, 'x');

    }
}

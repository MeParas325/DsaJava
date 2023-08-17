public class PV_05_RemoveDup {
    static String newStr = "";
    static public void removeDup(String str, int idx){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        else{
            char ch = str.charAt(idx);
            if(newStr.indexOf(ch) == -1){
                newStr += ch;
                removeDup(str, idx+1);
            }
            else{
                removeDup(str, idx+1);
            }
        }

    }
    public static void main(String args[]){
        String str = "fghhgPsdffarasxxxx";
        removeDup(str, 0);
    }
}

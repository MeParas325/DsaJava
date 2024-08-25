public class Sample{

     static String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            int r = (columnNumber - 1) % 26;
            sb.append((char) (r + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.reverse().toString();
        
    }

    public static void main(String args[]) {

        System.out.print(convertToTitle(701));
    }
}
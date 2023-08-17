public class Question1{
    public static void main(String args[]){
        int n = 1350;
        int hundred = 100, fifty = 50, twenty = 20, one = 1;

        int hundredNote = n / hundred;
        n = n - (hundred * hundredNote);
        System.out.println("Number of One hundred notes: "+hundredNote);

        int fiftyNote = n / fifty;
        n = n - (fifty * fiftyNote);
        System.out.println("Number of fifty Note: "+fiftyNote);

        int twentyNote = n / twenty;
        n = n - (twenty * twentyNote);
        System.out.println("Number of twenty Note: "+twentyNote);


        int oneNote = n / one;
        n = n - (one * oneNote);
        System.out.println("Number of 1 ruppe: "+oneNote);

        System.out.println(n);
    }
}
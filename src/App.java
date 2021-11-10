import java.io.*;
import java.math.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // New Commit 
        int i = 0 ;

    }

    static void primeOrNoe() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        while (n != "0") {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            n = bufferedReader.readLine();

            BigInteger bi = new BigInteger(n);
            BigInteger two = new BigInteger("2");
            BigInteger three = new BigInteger("3");
            BigInteger five = new BigInteger("4");
            BigInteger seven = new BigInteger("7");
            BigInteger zero = new BigInteger("0");
            BigInteger one = new BigInteger("1");

            ////////////////////////////////////////////
            ////////////////////////////////////////////

            // for (BigInteger i = new BigInteger("3"); bi.sqrt().compareTo(i) >= 0;i =
            // i.add(two)) {

            // if (bi.mod(i).equals(zero)) {
            // System.out.println("not prime on : " + i );
            // break ;
            // } else {
            // System.out.println(i + " --- prime --- MOD " + bi.mod(i));

            // }
            // }

            ////////////////////////////////////////////
            ////////////////////////////////////////////
            if((bi.divide(two).equals(zero) ||bi.mod(three).equals(zero)
            ||bi.mod(five).equals(zero) ||bi.mod(seven).equals(zero) ) &&
            !(bi.isProbablePrime(1) ||
            bi.equals(two) || bi.equals(three) || bi.equals(five) || bi.equals(seven) )){
            System.out.println("not prime");
            }else{
            int i = 0 ,sum = 0;

            System.out.println("prime");
            System.out.println(sum);
            System.out.println(bi.mod(three));
            System.out.println(bi.mod(seven));

            }
        }
        bufferedReader.close();
        // int i = 0 ;
        // BigInteger zero = new BigInteger("0");
        // BigInteger val = new BigInteger("1");
        // BigInteger one = new
        // BigInteger("8306193547961364862906443093104785840173353478461");
        // while(i<101){
        // val = new BigInteger(String.valueOf(i));
        // if(one.mod(val).equals(zero)){
        // System.out.println(val);
        // }
        // i++ ;
        // }
    }

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
             double nF = (double) n , mF= (double)m ,sF =(double) s;
                int ans = 0 ;
                 if((mF+sF)<=(nF+1)){
                ans  = (int) (mF+sF-1) ;
            }else{
               
                double fulPaF = (double) ((mF+sF-1)/nF) ;
          
                double flourPaF = (double) (fulPaF - Math.floor(fulPaF));
           
    
                ans  = (int) Math.round(flourPaF*nF);
                if(ans==0){
                    ans = (int) nF  ;
                }
            }
             return ans ;
        }
    
    static void bigDecemilSorting() {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        // Write your code here
        List<BigDecimal> bgList = new ArrayList<>();
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ss.add(s[i]);

        }
        ss.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int ans = 0;
                BigDecimal b1 = new BigDecimal(o1);
                BigDecimal b2 = new BigDecimal(o2);
                // if(b1.compareTo(b2)==0){

                // }
                return b2.compareTo(b1);
            }

        });
        s = ss.toArray(new String[n + 2]);
        // OutPut
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        String doneChars = "";
        for (int i = 0; i < a.length(); i++) {
            int aC = 0, bC = 0;
            if (!doneChars.contains(a.charAt(i) + "")) {
                for (int x = 0; x < a.length(); x++) {

                    if (a.charAt(i) == a.charAt(x)) {
                        aC++;
                    }
                    if (a.charAt(i) == b.charAt(x)) {
                        bC++;
                    }
                }

                doneChars += a.charAt(i);
                System.out.println(doneChars);
                if (aC != bC) {
                    return false;
                }
            }

        }
        return true;
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> aList = new ArrayList<>();

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int itratCounter = s.length() - (k - 1);

        // for (int i = 0; i < itratCounter; i++) {
        // String subStringK = s.substring(i, i + k);
        // if(aList.size()==0){
        // aList.add(subStringK);
        // continue;
        // }

        // for (int x = 0; x < aList.size() ; x++) {

        // if (subStringK.compareToIgnoreCase(aList.get(x)) < 0) {
        // // puting in to an index x of aList
        // aList.add(x,subStringK);
        // break;

        // }

        // }

        // }

        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int i = 0; i < itratCounter; i++) {
            String sS = s.substring(i, i + k);
            if (sS.compareToIgnoreCase(smallest) < 0) {
                smallest = sS;

            }
            if (sS.compareToIgnoreCase(largest) > 0) {
                largest = sS;
            }

        }

        return largest + "\n l-" + smallest;

    }

    public static void getPalandrom() {
        // Palandrome
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String ans = "";

        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == S.charAt(S.length() - 1 - i)) {
                ans = "Yes";
            } else {
                ans = "No";
            }
            if (i > S.length() / 2) {
                break;
            }
        }
        System.out.println(ans);
    }

}

public class tohrec {


    public static void TOH(int n,String src,String hlp,String des) {
        if(n==1){
            System.out.println("transfer disk" + n + "from" + src + "to" + des);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        TOH(n-1,src,des,hlp);


        //transfer nth from src to dest
        System.out.println("transfer disk" + n + "from" + src + "to" + hlp);

        //transfer n-1 from helper to dest using src as 'helper'
        TOH(n-1, hlp, src, des);
        
    }
    public static void main(String[] args) {
        int n = 3;

        TOH(n, "A", "B", "C");

    }
}

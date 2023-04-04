package Mar29;

public class Assign1{
    public static void main(String[] args) {
        int maxR=Integer.MIN_VALUE;
        int X=0,Y=0,Z=0;
        int z=0;
        for(int x=0;x<101;x++){
            for(int y=0;y<101-x;y++){
                z=100-x-y;
                int rev=8*x*y*z*z-200*(x+y+z);
                if(maxR<rev){
                    X=x;
                    Y=y;
                    Z=z;
                    maxR=rev;
                }
            }
        }
        System.out.println(X+" "+Y+" "+Z+" "+maxR);
    }
}
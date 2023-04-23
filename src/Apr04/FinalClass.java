package Apr04;

public final class FinalClass {
    static FinalClass f;
    public static FinalClass getInstance() {
        if(f==null){
            f=new FinalClass();
        }
        return f;
    }
    @Override
    public String toString() {
        return "This is a final class";
    }    
}
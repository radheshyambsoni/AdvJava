package Apr04;

import java.io.File;
import java.io.FileNotFoundException;

public class CarCollection {
    private Car[] c;
    private File f;
    
    public CarCollection(File f) throws FileNotFoundException{
        this.f = f;
        c=new Sedan[5];
        read();
    }
    public CarCollection(String name) throws FileNotFoundException{
        this(new File(name));
    }

    private void read() {
        
    }
}
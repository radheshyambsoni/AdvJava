package Mar31;

import java.util.Arrays;

public class MovePosition {
    char[][] matrix=new char[8][8];

    MovePosition(int x,int y){
        for(int i=0;i<8;i++){
            Arrays.fill(matrix[i], '.');
        }
        this.matrix[x][y]='#';
    }
    
    void display(){
        for(int i=0;i<8;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    boolean move(char[][] matrix,int i,int j,int x,int y){
        System.out.println("Matrix Before Change: ");
        display();
        if(x+i<8 && x+i>=0 && y+j<8 && y+j>=0){
            matrix[x][y]='.';
            matrix[x+i][y+j]='#';
            System.out.println("\nMatrix after changing position: ");
            display();
            return true;
        }else{
            System.out.println("\nInvalid move!");
            return false;
        }
    }
}
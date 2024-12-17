package ibm;

public class Solution {
    private final int x;
    private final int y;

    public Solution(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int solveGCF(){
        int gcd = 1;
        for(int i = 1; i <= this.getX() && i <= this.getY(); i++){
            if(this.getX() % i == 0 && this.getY() % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}

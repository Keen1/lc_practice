package ibm;

public class CompressStringSolution {
    private final String s;

    public CompressStringSolution(String s){
        this.s = s;
    }

    public String getS(){
        return this.s;
    }

    public String decompress(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.getS().length(); i+=2){
            if(sb.toString().contains(this.getS().subSequence(i, i))){
                int index = sb.toString().lastIndexOf(this.getS().charAt(i));
                int count = this.getS().charAt(i + 1);

            }
        }



        return sb.toString();
    }
}

public class overload {
    public void put(){
        System.out.println("NO Parameter!");
    }
    public void put(int x){
        System.out.println("There is one parameter:- "+x);
    }
    public void put(int x,int y){
        System.out.println("There is two parameters:-"+x+" "+y);
    }
    public static void main(String[] args) {
        overload o1=  new overload();
        o1.put();
        o1.put(123);
        o1.put(12, 123);
    }
}

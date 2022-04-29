class Box{
    int length;
    int breadth;
    int height;
    void volume(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
        int v=length*breadth*height;
        System.out.println(v);
    }
    public static void main(String args[]){
        Box rectangular=new Box();
        Box square=new Box();
        rectangular.volume(2,3,4);
        square.volume(1,2,3);
    }
}

        

    
    
    
    
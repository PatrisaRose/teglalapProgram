
package teglalapprogram;

class Teglalap {
    private int a;
    private int b;
    private static int db;

    public Teglalap() {
        this(1);
    }

    public Teglalap(int a) {
        this(a, a + 1);
    }
    
    
    public Teglalap(int a, int b) {
        this.setA(a);
        this.setB(b);
        Teglalap.db++;
    }
    
    public void setA(int a){
       if (a < 1){
           this.a = 1;
       }
      this.a = a;
   }
    
    public int getA(){
        return this.a;
    }
       
    public void setB(int b){
       if (b < 1){
           this.b = 1;
       }
       this.b = b;
   }
    
    public int getB(){
        return this.b;
    }
    
    public static int getDb() {
        return db;
    }
    
    @Override
    public String toString(){
        return "A téglalap oldalai: " + this.a + " és " + this.b;
    }
    

    
}

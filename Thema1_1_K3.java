public class Thema1_1_K3 {
    private String x;
    private String y;
    private String z;
 
    public String getX() {return x;}
    public void setX(String x) {this.x = x;}
    public String getY() {return y;}
    public void setY(String y) {this.y = y;}
    public String getZ() {return z;}
    public void setZ(String z) {this.z = z;}

    @Override
    public String toString() {
        return "Generic [x=" + x + ", y=" + y + ", z=" + z + "]";}

    public Thema1_1_K3(String x, String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;}

    public Thema1_1_K3(double x, double y, double z) {
        this.x = Double.toString(x);
        this.y = Double.toString(y);
        this.z = Double.toString(z);}

    public static void main(String[] args) {
        Thema1_1_K3 onomata = new Thema1_1_K3("a", "b", "c");
        System.out.println(onomata.toString());
        Thema1_1_K3 noumera = new Thema1_1_K3(0.1, 1.2, 2.3);
        System.out.println(noumera.toString());}}
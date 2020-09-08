public class K3_Thema1_1 {
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

    public K3_Thema1_1(String x, String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;}

    public K3_Thema1_1(double x, double y, double z) {
        this.x = Double.toString(x);
        this.y = Double.toString(y);
        this.z = Double.toString(z);}

    public static void main(String[] args) {
        K3_Thema1_1 onomata = new K3_Thema1_1("a", "b", "c");
        System.out.println(onomata.toString());
        K3_Thema1_1 noumera = new K3_Thema1_1(0.1, 1.2, 2.3);
        System.out.println(noumera.toString());}}
public class Srafovani2 {
    public static void main(String args[]) {
        int pruhy = 5;
        int vyska = 10;
 
        for (int radek = vyska - 1; radek >= 0; radek--) {
            for (int odsazeni = 0; odsazeni < radek; odsazeni++) {
                System.out.print(" ");
            }
            for (int pruh = 0; pruh < pruhy; pruh++) {
                if (pruh > 0) {
                    System.out.print("   ");
                }
                System.out.print("##");
            }
            System.out.println();
        }
    }
}
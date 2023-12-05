
public class switchState {

    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0;
        if (ch == 1) {
            area = ((22.0 / 7) * a[0] * a[0]);
            return area;
        } else if (ch == 2) {
            return a[0] * a[1];
        } else {
            return area;
        }
    }
}

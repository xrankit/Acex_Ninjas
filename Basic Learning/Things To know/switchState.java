
public class switchState {

    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0;
        switch (ch) {
            case 1:
                return (22 / 7) * a[0] * a[0];
            case 2:
                return a[0] * a[1];
            default:
                return area;
        }
    }
}

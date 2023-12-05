
public class dataType {
    public static int dataTypes(String type) {

        if (type.contains("Integer")) {
            return 4;
        } else if (type.contains("Long")) {
            return 8;
        } else if (type.contains("Float")) {
            return 4;
        } else if (type.contains("Double")) {
            return 8;
        } else {
            return 1;
        }
    }
}
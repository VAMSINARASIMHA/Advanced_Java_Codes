public class BitWise_Operators {
    public static void main(String[] args) {

        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println("AND : " + (a & b));
        System.out.println("OR : " + (a | b));
        System.out.println("XOR : " + (a ^ b)); // for "^", we use XOR operation.
        System.out.println("NOT : " + (~a)); // ~n = -(n + 1).

        int c = -8;
        System.out.println("NOT : " + (~c)); // ~n = +(n - 1).

        System.out.println("Left Shift 1 : " + (a << 1)); // (0101 << 1) ==> (01010) ==> "10". Adding one zero
        // at the end.
        System.out.println("Right Shift 1 : " + (a >> 1)); // (0101 >> 1) ==> (010) ====> "2". removing one bit(0 or 1)
        // at the end.

        System.out.println("Left Shift 2 : " + (a << 2)); // (0101 << 2) ==> (010100) ==> "20". Adding two zeros
        // at the end.

        System.out.println("Right Shift 2 : " + (a >> 2)); // (0101 >> 1) ==> (01) ====> "1". removing two bits(0 or 1)
        // at the end.

        System.out.println("Unsigned Right Shift : " + (a >>> 1));
    }
}

/*
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * int a = -5;
 * System.out.println(a >> 1);
 * System.out.println(a >>> 1);
 * 
 * }
 * }
 * 
 * 
 */
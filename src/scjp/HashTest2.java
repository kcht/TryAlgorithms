package scjp;

import java.util.Arrays;

public class HashTest2 {

    private String str;

    public HashTest2(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return this.str;
    }

    public static void main(String args[]) {
        HashTest2 h1 = new HashTest2("2");
        String s1 = new String("1");

        Object arr[] = new Object[2];
        arr[0] = h1;
        arr[1] = s1;
        Arrays.sort(arr);
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
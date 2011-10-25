/*
 * Copyright (c) 2011. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

public class Test {

    public static void main(String args[]) {

        System.out.println("\nThis is a test!");
        String a = "0102000001";
        String b = "";

        if (a == null || a.length() != 10) {
            System.out.println("a is not 10 digit or empty!");
        } else {
            for (int i = 0; i < 10; i = i + 2) {
                System.out.println(a.substring(i, i + 2));
                if (getCode(a.substring(i, i + 2)) != null) {
                    b = b + getCode(a.substring(i, i + 2));
                }
            }

            System.out.println("RESULT = [" + b + "]");
        }
    }

    private static String getCode(String code) {
        String b = null;

        if (code.equals("01")) {
            b = "0107";
        }
        if (code.equals("02")) {
            b = "0106";
        }
        if (code.equals("03")) {
            b = "0103";
        }

        return b;
    }
}

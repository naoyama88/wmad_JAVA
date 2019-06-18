package Activity01;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11 {

    /**
     * convert base 10 number into base 2 number
     *
     * @param base10Num a base 10 number
     * @return String base 2 number
     */
    public static String convertToBase2(int base10Num) {
        String base2NumStr = "";
        while (base10Num > 0) {
            int remainder = base10Num % 2;
            base2NumStr = Integer.toString(remainder) + base2NumStr;
            base10Num = base10Num / 2;
        }

        System.out.println(base2NumStr);
        return base2NumStr;

    }

    // get max, min and distance
    //:return: max, min, distance
    public static ArrayList printDistanceBetweenTwoNumbers() {
        int A = 0;
        int B = 0;
        boolean numAHasNum = false;
        boolean numBHasNum = false;
        boolean containString = false;
        Scanner reader = new Scanner(System.in);
        int count;
        while (!containString) {
            containString = false;
            System.out.println("input number: ");
            String numStr = reader.nextLine();
            if (numStr.length() == 0) {
                throw new IllegalArgumentException("input a number");
            }
            count = 0;
            int length = numStr.length();
            for (int i = 0; i < length; i++) {
                boolean isNum = false;
                if (numStr.charAt(i) == '-') {
                    isNum = count == 0;

                } else {
                    switch (numStr.charAt(i)) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            isNum = true;
                    }
                }

                if (!isNum) {
                    containString = true;
                }
                count++;
            }

            if (!containString) {
                if (!numBHasNum) {
                    B = Integer.parseInt(numStr);
                    numBHasNum = true;
                }
            }

        }


    }
    contain_string = False
    while not contain_string:
    contain_string = False
            input_string = input('input a number : ')
    i = 0
            if len(input_string) == 0:
    exit('input a number')
        for c in input_string:
    is_num = False
            if c == '-':
            if i == 0:
    is_num = True
                else:
    is_num = False
    elif c == '0'\
    or c == '1'\
    or c == '2'\
    or c == '3'\
    or c == '4'\
    or c == '5'\
    or c == '6'\
    or c == '7'\
    or c == '8'\
    or c == '9':
    is_num = True

            if not is_num:
    contain_string = True
            i = i + 1
        if not contain_string:
            if not num_b_has_num:
    num_b = int(input_string)
    num_b_has_num = True
            else:
                    if num_a_has_num:
            if num_b <= int(input_string):
    num_b = int(input_string)
    elif num_a > int(input_string):
    num_a = int(input_string)
                else:
                        if num_b < int(input_string):
    num_a = num_b
            num_a_has_num = True
    num_b = int(input_string)
                    else:
    num_a = int(input_string)
    num_a_has_num = True

    if not num_a_has_num or not num_b_has_num:
    exit('input at least two numbers')

    absolute_num = abs(num_b - num_a)

    print('Max num is', num_b)
    print('Min num is', num_a)
    print('Distance is', absolute_num)
    return num_b, num_b, absolute_num

}

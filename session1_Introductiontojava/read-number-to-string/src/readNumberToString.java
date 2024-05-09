public class readNumberToString {

    static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String readNumber(int number) {
        if (number < 0 || number > 999) {
            return "Số không hợp lệ";
        }

        StringBuilder result = new StringBuilder();

        int hundreds = number / 100;
        int tensAndUnits = number % 100;

        if (hundreds > 0) {
            result.append(units[hundreds]).append(" hundred");
            if (tensAndUnits > 0) {
                result.append(" and ");
            }
        }

        if (tensAndUnits >= 20) {
            int tensDigit = tensAndUnits / 10;
            result.append(tens[tensDigit]);
            int unitsDigit = tensAndUnits % 10;
            if (unitsDigit > 0) {
                result.append(" ").append(units[unitsDigit]);
            }
        } else if (tensAndUnits >= 10) {
            result.append(teens[tensAndUnits - 10]);
        } else if (tensAndUnits > 0) {
            result.append(units[tensAndUnits]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(readNumber(261)); // Output: "two hundred and sixty one"
    }
}

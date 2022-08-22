import java.util.Objects;
import java.util.Scanner;

public class calc {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите арифметическое выражение (числа и знак должны отделяться друг от друга пробелами):");
        Scanner s = new Scanner(System.in);
        String Numbers = s.nextLine();
        String[] nums = Numbers.split(" ");

        if((Objects.equals(nums[0], "1") || Objects.equals(nums[0], "2") || Objects.equals(nums[0], "3") || Objects.equals(nums[0], "4")
                || Objects.equals(nums[0], "5") || Objects.equals(nums[0], "6") || Objects.equals(nums[0], "7") || Objects.equals(nums[0], "8")
                || Objects.equals(nums[0], "9") || Objects.equals(nums[0], "10"))
        && (Objects.equals(nums[2], "1") || Objects.equals(nums[2], "2") || Objects.equals(nums[2], "3") || Objects.equals(nums[2], "4")
                || Objects.equals(nums[2], "5") || Objects.equals(nums[2], "6") || Objects.equals(nums[2], "7") || Objects.equals(nums[2], "8")
                || Objects.equals(nums[2], "9") || Objects.equals(nums[2], "10"))){
            if(Objects.equals(nums[1], "+")){
                int i=Integer.parseInt(nums[0]);
                int j=Integer.parseInt(nums[2]);
                int result = i + j;
               System.out.println(result);
            }
            if(Objects.equals(nums[1], "-")){
                int i=Integer.parseInt(nums[0]);
                int j=Integer.parseInt(nums[2]);
                int result = i - j;
                System.out.println(result);
            }
            if(Objects.equals(nums[1], "*")){
                int i=Integer.parseInt(nums[0]);
                int j=Integer.parseInt(nums[2]);
                int result = i * j;
                System.out.println(result);
            }
            if(Objects.equals(nums[1], "/")){
                int i=Integer.parseInt(nums[0]);
                int j=Integer.parseInt(nums[2]);
                int result = i / j;
                System.out.println(result);
            }
        }
        else if ((Objects.equals(nums[0], "I") || Objects.equals(nums[0], "II") || Objects.equals(nums[0], "III") || Objects.equals(nums[0], "IV")
                || Objects.equals(nums[0], "V") || Objects.equals(nums[0], "VI") || Objects.equals(nums[0], "VII") || Objects.equals(nums[0], "VIII")
                || Objects.equals(nums[0], "IX") || Objects.equals(nums[0], "X"))
                && (Objects.equals(nums[2], "I") || Objects.equals(nums[2], "II") || Objects.equals(nums[2], "III") || Objects.equals(nums[2], "IV")
                || Objects.equals(nums[2], "V") || Objects.equals(nums[2], "VI") || Objects.equals(nums[2], "VII") || Objects.equals(nums[2], "VIII")
                || Objects.equals(nums[2], "IX") || Objects.equals(nums[2], "X"))) {

            int p = 0;
            int k = 0;
            switch(nums[0]) {
                case "I":
                    p = 1;
                    break;
                case "II":
                    p = 2;
                    break;
                case "III":
                    p = 3;
                    break;
                case "IV":
                    p = 4;
                    break;
                case "V":
                    p = 5;
                    break;
                case "VI":
                    p = 6;
                    break;
                case "VII":
                    p = 7;
                    break;
                case "VIII":
                    p = 8;
                    break;
                case "IX":
                    p = 9;
                    break;
                case "X":
                    p = 10;
                    break;
            }
            switch(nums[2]) {
                    case "I":
                        k = 1;
                        break;
                    case "II":
                        k = 2;
                        break;
                    case "III":
                        k = 3;
                        break;
                    case "IV":
                        k = 4;
                        break;
                    case "V":
                        k = 5;
                        break;
                    case "VI":
                        k = 6;
                        break;
                    case "VII":
                        k = 7;
                        break;
                    case "VIII":
                        k = 8;
                        break;
                    case "IX":
                        k = 9;
                        break;
                    case "X":
                        k = 10;
                        break;
                }

            String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                    "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                    "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV","LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
                     };

            if(Objects.equals(nums[1], "+")){
                int result = p + k;
                System.out.println(roman[result - 1]);
            }
            if(Objects.equals(nums[1], "-")){
                int result = p - k;
                if(result >= 1){
                    System.out.println(roman[result - 1]);
                }
                else throw new Exception("Результат в римских цифрах не может быть меньше единицы");
            }
            if(Objects.equals(nums[1], "*")){
                int result = p * k;
                System.out.println(roman[result - 1]);
            }
            if(Objects.equals(nums[1], "/")){
                int result = p / k;
                if(result >= 1){
                    System.out.println(roman[result - 1]);
                }
                else throw new Exception("Результат в римских цифрах не может быть меньше единицы");
            }
        }
        else throw new Exception("Неверный формат данных");;

        }
    }
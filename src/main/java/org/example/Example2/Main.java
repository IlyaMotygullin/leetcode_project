package org.example.Example2;

public class Main {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    /*
    Задано целое число x, верните, true если x это
палиндром
 в противном случаеfalse, и .
Пример 1:
Ввод: x = 121
Вывод:true
Пояснение: 121 читается как 121 слева направо и справа налево.

Пример 2:
Ввод: x = -121
Вывод:false
Пояснение: Слева направо написано -121. Справа налево он становится 121-. Следовательно, это не палиндром.

Пример 3:
Ввод: x = 10
Вывод:false
Объяснение: Читается 01 справа налево. Следовательно, это не палиндром.
     */
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            left++;
            right--;
            if (str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }
}

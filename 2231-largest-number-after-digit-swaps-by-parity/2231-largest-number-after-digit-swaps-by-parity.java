class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int a = arr[i] - '0';
                int b = arr[j] - '0';

                if (a % 2 == b % 2 && b > a) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return Integer.parseInt(new String(arr));
    }
}
package codingBat.solutions.string3;

public class CountYZ {

    public int countYZ(String str) {
        char[] array = str.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (i > 0 && !Character.isLetter(array[i]) && (Character.toLowerCase(array[i - 1]) == 'y' || Character.toLowerCase(array[i - 1]) == 'z')) {
                count++;
            }
            if (i == array.length - 1 && (Character.toLowerCase(array[i]) == 'y' || Character.toLowerCase(array[i]) == 'z')) {
                count++;
            }

        }
        return count;
    }
}

package lab6.part3SimplifyingConditionalExpressions.task4RemoveControlFlag;

public class ElementSearch {
    public void searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }
}

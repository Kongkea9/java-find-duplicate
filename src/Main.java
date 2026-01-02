import java.util.Arrays;

public class Main {

    static Object[] findDuplicate(Object[] objects)
    {
        Object[] duplicateElement = new Object[objects.length];
        int length = 0;


        for(int i = 0; i<objects.length; i++)
        {
            for(int j = i+1 ;j < objects.length;j++)
            {
                if (objects[i].equals(objects[j])) {

                    duplicateElement[i] = objects[i];
                    ++length;

                    break;
                }
            }

        }

        Object[] finalDuplicateElement = new Object[length];

        int index = 0;
        for (Object o : duplicateElement) {
            if (o != null) {
                finalDuplicateElement[index] = o;
                index++;
            }
        }

        return finalDuplicateElement;
    }



    public static void main(String[] args) {

        String[] names = {"kea","heng","song","kea","lyly","mey","lyly","mey","jing"};
        Integer[] numbers = {1,2,5,4,8,5,10,11,10,13};
        Double[] nums = {1.4,4.3,1.4,4.3,10.3,12.3};

        System.out.println("Duplicate elements : " + Arrays.toString(findDuplicate(names)));
        System.out.println("Duplicate elements : " + Arrays.toString(findDuplicate(numbers)));
        System.out.println("Duplicate elements : " + Arrays.toString(findDuplicate(nums)));

    }
}

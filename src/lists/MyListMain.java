package lists;

public class MyListMain {
    public static void main(String[] args) {
        MyList<Integer> nums = new MyList<>();
        nums.add(1);
        nums.add(2);

        System.out.println(nums.get(0));
        System.out.println(nums.get(1));

    }
}

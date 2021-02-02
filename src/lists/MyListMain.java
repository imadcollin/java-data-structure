package lists;

public class MyListMain {
    public static void main(String[] args) {
        MyList<Integer> nums = new MyList<>();
        nums.add(1);
        nums.add(2);

        System.out.println(nums.get(0));
        System.out.println(nums.get(1));

        MyList<String> strings= new MyList<>(); 
        strings.add("str1"); 
        strings.add("str2"); 
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));

        strings.remove(0);
        System.out.println(strings.get(0));


    }
}

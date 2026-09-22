package Arrays.SlidingWindow;

public class BasicSlidingWindow {
    public static void main(String[] args) {
    int nums []= {1,2,3,4,5,6};
    int sum = 0;
    int size = 3;
    for(int i=0;i<size;i++){
        sum = sum + nums[i];
    }
    System.out.println("This is the first Window sum: "+sum);
    for(int i=1;i<nums.length-size;i++) {
        sum = sum - nums[i - 1] + nums[i + size - 1];
        System.out.println("sum: " + sum);
    }
    }
}


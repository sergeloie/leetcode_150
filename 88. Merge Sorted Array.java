// https://leetcode.com/problems/merge-sorted-array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var s1 = Arrays.stream(Arrays.copyOf(nums1, m)).boxed();
        var s2 = Arrays.stream(Arrays.copyOf(nums2, n)).boxed();
        AtomicInteger count = new AtomicInteger();
        Stream.concat(s1 ,s2)
        .sorted()
        .mapToInt(x -> x)
        .forEach(x -> {
            nums1[count.getAndIncrement()] = x;
        });
    }
}

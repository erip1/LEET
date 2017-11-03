import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candies) {
        //Arrays.sort(candies);
        //Array sorted
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}

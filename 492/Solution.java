class Solution {
    public int[] constructRectangle(int area) {
        int [] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        if (area == 0) {
            return result;
        }
        int var = (int)(Math.sqrt(area));
        while (area % var != 0) {
            var--;
        }
        result[0] = (area/var);
        result[1] = var;
        return result;
    }
}

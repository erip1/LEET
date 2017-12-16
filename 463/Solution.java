class Solution {
    
    public static void main(String[] args) {
    	if (args.length >= 2) {
		    System.out.println(args[0]);
		    int[][] test = new int[Integer.valueOf(args[0])][Integer.valueOf(args[1])];
		    System.out.println(test.length);
		    System.out.println(test[0].length);
		}
	}

    public int islandPerimeter(int[][] grid) {
		int perimeterSize = 0;
		if (grid.length >= 1 && grid[0].length >= 1) {
		    for (int i = 0; i < grid.length) {
			    for (int j = 0; j < grid[0].length) {
			    	if (grid[i][j] == 1) {
			    		if (i - 1 >= 0) {
			    		
		    			}
		    		}
			    }
			}               
		}
    }
}

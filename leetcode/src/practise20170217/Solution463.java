package practise20170217;
/**
 * Island Perimeter
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, 
 * and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water 
 * inside that isn't connected to the water around the island). One cell is a square with side length 
 * 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 * @author Troy
 *
 */
public class Solution463 {
	public int islandPerimeter(int[][] grid) {
		if(grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int res = 0;
		int duplicate = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					res += 4;
					//上面是否重合
					if(i > 0 && grid[i - 1][j] == 1) {
						duplicate++;
					}
					//下面是否重合
					if(i < grid.length - 1 && grid[i + 1][j] == 1) {
						duplicate++;
					}
					//左边是否重合
					if(j > 0 && grid[i][j - 1] == 1) {
						duplicate++;
					}
					//右边是否重合
					if(j < grid[i].length - 1 && grid[i][j + 1] == 1) {
						duplicate++;
					}
				}
			}
		}
		return res - duplicate;
	}
}

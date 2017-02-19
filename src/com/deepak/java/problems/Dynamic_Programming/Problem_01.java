package com.deepak.java.problems.Dynamic_Programming;

/**
 * Egg Dropping.
 * You are given n number of eggs and n floors.
 * Find the max floor from where egg doesn't break 
 * 
 * @author Deepak
 */
public class Problem_01 {

	/**
	 * Find floor recursive
	 * This is good if we have less number of floors
	 * 
	 * @param eggs
	 * @param floors
	 * @return
	 */
	public static int findFloor(int eggs, int floors) {
		if (eggs == 1) {
			return floors;
		}
		if (floors == 0) {
			return 0;
		}
		int min = 1000;
		for (int i = 1; i <= floors; i++) {
			int val = 1 + Math.max(findFloor(eggs - 1, i - 1), findFloor(eggs, floors - i));
			if (val < min) {
				min = val;
			}
		}
		return min;
	}

	public static int maxDropsRequiredDP(int numEggs, int numFloors)
	{
		int lookup[][] = new int[numEggs+1][numFloors+1];

		// For a single egg, Drops required = numFloors
		for (int floorsK=0; floorsK<=numFloors; floorsK++)
		{
			lookup[1][floorsK] = floorsK;
		}

		// For 0, 1 and 2 floors, no of Drops is fixed as well
		// regardless of the number of eggs
		for (int eggsK=1; eggsK<=numEggs; eggsK++)
		{
			lookup[eggsK][0] = 0; // For 0 floors, 0 Drops
			lookup[eggsK][1] = 1; // For 1 floor, 1 Drop
			lookup[eggsK][2] = 2; // For 2 floors, 2 Drops
		}

		for (int eggsK=2; eggsK<=numEggs; eggsK++)
		{
			for (int floorsK=3; floorsK<=numFloors; floorsK++)
			{
				int minDrops = -1;
				for (int x=1; x<=floorsK; x++)
				{
					int maxDropsAtFloorK = 1 + Math.max(
							lookup[eggsK-1][x-1],
							lookup[eggsK][floorsK-x]
							);
					if (minDrops == -1 || minDrops > maxDropsAtFloorK)  
					{
						minDrops = maxDropsAtFloorK;
						lookup[eggsK][floorsK] = minDrops;
					}
				}
			}
			printLookup (lookup);
		}
		return lookup[numEggs][numFloors];
	}

	private static void printLookup(int[][] lookup)
	{
		System.out.println ();
		for (int i=0; i<lookup.length; i++)
		{
			for (int j=0; j<lookup[i].length; j++)
			{
				System.out.print (String.format("%3d", lookup[i][j]));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//System.out.println(findFloor(2, 20));
		System.out.println(maxDropsRequiredDP(2, 1000));
	}

}

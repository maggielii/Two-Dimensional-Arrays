package code;

public class TwoDimensionalArrays {

	public static void main(String[] args) {


		int[][] manta = new int[7][7];
		
		for(int x = 0; x < manta.length; x++)
		{
			for(int y = 0; y < manta[x].length; y++)
			{
				System.out.print(manta[x][y] + " ");
			}
			System.out.println();
		}

	}

}

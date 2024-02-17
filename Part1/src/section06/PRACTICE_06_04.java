package section06;

public class PRACTICE_06_04 {

	public static void main(String[] args) {
		int nextRow = 0;
		int nextCol = 2;
		int [][] mabang = new int[5][5];
		int count = 1;
		
		mabang[nextRow][nextCol] = count++;
		
		while (count <= 25) {
			nextRow--;
			nextCol++;
			
			if (nextRow < 0 && nextCol < 5) {
				nextRow = 4;
			}
			
			if (nextRow >= 0 && nextCol == 5) {
				nextCol = 0;
			}
			
			if (nextCol > 4 && nextRow < 0) {
				nextCol -= 1;
				nextRow += 2;
			}
			
			if (mabang[nextRow][nextCol] != 0) {
				nextCol -= 1;
				nextRow += 2;
			}
			
			mabang[nextRow][nextCol] = count++;
			
		}
		
		for (int i = 0; i < mabang.length; i++) {
			for(int j = 0; j < mabang[i].length; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

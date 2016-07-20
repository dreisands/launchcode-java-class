public class Mario {
	// Makes a Mario-esque half pyramid
	public static void main(String[] varArgs){
		/*
			Takes one argument as an Integer. Does not check for errors. 
			The input is the height of the pyramid
		*/
		int heightOfPyramid = Integer.parseInt(varArgs[0]);
		int widthOfPyramid = heightOfPyramid + 1;

		// Loops along the height of the Pyramid.
		for (int i = 1; i <= heightOfPyramid; i++){
			String tempString = "";
			int j = 1;
			// Loops and makes the initial spaces
			for (; j < widthOfPyramid - i; j++){
				tempString = tempString + " ";
			}
			// Loops for the hashmarks
			for (; j < widthOfPyramid + 1; j ++ ){
				tempString = tempString + "#";
			}
			System.out.println(tempString);
		}
	}
}
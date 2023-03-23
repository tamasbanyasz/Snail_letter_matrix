package AppendLetters;

public class AppendLetter{
	 	
	public String[] splitSentence(String sentence) {
		String[] slicedSentence =sentence.replaceAll(" ","").split("");
		return slicedSentence;
	}
	
	public StringBuilder appendSameLetters(String[][] matrix, String[] sliced) {
		StringBuilder sameLetters = new StringBuilder();
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				for (String part: sliced) {
					if ((part+" ").equals(matrix[row][column])) {
						sameLetters.append(matrix[row][column]);
					}
				}
				
			}
		}
		return sameLetters;
	}
	
}

package handlingArrays;

public class FrequencyofArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };

		int[] fr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					fr[j] = visited;

				}
			}
			if (fr[i] != visited)
				fr[i] = count;

		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("Frequency of Array " + arr[i] + " is:" + fr[i]);
		}

	}

}

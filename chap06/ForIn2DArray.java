// ２次元配列を拡張for文で走査

class ForIn2DArray {

	public static void main(String[] args) {
		double[][] a = {{1.0, 2.0}, {3.0, 4.0, 5.0}, {6.0, 7.0}};

		for (double[] i : a) {
			for (double j : i) {
				System.out.printf("%5.1f", j);
			}
			System.out.println();
		}
	}
}

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in)
		var bandera = 1;
		var bandera2 = 2;
		while (bandera < 1500) {
			if (bandera2 % 2 == 0 || bandera2 % 3 == 0 || bandera2 % 5 == 0) {
				bandera++;
			}
			bandera2++;
		}
		System.out.print("El número feo 1500 es " + bandera2);
	}
}
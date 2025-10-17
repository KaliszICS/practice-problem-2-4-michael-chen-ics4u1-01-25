public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages) {
		for (int i = 0; i < names.length; i++) {
			int namesMin = i;
			for (int j = i; j < names.length; j++) {
				if (names[j].toLowerCase().compareTo(names[namesMin].toLowerCase()) < 0) {
					namesMin = j;
				}
			}
			String tempName = names[namesMin];
			names[namesMin] = names[i];
			names[i] = tempName;

			int tempAge = ages[namesMin];
			ages[namesMin] = ages[i];
			ages[i] = tempAge;
		}

		for (String i : names) {
			System.out.print(i + " ");
		}
		for (int i : ages) {
			System.out.print(i + " ");
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		for (int i = 0; i < ages.length; i++) {
			int agesMin = i;
			for (int j = i; j < ages.length; j++) {
				if (ages[j] < ages[agesMin]) {
					agesMin = j;
				}
			}
			String tempName = names[agesMin];
			names[agesMin] = names[i];
			names[i] = tempName;

			int tempAge = ages[agesMin];
			ages[agesMin] = ages[i];
			ages[i] = tempAge;
		}
	}

}

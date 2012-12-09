package com.lincoln.skills.headfirstpatttern.templatemethod.sort;

public class Arrays {

	@SuppressWarnings("unchecked")
	public static <T> void sort(Comparable<T>[] objectsToSort) {
		int length = objectsToSort.length;

		for (int index = 0; index < length; index++) {
			for (int secondIndex = 0; secondIndex < length; secondIndex++) {
				Comparable<T> t1 = objectsToSort[index];
				Comparable<T> t2 = objectsToSort[secondIndex];

				if (t1.compareTo((T) t2) > 0) {
					Comparable<T> temp = objectsToSort[index];
					objectsToSort[index] = objectsToSort[secondIndex];
					objectsToSort[secondIndex] = temp;
				}
			}
		}
	}
}

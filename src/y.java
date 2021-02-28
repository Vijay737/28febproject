import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class y {
	
	
public static void main(String[] args) {
	int a[] = { 4, 22, 77, 6, 8, 9, 6, 4, 4, 6 };

	int c[] = new int[a.length];
	int b = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] == a[j]) {

				c[b++] = a[j];

			}

		}
	}
	for (int k = 0; k < b; k++) {

		System.out.println(c[k]);
	}

}
}

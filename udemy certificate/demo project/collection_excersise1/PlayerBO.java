package collection_excersise1;

import java.util.ArrayList;
import java.util.List;

public class PlayerBO {

	void diplayAllPlayerDetails(List<Player> alist) {

		int i;
		
		for (i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
	}
}

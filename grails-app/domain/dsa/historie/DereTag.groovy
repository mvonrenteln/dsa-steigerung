package dsa.historie

import dsa.Mond;


class DereTag {
	
	int tag
	
	Mond mond

	int goetterlauf

    static constraints = {
		tag(min:1, max:30)
    }
}

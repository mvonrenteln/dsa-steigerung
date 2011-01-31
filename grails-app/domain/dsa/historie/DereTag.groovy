package dsa.historie


class DereTag {
	
	int tag
	
	Mond mond

	int goetterlauf

    static constraints = {
		tag(min:1, max:30)
    }
}

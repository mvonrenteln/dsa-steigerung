package dsa

class DereTag {
	
	enum Mond {
		Firun, Tsa, Phex, Peraine, Ingerimm, Rahja, 
		Praios, Rondra, Efferd, Travia, Boron, Hesinde
	}

	int tag
	
	Mond mond

	int goetterlauf

    static constraints = {
		tag(min:1, max:30)
    }
}

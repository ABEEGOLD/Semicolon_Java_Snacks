public class TestDriller{
	public static int uberTester(int number){

	if(number >= 1 && number <= 4){
		number = number * 2000;
		return number;
	}

	if(number >= 5 && number <= 9){
		number = number * 1800;
		return number;
	}

	if(number >= 10 && number <= 29){
		number = number * 1600;
		return number;
	}

	if(number >= 30 && number <= 49){
		number = number * 1500;
		return number;
	}

	if(number >= 50 && number <= 99){
		number = number * 1300;
		return number;
	}

	if(number >= 100 && number <= 199){
		number = number * 1200;
		return number;
	}

	if(number >= 200 && number <= 499){
		number = number * 1100;
		return number;
	}

	else{
		number  = number * 1000;
		return number;
	}


	}

}
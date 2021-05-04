import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckService;
import Concrete.NeroManager;
import Concrete.StarbucksManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new NeroManager();
		customerManager.Save(new Customer(1, "Rahmi","Köse", "1999", "11111111"));
		
		
		
		
	}

}

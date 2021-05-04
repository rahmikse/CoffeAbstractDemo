package Concrete;


import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Abstract.IPersonCheckService;
import Entities.Customer;

public class StarbucksManager  extends BaseCustomerManager {
	
	IPersonCheckService iPersonCheckService;
	
	public StarbucksManager(IPersonCheckService iPersonCheckService) {
		this.iPersonCheckService = iPersonCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if (iPersonCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}

	

	

	


}

package Concrete;

import Abstract.CustomerCheckService;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);			
		}
		else {
			System.out.println("Not a valid person.");
		}

	}
	
	
	
	

}

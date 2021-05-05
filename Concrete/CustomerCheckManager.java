package Concrete;

import Entities.Customer;
import Abstract.CustomerService;
import Abstract.CustomerCheckService;
import MernisService.*;	

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
	
}

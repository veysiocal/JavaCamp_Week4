
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()) ;
		customerManager.save(new Customer(1,"Veysi","Ocal",LocalDate.of(1998, 01, 01),"56546264821"));
		

		
	}

}
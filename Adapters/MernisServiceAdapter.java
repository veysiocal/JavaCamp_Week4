package Adapters;

import Abstract.*;
import Entities.Customer;
import MernisService.*;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			boolean result = client.TcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
			return result;
		}catch(Exception e){
			e.toString();
			return false;
		}
		
	}
	
}

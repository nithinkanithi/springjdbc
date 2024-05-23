package jdbc;

import java.util.List;

public interface CustomerDao {
	public List<Customer> getCustomers();

	boolean Insert(Customer c);
}

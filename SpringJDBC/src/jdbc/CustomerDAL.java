package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAL implements CustomerDao {

	@Autowired
	JdbcTemplate jdbctemplate;

	private final String SQL_FIND_Customer = "select * from customer_13";
	private final String SQL_INSERT_Customer = "insert into customer_13(cid, cname, cmobile) values(?,?,?)";
	// @Autowired
	// public CustomerDAL(DataSource datasource) {
	// jdbctemplate = new JdbcTemplate(datasource);
	// }

	@Override
	public List<Customer> getCustomers() {
		return jdbctemplate.query(SQL_FIND_Customer, new CustomerMapper());
	}

	@Override
	public boolean Insert(Customer c) {
		return jdbctemplate.update(SQL_INSERT_Customer, c.getCid(), c.getCname(), c.getCmobile()) > 0;
	}

}

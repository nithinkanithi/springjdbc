package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cus = new Customer();
		cus.setCid(rs.getInt(1));
		cus.setCname(rs.getString(2));
		cus.setCmobile(rs.getString(3));
		return cus;
	}

}

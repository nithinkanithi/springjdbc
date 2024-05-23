package jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JDBCController {

	@Autowired
	private CustomerDao obj;
	Customer c = new Customer(4, "sudheer", "8374294983");

	@RequestMapping(value = "/Info", method = RequestMethod.GET)
	public String getFields(Model model) {
		List<Customer> cus = obj.getCustomers();
		model.addAttribute("customers", cus);
		return "Display";
	}

	@RequestMapping("/Insert")
	public String createRecords() {
		boolean b = obj.Insert(c);
		System.out.println(b);
		return "Demo";
	}
}

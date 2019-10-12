package gengfo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import model.Customer;
import model.Data;

//http://blog.bdoughan.com/2010/10/how-does-jaxb-compare-to-simple.html

public class JAXBDemo {

	public static void main(String[] args) throws Exception {

		JAXBContext jc = JAXBContext.newInstance(Customer.class);

		Marshaller marshaller = jc.createMarshaller();

		// String[] packagesToScan=
		// {"<packcge which contain the department class>"};
		// marshaller.setPackagesToScan(packagesToScan);

		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		JAXBElement<Customer> jaxbElement = new JAXBElement<Customer>(
				new QName("customer"), Customer.class, Data.CUSTOMER);

		marshaller.marshal(jaxbElement, System.out);

	}

}

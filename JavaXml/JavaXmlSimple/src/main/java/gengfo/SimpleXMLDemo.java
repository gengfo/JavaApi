package gengfo;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import model.Data;

//http://blog.bdoughan.com/2010/10/how-does-jaxb-compare-to-simple.html

public class SimpleXMLDemo {

	public static void main(String[] args) {

		try {
			Serializer serializer = new Persister();
			serializer.write(Data.CUSTOMER, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

package cn.edu.ahpu.ws.demo.c_cxf_04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class App {
	public static void main(String[] args) throws Exception {
		PersonServiceService pss = new PersonServiceService();
		PersonService service = pss.getPersonServicePort();
		Person p = service.findPerson("jhs");

		System.out.println(p.getName()
				+ ","
				+ p.getAge()
				+ ","
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(convertToDate(p
						.getBirthdate())));
				
		p = new Person();
		p.setAge(22);
		p.setName("Íõ°Ë");
		p.setBirthdate(convertToXMLGregorianCalendar(new Date()));
		System.out.println(service.printPersonInfo(p));
	}

	public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		XMLGregorianCalendar gc = null;
		try {
			gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return gc;
	}

	public static Date convertToDate(XMLGregorianCalendar cal) throws Exception {
		GregorianCalendar ca = cal.toGregorianCalendar();
		return ca.getTime();
	}
}

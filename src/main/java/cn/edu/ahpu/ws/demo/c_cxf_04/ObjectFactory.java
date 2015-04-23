
package cn.edu.ahpu.ws.demo.c_cxf_04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.ahpu.ws.demo.c_cxf_04 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Person_QNAME = new QName("http://c_cxf_04.demo.ws.ahpu.edu.cn/", "Person");
    private final static QName _FindPerson_QNAME = new QName("http://c_cxf_04.demo.ws.ahpu.edu.cn/", "findPerson");
    private final static QName _PrintPersonInfo_QNAME = new QName("http://c_cxf_04.demo.ws.ahpu.edu.cn/", "printPersonInfo");
    private final static QName _FindPersonResponse_QNAME = new QName("http://c_cxf_04.demo.ws.ahpu.edu.cn/", "findPersonResponse");
    private final static QName _PrintPersonInfoResponse_QNAME = new QName("http://c_cxf_04.demo.ws.ahpu.edu.cn/", "printPersonInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.edu.ahpu.ws.demo.c_cxf_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindPersonResponse }
     * 
     */
    public FindPersonResponse createFindPersonResponse() {
        return new FindPersonResponse();
    }

    /**
     * Create an instance of {@link FindPerson }
     * 
     */
    public FindPerson createFindPerson() {
        return new FindPerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PrintPersonInfoResponse }
     * 
     */
    public PrintPersonInfoResponse createPrintPersonInfoResponse() {
        return new PrintPersonInfoResponse();
    }

    /**
     * Create an instance of {@link PrintPersonInfo }
     * 
     */
    public PrintPersonInfo createPrintPersonInfo() {
        return new PrintPersonInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://c_cxf_04.demo.ws.ahpu.edu.cn/", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://c_cxf_04.demo.ws.ahpu.edu.cn/", name = "findPerson")
    public JAXBElement<FindPerson> createFindPerson(FindPerson value) {
        return new JAXBElement<FindPerson>(_FindPerson_QNAME, FindPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintPersonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://c_cxf_04.demo.ws.ahpu.edu.cn/", name = "printPersonInfo")
    public JAXBElement<PrintPersonInfo> createPrintPersonInfo(PrintPersonInfo value) {
        return new JAXBElement<PrintPersonInfo>(_PrintPersonInfo_QNAME, PrintPersonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://c_cxf_04.demo.ws.ahpu.edu.cn/", name = "findPersonResponse")
    public JAXBElement<FindPersonResponse> createFindPersonResponse(FindPersonResponse value) {
        return new JAXBElement<FindPersonResponse>(_FindPersonResponse_QNAME, FindPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintPersonInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://c_cxf_04.demo.ws.ahpu.edu.cn/", name = "printPersonInfoResponse")
    public JAXBElement<PrintPersonInfoResponse> createPrintPersonInfoResponse(PrintPersonInfoResponse value) {
        return new JAXBElement<PrintPersonInfoResponse>(_PrintPersonInfoResponse_QNAME, PrintPersonInfoResponse.class, null, value);
    }

}

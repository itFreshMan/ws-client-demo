
package cn.edu.ahpu.ws.demo.c_cxf_02;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "IHelloService", targetNamespace = "http://c_cxf_02.demo.ws.ahpu.edu.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IHelloService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://c_cxf_02.demo.ws.ahpu.edu.cn/", className = "cn.edu.ahpu.ws.demo.c_cxf_02.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://c_cxf_02.demo.ws.ahpu.edu.cn/", className = "cn.edu.ahpu.ws.demo.c_cxf_02.SayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

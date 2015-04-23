
package cn.edu.ahpu.ws.demo.c_cxf_03;

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
@WebService(name = "IExpressService", targetNamespace = "http://www.kuaidi100.com/")
@XmlSeeAlso({
})
public interface IExpressService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showSTODetails", targetNamespace = "http://www.kuaidi100.com/", className = "cn.edu.ahpu.ws.demo.c_cxf_03.ShowSTODetails")
    @ResponseWrapper(localName = "showSTODetailsResponse", targetNamespace = "http://www.kuaidi100.com/", className = "cn.edu.ahpu.ws.demo.c_cxf_03.ShowSTODetailsResponse")
    public String showSTODetails(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showDetails", targetNamespace = "http://www.kuaidi100.com/", className = "cn.edu.ahpu.ws.demo.c_cxf_03.ShowDetails")
    @ResponseWrapper(localName = "showDetailsResponse", targetNamespace = "http://www.kuaidi100.com/", className = "cn.edu.ahpu.ws.demo.c_cxf_03.ShowDetailsResponse")
    public String showDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
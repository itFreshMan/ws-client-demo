
package cn.edu.ahpu.ws.demo.c_cxf_02;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "IHelloServiceService", targetNamespace = "http://c_cxf_02.demo.ws.ahpu.edu.cn/", wsdlLocation = "http://192.168.1.108:6789/hello?wsdl")
public class IHelloServiceService
    extends Service
{

    private final static URL IHELLOSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(cn.edu.ahpu.ws.demo.c_cxf_02.IHelloServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = cn.edu.ahpu.ws.demo.c_cxf_02.IHelloServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.1.108:6789/hello?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.1.108:6789/hello?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        IHELLOSERVICESERVICE_WSDL_LOCATION = url;
    }

    public IHelloServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IHelloServiceService() {
        super(IHELLOSERVICESERVICE_WSDL_LOCATION, new QName("http://c_cxf_02.demo.ws.ahpu.edu.cn/", "IHelloServiceService"));
    }

    /**
     * 
     * @return
     *     returns IHelloService
     */
    @WebEndpoint(name = "IHelloServicePort")
    public IHelloService getIHelloServicePort() {
        return super.getPort(new QName("http://c_cxf_02.demo.ws.ahpu.edu.cn/", "IHelloServicePort"), IHelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloService
     */
    @WebEndpoint(name = "IHelloServicePort")
    public IHelloService getIHelloServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://c_cxf_02.demo.ws.ahpu.edu.cn/", "IHelloServicePort"), IHelloService.class, features);
    }

}

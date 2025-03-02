
package main.java.com.soap.ws.temp;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TempConvert", targetNamespace = "https://www.w3schools.com/xml/", wsdlLocation = "https://www.w3schools.com/xml/tempconvert.asmx?WSDL")
public class TempConvert
    extends Service
{

    private final static URL TEMPCONVERT_WSDL_LOCATION;
    private final static WebServiceException TEMPCONVERT_EXCEPTION;
    private final static QName TEMPCONVERT_QNAME = new QName("https://www.w3schools.com/xml/", "TempConvert");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.w3schools.com/xml/tempconvert.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEMPCONVERT_WSDL_LOCATION = url;
        TEMPCONVERT_EXCEPTION = e;
    }

    public TempConvert() {
        super(__getWsdlLocation(), TEMPCONVERT_QNAME);
    }

    public TempConvert(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEMPCONVERT_QNAME, features);
    }

    public TempConvert(URL wsdlLocation) {
        super(wsdlLocation, TEMPCONVERT_QNAME);
    }

    public TempConvert(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEMPCONVERT_QNAME, features);
    }

    public TempConvert(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TempConvert(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap")
    public TempConvertSoap getTempConvertSoap() {
        return super.getPort(new QName("https://www.w3schools.com/xml/", "TempConvertSoap"), TempConvertSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap")
    public TempConvertSoap getTempConvertSoap(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.w3schools.com/xml/", "TempConvertSoap"), TempConvertSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEMPCONVERT_EXCEPTION!= null) {
            throw TEMPCONVERT_EXCEPTION;
        }
        return TEMPCONVERT_WSDL_LOCATION;
    }

}


package main.java.com.soap.ws.temp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap.ws.temp package. 
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

    private final static QName _String_QNAME = new QName("https://www.w3schools.com/xml/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.temp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FahrenheitToCelsius }
     * 
     */
    public FahrenheitToCelsius createFahrenheitToCelsius() {
        return new FahrenheitToCelsius();
    }

    /**
     * Create an instance of {@link FahrenheitToCelsiusResponse }
     * 
     */
    public FahrenheitToCelsiusResponse createFahrenheitToCelsiusResponse() {
        return new FahrenheitToCelsiusResponse();
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheit }
     * 
     */
    public CelsiusToFahrenheit createCelsiusToFahrenheit() {
        return new CelsiusToFahrenheit();
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheitResponse }
     * 
     */
    public CelsiusToFahrenheitResponse createCelsiusToFahrenheitResponse() {
        return new CelsiusToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.w3schools.com/xml/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.10.16 a las 10:23:36 PM CEST 
//


package org.example.newxmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.newxmlschema package. 
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

    private final static QName _Libro_QNAME = new QName("http://www.example.org/NewXMLSchema", "Libro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.newxmlschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Libro }
     * 
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Libro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/NewXMLSchema", name = "Libro")
    public JAXBElement<Libro> createLibro(Libro value) {
        return new JAXBElement<Libro>(_Libro_QNAME, Libro.class, null, value);
    }

}

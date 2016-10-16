package org.example.newxmlschema;

import javax.xml.bind.*;

public class XMLBinding {
	public static void main(String[] args) {	
		try {
			final JAXBContext jc = JAXBContext.newInstance(Libro.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
	        final JAXBElement<Libro> menuElement = unmarshallLibreria(u);
			System.out.println("Nombre: " + menuElement.getValue().getNombre());
			System.out.println("ISBN: " + menuElement.getValue().getISBN());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static JAXBElement<Libro> unmarshallLibreria(final Unmarshaller u)
			throws JAXBException {
		return (JAXBElement<Libro>)u.unmarshal(XMLBinding.class.getResourceAsStream("/Libreria.xml"));
	}
}

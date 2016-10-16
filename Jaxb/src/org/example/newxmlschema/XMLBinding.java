package org.example.newxmlschema;

import javax.xml.bind.*;

public class XMLBinding {
	public static void main(String[] args) {	
		try {
			final JAXBContext jc = JAXBContext.newInstance(Libro.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
	        final JAXBElement<Estanteria> libreria = unmarshallLibreria(u);
			System.out.println("Nombre Estanteria: " + libreria.getValue().getNombre());
			for(Libro l : libreria.getValue().getLibros()){
				System.out.println("Nombre del libro: " + l.getNombre());
				System.out.println("ISBN: " + l.getISBN());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static JAXBElement<Estanteria> unmarshallLibreria(final Unmarshaller u)
			throws JAXBException {
		return (JAXBElement<Estanteria>)u.unmarshal(XMLBinding.class.getResourceAsStream("/Libreria.xml"));
	}
}

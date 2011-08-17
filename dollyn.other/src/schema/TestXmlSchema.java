package schema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.transform.stream.StreamSource;

import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.apache.ws.commons.schema.XmlSchemaComplexType;
import org.apache.ws.commons.schema.XmlSchemaDatatype;
import org.apache.ws.commons.schema.XmlSchemaElement;

public class TestXmlSchema {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("xml/xsd/test1.xsd");
		XmlSchemaCollection schemaCol = new XmlSchemaCollection();
		XmlSchema schema = schemaCol.read(new StreamSource(is), null);
		
//		XmlSchemaType schemaType = schema.getTypeByName("note");
//		System.out.println(schemaType);
		XmlSchemaElement elem = schema.getElementByName("note");
		System.out.println(elem);
		XmlSchemaComplexType st = (XmlSchemaComplexType) elem.getSchemaType();
		System.out.println(st.getParticle());
		System.out.println(elem.getElementType());
		System.out.println(st.getAttributes());
		System.out.println(elem.getElementType());
	}

}

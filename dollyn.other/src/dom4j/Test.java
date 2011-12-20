package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Test {

	public static void main(String[] args) {
		Document doc = createDocument();
		OutputFormat outformat = OutputFormat.createPrettyPrint();
		outformat.setEncoding("utf-8");
		System.out.println(doc.asXML());
//		XMLWriter writer = new XMLWriter(out, outformat);
//		writer.write(this.doc);
//		writer.flush();
	}

	public static Document createDocument() {
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("root");
		root.setName("sn:root");
		
		Element author2 = root.addElement("author").addAttribute("name", "Toby").addAttribute("location", "Germany").addText("Tobias Rademacher");
		Element author1 = root.addElement("author").addAttribute("name", "James").addAttribute("location", "UK").addText("James Strachan");

		return document;
	}
}

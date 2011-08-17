package xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class TestXPath {
	
	public static void main(String[] args) {
		try {
			System.out.println(System.getProperty("user.dir"));
			File file = new File("xml/test.xml");
			System.out.println(file.exists());
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(file);
			XPathFactory factory = XPathFactory.newInstance();
			XPath xPath = factory.newXPath();
//			NodeList result = (NodeList) xPath.evaluate("/store/author[@name=\"author1\"]/book[@name=\"book11\"]", doc, XPathConstants.NODESET);
			Node result = (Node) xPath.evaluate("/store/author[@name=\"author1\"]/book[@name=\"book11\"]", doc, XPathConstants.NODE);
//			System.out.println(result.getLength());
			System.out.println(result.getNodeName());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}

}

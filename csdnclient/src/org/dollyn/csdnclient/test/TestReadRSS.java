package org.dollyn.csdnclient.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dollyn.csdnclient.model.TopicsReader;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.SAXException;

public class TestReadRSS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testRead2();
	}
	
	private static void testRead1() {
		try {
			long t1 = System.currentTimeMillis();
			URL url = new URL("http://forum.csdn.net/Rss/FreeZone/UnClosedList/");
			InputStream is = url.openStream();
			long t2 = System.currentTimeMillis();
			//BufferedInputStream bis = new BufferedInputStream(is);
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build(is);
			Element root = doc.getRootElement();
			Element channel = root.getChild("channel");
			List items = channel.getChildren("item");
			for(Object o : items) {
				Element item = (Element)o;
				Element title = item.getChild("title");
				System.out.println(title.getContent());
			}
			long t3 = System.currentTimeMillis();
			System.out.println(t2 - t1);
			System.out.println(t3 - t2);
			System.out.println(items.size());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}
	}
	
	private static void testRead2() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			long t1 = System.currentTimeMillis();
			URL url = new URL("http://forum.csdn.net/Rss/FreeZone/UnClosedList/");
			InputStream is = url.openStream();
			long t2 = System.currentTimeMillis();
			TopicsReader reader = new TopicsReader(1);
			parser.parse(is, reader);
			System.out.println(reader.getTopics().size());
			long t3 = System.currentTimeMillis();
			System.out.println(t2 - t1);
			System.out.println(t3 - t2);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package org.dollyn.csdnclient.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TopicsReader extends DefaultHandler {
	
	public static final String ITEM = "item";
	public static final String TITLE = "title";
	public static final String LINK = "link";
	public static final String AUTHOR = "author";
	public static final String PUBDATE = "pubDate";
	public static final String DESCRIPTION = "description";
	
	private Topic current;
	private List<Topic> topics = new ArrayList<Topic>();
	private boolean inItem;
	private String currentElement;
	private int size;
	
	public TopicsReader(int size) {
		this.size = size;
	}
	
	@Override
	public void endElement(String uri, String localName, String name)
			throws SAXException {
		if(topics.size() >= size) return;
		if(name.equals(ITEM)) {
			topics.add(current);
			System.out.println("=====================" + current.getTitle());
			inItem = false;
		}
	}

	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		if(topics.size() >= size) return;
		if(name.equals(ITEM)) {
			current = new Topic();
			inItem = true;
			return;
		} 
		
		//if not in an <item> element
		if(!inItem) {
			currentElement = null;
		} else {
			currentElement = name;
		}				
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(topics.size() >= size) return;
		char[] chs = new char[length];
		System.arraycopy(ch, start, chs, 0, length);
		String content = new String(chs);
		System.out.println(content);
		if(TITLE.equals(currentElement)) {
			current.setTitle(content);
		} else if(AUTHOR.equals(currentElement)) {
			current.setAuthor(content);
		} else if(LINK.equals(currentElement)) {
			current.setLink(content);
		} else if(DESCRIPTION.equals(currentElement)) {
			current.setDescription(content);
		} else if(PUBDATE.equals(currentElement)) {
			current.setDatetime(content);
		} else {
			return;
		}
		currentElement = null;
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		super.ignorableWhitespace(ch, start, length);
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public static TopicsReader Read(String url) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		TopicsReader reader = new TopicsReader(50);
		try {
			SAXParser parser = factory.newSAXParser();
			long t1 = System.currentTimeMillis();
			URL u = new URL(url);
			InputStream is = u.openStream();
			long t2 = System.currentTimeMillis();
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
		return reader;
	}
}

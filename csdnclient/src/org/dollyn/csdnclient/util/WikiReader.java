package org.dollyn.csdnclient.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPather;
import org.htmlcleaner.XPatherException;

public class WikiReader {

	private static final String BOLD_START = "[b]";
	private static final String BOLD_END = "[/b]";
	
	public static String readTodayInHistory(String day) {
		StringBuffer result = new StringBuffer();
	    HtmlCleaner cleaner = new HtmlCleaner(); 
	    URL url;
		try {
			String keyword = java.net.URLEncoder.encode(day, "UTF-8");
			System.out.println(keyword);
			url = new URL("http://zh.wikipedia.org/zh-cn/" + keyword);
//			InputStream stream = new FileInputStream(new File("C:\\wiki.htm"));
			TagNode html = cleaner.clean(url.openStream(), "utf-8");
			XPather pather = new XPather("/body//div[@id='bodyContent'][1]");
			try {
				Object[] o = pather.evaluateAgainstNode(html);
				if (o.length != 1)
					return null;
				
				/* The content is like:
				 * <div id = "bodyContent">
				 * 		<p> 11月18日是阳历一年中的第322天（闰年第323天），离全年的结束还有43天。</p>
				 * 		<h2>大事记</h2>
				 * 		<ul></ul>
				 * 		<h2>出生</h2>
				 * 		<ul></ul>
				 * 		<h2></h2>
				 * 		<ul></ul>
				 * 		<h2></h2>
				 * 		<ul></ul>             // the last 'ul' may not exists...
				 * </div>
				 */
								
				TagNode bodyContent = (TagNode)o[0];
				// fist p("今天是一年中的第几天...")
				TagNode p = bodyContent.findElementByName("p", false);
				result.append(p.getText());
				result.append("\n\n");
				
				// all the "h2" elements
				List h2s = bodyContent.getElementListByName("h2", false);
				// the "h2" elements has a "ul" elements next...
				List uls = bodyContent.getElementListByName("ul", false);
				for (int i = 0; i < h2s.size(); i++) {
					TagNode h2 = (TagNode)h2s.get(i);
					TagNode[] spans = h2.getElementsHavingAttribute("id", false);
					if (spans.length == 1) {
						result.append(BOLD_START + spans[0].getText() + BOLD_END);
						result.append("\n");
					}

					try {
						TagNode ul = (TagNode)uls.get(i);
						result.append(ul.getText() + "\n");
					} catch (IndexOutOfBoundsException ex) {
						// do nothing
					}					
				}
				
			} catch (XPatherException e) {
				e.printStackTrace();
			}
			
//			System.out.println("start");
//			TagNode body = (TagNode)html.getElementListByName("body", false).get(0);
//			TagNode n = body.get
//			TagNode[] nodes = body.getElementsByName("ul", true);
//			if(nodes.length >= 5) {
//				result.append("[b]1 大事记[/b]\n");
//				result.append(nodes[1].getText()+"\r\n");
//				result.append("[b]2 出生[/b]\r\n");
//				result.append(nodes[2].getText()+"\r\n");
//				result.append("[b]3 逝世[/b]\r\n");
//				result.append(nodes[3].getText()+"\r\n");
//				result.append("[b]4 节日、风俗习惯[/b]\r\n");
//				result.append(nodes[4].getText()+"\r\n");
				result.append("\r\n 以上数据来自：http://zh.wikipedia.org/");
//			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();
	}
}

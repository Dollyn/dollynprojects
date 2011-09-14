package org.dollyn.csdnclient.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

public class TestReadHisInWiki {

	public static void main(String[] args) {
	    HtmlCleaner cleaner = new HtmlCleaner(); 
	    URL url;
		try {
			StringBuffer result = new StringBuffer();
			String keyword = java.net.URLEncoder.encode("12月9日", "UTF-8");
			System.out.println(keyword);
			url = new URL("http://zh.wikipedia.org/w/index.php?title=" + keyword + "&variant=zh-cn");
			TagNode html = cleaner.clean(url.openStream(), "utf-8");
			System.out.println("start");
			TagNode body = (TagNode)html.getElementListByName("body", false).get(0); 
			TagNode[] nodes = body.getElementsByName("ul", true);
			if(nodes.length >= 5) {
				result.append("[b]1 大事记[/b]\n");
				result.append(nodes[1].getText()+"\n");
				result.append("[b]2 出生[/b]\n");
				result.append(nodes[2].getText()+"\n");
				result.append("[b]3 逝世[/b]\n");
				result.append(nodes[3].getText()+"\n");
				result.append("[b]4 节日、风俗习惯[/b]\n");
				result.append(nodes[4].getText()+"\n");
			}
			System.out.println(result.toString());
//			for(TagNode u : body.getElementsByName("ul", true)) {
//				System.out.println("=========start");
//				System.out.println(u.getText());
//				System.out.println("=========end");
//			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

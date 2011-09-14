package proxy.presentation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import com.sun.media.sound.HsbParser;

import proxy.Proxy;
import proxy.ProxyFactory;
import proxy.Result;

public class ProxyCollector {
	public static void main(String[] args) throws MalformedURLException {
		new ProxyCollector().collect(ProxyFactory.eINSTANCE.createResult(), "http://5uproxy.net/http_anonymous.html");
	}
	

	public void collect(Result result, String url) {
		try {
//			System.setProperty("http.proxyHost", "127.0.0.1");
//			System.setProperty("http.proxyPort", "9050");

			// url = new URL("http://5uproxy.net/http_fast.html");
//			url = new URL("http://5uproxy.net/http_anonymous.html");
			URLConnection connection = new URL(url).openConnection();
			if (connection instanceof HttpsURLConnection) {
				((HttpsURLConnection) connection).setHostnameVerifier(new HostnameVerifier() {
					@Override
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
			}
			Parser parser = new Parser(connection);
			NodeList nodelist = parser.extractAllNodesThatMatch(new NodeFilter() {
				
				public boolean accept(Node node) {
					if (node instanceof Div) {
						Div div = (Div) node;
						String id = div.getAttribute("id");
						return id != null && id.equals("tb");
					}
					return false;
				}
			});
			
			if (nodelist.size() > 0) {
				Div node = (Div) nodelist.elementAt(0);
				NodeList rows = node.searchFor(TableRow.class, true);
				int rowCount = rows.size();
				for (int i = 1; i < rowCount; i++) {
					TableRow row = (TableRow) rows.elementAt(i);
					NodeList columns = row.searchFor(TableColumn.class, false);
					if (columns != null && columns.size() == 4) {
						TableColumn nName = (TableColumn) columns.elementAt(0);
						TableColumn nIp = (TableColumn) columns.elementAt(1);
						TableColumn nPort = (TableColumn) columns.elementAt(2);
						TableColumn nContry = (TableColumn) columns.elementAt(3);
						Proxy proxy = ProxyFactory.eINSTANCE.createProxy();
						proxy.setName(nName.getStringText());
						proxy.setIp(nIp.getStringText());
						proxy.setPort(nPort.getStringText());
						proxy.setContry(nContry.getStringText());
						proxy.setCreateDate(new Date());
						
						if (!(proxy.getContry().equals("CN")))
							continue;
						if (proxy.getPort().equals("80"))
							continue;
						
						System.out.println(proxy);
						result.getProxies().add(proxy);
					}
				}
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			System.setProperty("http.proxyHost", "");
//			System.setProperty("http.proxyPort", "");
		}
		
	}
		
}

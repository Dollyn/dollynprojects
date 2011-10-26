package com.tencent.weibo.utils;

public class WeiBoConst {
	/**
	 * 返回类型
	 * 
	 * @author <a href="http://blog.javawind.net">Xuefang Xu</a> philyang
	 * 
	 */
	public class ResultType {
		public static final String ResultType_Xml = "xml";
		public static final String ResultType_Json = "json";
	}

	public interface PageFlag {
		String FIRST_PAGE = "0";
		String PRE_PAGE = "1";
		String NEXT_PAGE = "2";
	}
}

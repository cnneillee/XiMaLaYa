package cn.neil.net;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Utils {
	/**
	 * 将HashMap序列化为网络请求参数后缀
	 * 
	 * @param params 网络请求参数键值对
	 * @return 网络请求参数后缀
	 */
	public static String getParams(HashMap<String, String> params) {
		StringBuffer sb = new StringBuffer();
		Set<Entry<String, String>> set = params.entrySet();
		int pointer = 0;
		for (Entry<String, String> entry : set) {
			sb.append(entry.getKey() + "=" + entry.getValue());
			if ((++pointer) <= set.size() - 1)
				sb.append("&");
		}
		return sb.toString();
	}
}

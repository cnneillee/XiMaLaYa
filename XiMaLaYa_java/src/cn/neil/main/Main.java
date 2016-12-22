package cn.neil.main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;

import cn.neil.bean.Doc;
import cn.neil.bean.SimplifiedDoc;
import cn.neil.bean.Root;
import cn.neil.net.HttpRequest;
import cn.neil.net.RequestCallback;

public class Main {
	// 抓包得到的URL
	private static final String API_URL = "http://search.ximalaya.com/front/v1";

	public static void main(String[] args) {
		// 初始化参数
		HashMap<String, String> params = new HashMap<String, String>();
		buildParams(params);
		
		// 网络请求完成后的回调，对网络请求结果做解析
		RequestCallback callback = new RequestCallback() {
			@Override
			public void onFinished(String result) {
				Root root = JSON.parseObject(result, Root.class);
				printResult(root);
			}
		};
		
		// 网络请求
		HttpRequest.sendGet(API_URL, params, callback);
	}

	// 初始化网络请求参数
	private static void buildParams(HashMap<String, String> params) {
		params.put("condition", "play");
		params.put("core", "album");
		params.put("device", "android");
		params.put("live", "true");
		params.put("kw", "卓老板");
		params.put("page", "1");
		params.put("paidFilter", "false");
		params.put("rows", "20");
		params.put("spellchecker", "true");
		params.put("version", "5.4.69");
	}

	// 打印结果，附带对结果进行排序
	private static void printResult(Root root) {
		if (root != null && root.getResponse() != null
				&& root.getResponse().getDocs() != null) {
			// 获取结果
			List<Doc> list = root.getResponse().getDocs();
			// 排序
			Comparator<Doc> c = new Comparator<Doc>() {
				public int compare(Doc o1, Doc o2) {
					return (o1.getPlay() > o2.getPlay()) ? -1 : 1;
				};
			};
			list.sort(c);
			
			// 打印（将对象转化为json数据，打印）
			for (Doc doc : list)
				System.out.println(JSON.toJSON(SimplifiedDoc.simplify(doc)));
		}
	}
}

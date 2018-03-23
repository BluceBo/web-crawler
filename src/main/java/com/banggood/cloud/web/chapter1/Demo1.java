package com.banggood.cloud.web.chapter1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by tanbo on 2018/3/23.
 * 演示通过输入一个网址获取该网页的所有超链接
 */
public class Demo1 {

    public static void main(String[] args) throws IOException {
        //输入网址
        String url = "http://www.firefox.com.cn/?igfox";
        //将结果解析为一个文档对象
        Document doc = Jsoup.connect(url).timeout(10000).get();
        Elements links = doc.select("a[href]");
        //遍历每一个链接，集合里面的函数写在前面
        for (Element limk : links) {
            //得到属性href属性中的值，也就是URL地址
            String linkHref = links.attr("href");
            System.out.println(linkHref);
        }
    }
}

package com.gl.Asd;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Document doc = Jsoup.connect("https://medium.com").get(); 
  	 // Element element =
  	 // doc.getElementsByClass("kb y");
  	  
  	  Elements el=doc.getElementsByClass("bv hq kb kc kd ke kf kg kh ki kj kk kl km kn ko kp kq kr ks kt ku iu iw ix jd iz ja by");
  	  //Element h=doc.getElementByClass("am an");
  	 Elements ed2=doc.getElementsByClass("ay az ba bb bc bd be bf bg bh bi bj bk bl bm");
  	  
  	  for(Element e:el)
  	  {
  		  System.out.println(e);
  	  }
  	  
  	  for(Element e1:ed2)
  	  {
  		//System.out.println(e1);
  		System.out.println(e1.text());
  		System.out.println(e1.attr("href"));
  	  }
    }
}

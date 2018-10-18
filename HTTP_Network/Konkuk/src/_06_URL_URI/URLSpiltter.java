package _06_URL_URI;

import java.net.MalformedURLException;
import java.net.URL;

// URL의 구성 요소 확인하기
public class URLSpiltter {
    public static void main(String args[]) {
        for (int i=0; i<args.length; i++) {
            try {
                URL u = new URL(args[i]);
                System.out.println("The URL is " + u);
                System.out.println("The scheme is " +u.getProtocol());
                System.out.println("The user info is " + u.getUserInfo());
                String host = u.getHost();
                if (host != null) {
                    int atSign = host.indexOf('@'); // @을 기준으로
                    if (atSign != -1) {
                        host = host.substring(atSign+1); // host는 뒷부분이다.
                    }
                    System.out.println("The host is + " + host);
                } else {
                    System.out.println("The host is null");
                }

                System.out.println("The port is " + u.getPort());
                System.out.println("The path is " + u.getPath());
                System.out.println("The ref is " + u.getRef());
                System.out.println("The query string is " + u.getQuery());
            } catch (MalformedURLException e) {
                System.out.println(args[i] + "is not a URL I understand");
            }
            System.out.println();
        }
    }
}

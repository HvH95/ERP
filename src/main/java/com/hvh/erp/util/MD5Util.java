package com.hvh.erp.util;
import java.security.MessageDigest;

public class MD5Util {
	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
	 /**
    * @param s  明文
    * @return 32位密文
    */
    public final static String MD5(String s) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       

        try {
            byte[] btInput = s.getBytes("utf-8");
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
	 * 
	 * 转换字节数组为16进制字串
	 * 
	 * @param b
	 *            字节数组 * @return 16进制字串
	 * */
	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		int d1 = 0;
		int d2 = 0;
		if (n < 0) {
			n = 256 + n;
			d1 = n / 16;
			d2 = n % 16;
		}
		return hexDigits[d1] + hexDigits[d2];
	}

	public static String MD5Encode(String origin) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString
					.getBytes()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return resultString;
	}

	public static String MD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname))
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes()));
			else
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes(charsetname)));
		} catch (Exception exception) {
		}
		return resultString;
	}
    public static void main(String[] args) {
        System.out.println(MD5Util.MD5("20121221"));
        System.out.println(MD5Util.MD5("account=SZDLSJ_JS&type=0&key=58cda3f0b8474e449fff90bdf320e47d").toLowerCase());
        String page = "%s/api.aspx?action=%s&v=%s&%s&sign=%s";
    	System.out.println(String.format(page,"1111","2222","2222","2222","2222"));
    	
    	/*1F69B3D54C2F95A014EA3CC131A34D5B
    	56563EDF23B9D717DC63981B8836FC60
    	1111/api.aspx?action=2222&v=2222&2222&sign=2222*/
    }
}

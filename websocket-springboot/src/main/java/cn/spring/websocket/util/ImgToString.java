package cn.spring.websocket.util;

import cn.hutool.core.codec.Base64;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author liuyuzhe@sinosoft.com.cn
 * @date 2020-8-17
 */
public class ImgToString {
    public static void main(String[] args) throws IOException {
        String path ="D:\\afc_pro_core\\upload\\123.jpg";
        String srcUrl = path; // "/mnt/sdcard/"; //路径
        // String fileName = PhotoName+".jpg"; //文件名
        FileInputStream fis = new FileInputStream(srcUrl);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[65536];
        int count = 0;
        while ((count = fis.read(buffer)) >= 0) {
            baos.write(buffer, 0, count);
        }
        String uploadBuffer = new String(Base64.encode(baos.toByteArray())); // 进行Base64编码
        System.out.println(uploadBuffer);
        fis.close();//这两行原来没有
        baos.flush();
    }

}


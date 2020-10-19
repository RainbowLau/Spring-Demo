package cn.pdf.pdfjsspringboot.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @date：Created in 2020/9/29 19:05
 */

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hi(){
        return "Hello World";
    }


    @GetMapping("Get")
    public void view(HttpServletResponse response) {
        /**
         * 关于文件的信息，实际中应该是根据某个字段去数据库查询得到的，比如根据该文件记录在DB中的id
         * 这里方便演示，我直接写死了文件的路径filePath
         */
        String filePath = "D://tmp/23.pdf"; // 本该根据ID去数据库查，这里是hard code
        // 设返回的contentType
        response.setContentType("application/pdf"); // 不同文件的MimeType参考后续链接
        // 读取路径下面的文件
        try {
            FileCopyUtils.copy(new FileInputStream(filePath), response.getOutputStream());
        } catch (IOException e) {
            //logger.error("View document exception, document id is [{}]", id, e);
            System.out.println("error");
        }
    }


    @GetMapping("GetPng")
    public void viewJPG(HttpServletResponse response) {
        /**
         * 关于文件的信息，实际中应该是根据某个字段去数据库查询得到的，比如根据该文件记录在DB中的id
         * 这里方便演示，我直接写死了文件的路径filePath
         */
        String filePath = "D://tmp/34.png"; // 本该根据ID去数据库查，这里是hard code
        // 设返回的contentType
        response.setContentType("image/png"); // 不同文件的MimeType参考后续链接
        // 读取路径下面的文件
        try {
            FileCopyUtils.copy(new FileInputStream(filePath), response.getOutputStream());
        } catch (IOException e) {
            //logger.error("View document exception, document id is [{}]", id, e);
            System.out.println("error");
        }
    }


    /*@RequestMapping("/GetFile")
    public void getFile(HttpServletRequest request , HttpServletResponse response) throws IOException {
        //读取路径下面的文件
        File file = new File(importPath);
        File picFile = null;
        for(File f : file.listFiles()){
            if(f.getName().contains("文件名")){
                //根据路径获取文件
                picFile = new picFile(f.getPath());
                //获取文件后缀名格式
                String ext = picFile.getName()substring(picFile.getName().indexOf("."));
                //判断图片格式,设置相应的输出文件格式
                if(ext.equals("jpg")){
                    response.setContentType("image/jpeg");
                }else if(ext.equals("JPG")){
                    response.setContentType("image/jpeg");
                }else if(ext.equals("png")){
                    response.setContentType("image/png");
                }else if(ext.equals("PNG")){
                    response.setContentType("image/png");
                }
            }
        }
        //读取指定路径下面的文件
        InputStream in = new FileInputStream(picFile);
        OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
        //创建存放文件内容的数组
        byte[] buff =new byte[1024];
        //所读取的内容使用n来接收
        int n;
        //当没有读取完时,继续读取,循环
        while((n=in.read(buff))!=-1){
            //将字节数组的数据全部写入到输出流中
            ouputStream.write(buff,0,n);
        }
        //强制将缓存区的数据进行输出
        outputStream.flush();
        //关流
        outputStream.close();
        in.close();
    }*/
}

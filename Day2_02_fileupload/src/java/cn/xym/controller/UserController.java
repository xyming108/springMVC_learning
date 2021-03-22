package cn.xym.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @user: Hasee
 * @date: 2021/3/22 16:10
 * @author: 1931559710@qq.com
 * ClassName: UserController
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 文件上传
     *
     * @return
     */
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request) throws Exception {
        System.out.println("文件上传...");
        //使用fileupload组件完成完成文件上传
        String path = request.getSession().getServletContext().getRealPath("/upload/");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload uploads = new ServletFileUpload(factory);
        //解析request
        List<FileItem> items = uploads.parseRequest(request);
        //遍历
        for (FileItem item : items) {
            //进行判断，当前item对象是否是上传文件项
            if (item.isFormField()) {
                //说明普通表单项
            } else {
                //说明上传文件项
                // 获取上传文件的名称
                String filename = item.getName();
                //把文件名称设置唯一值
                String replace = UUID.randomUUID().toString().replace("-", "");
                filename = replace + "_" + filename;
                //完成文件上传
                item.write(new File(path, filename));
                //删除临时文件
                item.delete();
            }
        }
        return "success";
    }
}

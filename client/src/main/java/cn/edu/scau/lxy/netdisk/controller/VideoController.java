package cn.edu.scau.lxy.netdisk.controller;

import cn.edu.scau.lxy.netdisk.entityVO.FileVO;
import cn.edu.scau.lxy.netdisk.feign.FileFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private FileFeign fileFeign;

    //视频，文件类型为3
    long type=3;

    @GetMapping("/findAll")
    @ResponseBody
    public FileVO findAll(@RequestParam("uid") long uid) {
        return new FileVO(0,"",100,fileFeign.findByType(uid,type));
    }

    @GetMapping("/findByNameAndType")
    @ResponseBody
    public FileVO findByNameAndType(@RequestParam("uid") long uid,@RequestParam("name") String name){
        return new FileVO(0,"",100,fileFeign.findByNameAndType(uid,type,name));
    }
}

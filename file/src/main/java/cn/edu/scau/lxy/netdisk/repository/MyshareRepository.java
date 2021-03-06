package cn.edu.scau.lxy.netdisk.repository;

import cn.edu.scau.lxy.netdisk.entity.File;
import cn.edu.scau.lxy.netdisk.entity.Myshare;

import java.util.List;

public interface MyshareRepository {
    public int addfile(Myshare myshare);
    public int addfolder(Myshare myshare);
    public int deleteById(long id);
    public List<Myshare> findAll(long uid);
    public Myshare findById(long id);
    public List<Myshare> findByLink(String link);
    public int updateTimesOfBrowse(long id,long timesOfBrowse);
    public int updateTimesOfSave(long id,long timesOfSave);
    public int updateTimesOfDownload(long id,long timesOfDownload);
    public int count();
}

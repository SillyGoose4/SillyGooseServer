package com.SillyGoose.service.Impl;

import com.SillyGoose.bean.Album;
import com.SillyGoose.dao.AlbumMapper;
import com.SillyGoose.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AlbumService")
public class AlbumServiceimpl implements AlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    public void insertAlbum(Album album) {
        albumMapper.insert(album);
    }
}

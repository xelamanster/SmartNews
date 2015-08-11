package com.smartnews.dao;

import com.smartnews.model.Folder;

import java.util.List;

/**
 * Created by fein on 8/11/2015.
 */
public interface FolderDao {
    public void save(Folder folder);

    public List<Folder> list();

    public void delete(Folder folder);

    public Folder findById(long id);

    public void update(Folder folder);
}

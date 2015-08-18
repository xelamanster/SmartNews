package com.smartnews.dao;

import com.smartnews.model.Folder;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fein on 8/11/2015.
 */
@Repository
public class FolderDaoImpl extends AbstractDao implements FolderDao {
    @Override
    public void save(Folder folder) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Folder> list() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Folder folder) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Folder findById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(Folder folder) {
        throw new UnsupportedOperationException();
    }
}

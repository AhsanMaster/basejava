package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class SortedArrayStorage extends AbstractArrayStorage{


    @Override
    public void clear() {

    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public void save(Resume r) {

    }

    @Override
    public Resume get(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }
    @Override
    public int indexOf(String uuid){
        Resume searchKey = new Resume();
        searchKey.setUuid(uuid);
        Arrays.binarySearch(storage,0,size, searchKey);
        return -1;
    }
}

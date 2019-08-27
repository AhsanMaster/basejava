package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage implements Storage{
    protected static final int STORAGE_LIMIT = 10000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size;

    public int size() {
        return size;
    }

    public int indexOf(Resume r){
        for (int i = 0; i <size ; i++) {
            if (storage[i].equals(r)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(String uuid){
        for (int i = 0; i <size ; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}

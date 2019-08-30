package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.exception.NotExistStorageException;
import com.github.ahsanmaster.basejava.exception.StorageException;
import com.github.ahsanmaster.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage implements Storage{
    protected static final int STORAGE_LIMIT = 10000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size;

    public void clear() {
        Arrays.fill(storage,0,size,null);
        size =0;
    }

    public int size() {
        return size;
    }

    public Resume[] getAll() {
        return Arrays.copyOfRange(storage,0,size);
    }


    public Resume get(String uuid) {
        int indexOfPosition = indexOf(uuid);
        if(indexOfPosition <0){

            throw new NotExistStorageException(uuid);
        }else{
            return storage[indexOfPosition];
        }
    }

    public void update(Resume r){
        int indexOfPosition = indexOf(r.getUuid());
        if (indexOfPosition<0) {
            throw new NotExistStorageException(r.getUuid());
        }else {
            storage[indexOfPosition] = r;
        }
    }

    public void save(Resume r) {
        int indexOf = indexOf(r.getUuid());
        if (indexOf <0) {
            if (size == STORAGE_LIMIT) {
                throw new StorageException("Storage overflow", r.getUuid());
            } else {
                insertElement(r,size);
                size++;
            }
        }
    }

    public void delete(String uuid) {
        int indexOfPosition = indexOf(uuid);
        if(indexOfPosition <0){
            throw new NotExistStorageException(uuid);
        }else{

            fillDeletedElement(indexOfPosition);
            storage[size - 1] = null;
            size--;
        }
    }

    protected abstract void fillDeletedElement(int indexOfPosition);

    protected abstract void insertElement(Resume r, int indexOf);
}

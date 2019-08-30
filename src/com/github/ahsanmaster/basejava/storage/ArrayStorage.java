package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {

    @Override
    protected void fillDeletedElement(int indexOfPosition) {
     storage[indexOfPosition] = storage[size - 1] ;
    }

    @Override
    public void insertElement(Resume r, int index){
        storage[index] = r;
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

package com.github.ahsanmaster.basejava.storage;

import com.github.ahsanmaster.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class SortedArrayStorage extends AbstractArrayStorage{

    @Override
    public int indexOf(String uuid){
        Resume searchKey = new Resume(uuid);
        Arrays.binarySearch(storage,0,size, searchKey);
        return -1;
    }

    @Override
    protected void fillDeletedElement(int indexOfPosition) {
        int numMoved = size - indexOfPosition -1;
        if (numMoved>0){
            System.arraycopy(storage,indexOfPosition+1,storage,indexOfPosition,numMoved);
        }

    }

    @Override
    protected void insertElement(Resume r, int indexOf) {
        if(indexOf<0){
            indexOf = -indexOf-1;
            System.arraycopy(storage,indexOf,storage,indexOf+1,size-indexOf);
            storage[indexOf] = r;
        }
    }
}

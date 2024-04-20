package com.interfaces;

public interface List <T> {

    public void Insert(T data);

    public void InsertAt(int index, T data);

    public void Remove(int index);

    public int Size();

    public void RemoveFirst();

    public void RemoveLast();

    public void Reverse();
}

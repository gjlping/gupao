package com.gjl.prototype;

import java.io.*;

/**
 * @author gjl
 * @create 2019-03-17 12:04
 **/
public class MyClone extends Phone implements Cloneable,Serializable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public MyClone deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            MyClone copy = (MyClone)ois.readObject();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public MyClone shallowClone(){
        MyClone myClone = new MyClone();
        myClone.setName(this.getName());
        myClone.setType(this.getType());
        myClone.setList(this.getList());
        return  myClone;
    }
}

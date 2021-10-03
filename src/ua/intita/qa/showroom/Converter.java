package ua.intita.qa.showroom;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Converter {
    public static boolean toXML(Object object){
        try(FileOutputStream out = new FileOutputStream("Car_Data.xml");
            BufferedOutputStream out1 = new BufferedOutputStream(out);
            XMLEncoder xmlEncoder = new XMLEncoder(out1);){
            xmlEncoder.writeObject(object);
            xmlEncoder.flush();
        } catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static Object fromXML(String xmlFileName){
        try (
            FileInputStream in = new FileInputStream(xmlFileName);
            BufferedInputStream in1 = new BufferedInputStream(in);
            XMLDecoder xmlDecoder = new XMLDecoder(in1);){

            return xmlDecoder.readObject();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}

package com.balram.demo.actions.SG.main;

import java.io.*;

public class S_Serial implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private transient int salary; // This field will not be serialized

    public S_Serial(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "S_Serial{name='" + name + "', salary=" + salary + '}';
    }

    public static void main(String[] args) {
        S_Serial emp = new S_Serial("John Doe", 50000);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("S_Serial.ser"))) {
            oos.writeObject(emp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("S_Serial.ser"))) {
            S_Serial deserializedEmp = (S_Serial) ois.readObject();
            System.out.println("Deserialized S_Serial: " + deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


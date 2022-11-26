package com.company;

import javax.management.MBeanConstructorInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TurtlePath
{
    public ArrayList<Integer> x = new ArrayList();
    public ArrayList<Integer> y = new ArrayList();
    public ArrayList<Integer> color = new ArrayList();
    public String mainPath = "test1.txt";
    public Path path = Paths.get(mainPath);
    public TurtlePath()
    {

    }
    public void save() throws IOException
    {
        String result = "";
        for(int a = 0; a < x.size(); a++)
        {
            result = result + x.get(a).toString() + "," + y.get(a).toString() + "," + color.get(a) + System.lineSeparator();
        }
        byte[] bytes = result.getBytes();
        Files.write(path, bytes);
    }

    public void addPoint(int _x, int _y, int _color)
    {
        x.add(_x);
        y.add(_y);
        color.add(_color);
    }

    public void load() throws IOException
    {
        ArrayList<String> result = new ArrayList<String>(Files.readAllLines(path));

        for (String i : result)
        {
            String part[] = i.split(",");

            int _x = Integer.parseInt(part[0]);
            int _y = Integer.parseInt(part[1]);
            int _color = Integer.parseInt(part[2]);

            x.add(_x);
            y.add(_y);
            color.add(_color);
        }
    }
}

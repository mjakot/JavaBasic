package com.company;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
public class Game
{
    public Turtle t;
    public Random r;
    public TurtlePath tp;
    public int x_limit = 200;
    public int y_limit = 200;
    public int number_of_iterations = 50;
    public ArrayList<Color> colors = new ArrayList();
    public Game()
    {
        colors.add(Color.RED);
        colors.add(Color.BLUE);
        colors.add(Color.BLACK);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        r = new Random();
        t = new Turtle();
        tp = new TurtlePath();
        t.speed(200);

    }

    public void generate()
    {
        for(int a = 0; a < number_of_iterations; a++)
        {
            int x = r.nextInt(2 * x_limit) - x_limit;
            int y = r.nextInt(2 * y_limit) - y_limit;
            int new_color = r.nextInt(colors.size());

            tp.addPoint(x, y, new_color);
        }
    }

    public void go()
    {
        for (int i = 0; i < number_of_iterations; i++)
        {
            t.penColor(colors.get(tp.color.get(i)));
            t.setPosition(tp.x.get(i), tp.y.get(i));
        }
    }

    public static void main(String[] args) throws IOException
    {
        Game g = new Game();

        g.generate();
        g.tp.save();
        g.tp.load();
        g.go();
    }

}

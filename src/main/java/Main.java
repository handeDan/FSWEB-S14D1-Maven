import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        //Circle ve cylinder
        //Circle:
        Circle circle = new Circle(3.75);
        System.out.println("circle radius: " + circle.getRadius());
        System.out.println("circle area: " + circle.getArea());

        //Cylinder:
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder radius: " + cylinder.getRadius());
        System.out.println("cylinder height: " + cylinder.getHeight());
        System.out.println("cylinder area: " + cylinder.getArea());
        System.out.println("cylinder volume: " + cylinder.getVolume());

        //********

        //Havuz
        //Rectangle için:
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle width: " + rectangle.getWidth());
        System.out.println("rectangle length: " + rectangle.getLength());
        System.out.println("rectangle area: " + rectangle.getArea());

        //Cuboid için:
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid width: " + cuboid.getWidth());
        System.out.println("cuboid length: " + cuboid.getLength());
        System.out.println("rectangle height: " + cuboid.getHeight());
        System.out.println("rectangle area: " + cuboid.getArea());
        System.out.println("rectangle volume: " + cuboid.getVolume());

        // HRManager oluşturuyoruz:
        HRManager hr = new HRManager(1, "Ali Veli", 10000);

        // Çalışanları oluşturuyoruz:
        JuniorDeveloper junior1 = new JuniorDeveloper(101, "Ahmet", 3000);
        JuniorDeveloper junior2 = new JuniorDeveloper(102, "Ayşe", 3200);
        JuniorDeveloper junior3 = new JuniorDeveloper(103, "Fatma", 3100); // Fazla!

        MidDeveloper mid1 = new MidDeveloper(201, "Hasan", 5000);
        MidDeveloper mid2 = new MidDeveloper(202, "Zeynep", 5500);

        SeniorDeveloper senior1 = new SeniorDeveloper(301, "Murat", 8000);
        SeniorDeveloper senior2 = new SeniorDeveloper(302, "Elif", 8500);
        SeniorDeveloper senior3 = new SeniorDeveloper(303, "Cem", 9000); // Fazla!

        // HRManager çalışanları ekliyor
        hr.addEmployee(junior1);
        hr.addEmployee(junior2);
        hr.addEmployee(junior3); // Dizi dolu hatası almalı

        hr.addEmployee(mid1);
        hr.addEmployee(mid2);

        hr.addEmployee(senior1);
        hr.addEmployee(senior2);
        hr.addEmployee(senior3); // Dizi dolu hatası almalı

        // Çalışanlar çalışıyor
        junior1.work();
        mid1.work();
        senior1.work();
    }
    }



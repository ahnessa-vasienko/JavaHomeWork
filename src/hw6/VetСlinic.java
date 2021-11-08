package hw6;

import hw5.Book;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Locale;

public class VetСlinic {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Animal animal = new Cat("Food", "Location", "Мурзик ", "Черный");
        Animal animal2 = new Dog("Food", "Location", "Барсик ", "Серый");
        Animal animal3 = new Horse("Food", "Location", "Молния ", "Черный");
        animal.sllep();
        animal.makeNose();
        animal.Eat();
        animal2.makeNose();
        animal2.Eat();
        animal3.makeNose();
        animal3.Eat();


        System.out.println("eg 1 3:" + animal.equals(animal3));
        System.out.println("eg 1 2:" + animal.equals(animal2));
        System.out.println("hashCode:" + animal.hashCode());
        System.out.println("hashCode2:" + animal2.hashCode());
        System.out.println("hashCode3:" + animal3.hashCode());

        System.out.println(animal.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());

        Veterinarian veterinar = new Veterinarian();
        Class clazz = veterinar.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));

        Class veterinarClazz = Class.forName("hw6.Veterinarian");
        Class veterinarianClass = Veterinarian.class;
        Constructor constr = veterinarClazz.getConstructor(new Class[]{});
        Object obj = constr.newInstance();

        if (obj instanceof Veterinarian) {
            ((Veterinarian) obj).treatment(animal);

        }
    }
}

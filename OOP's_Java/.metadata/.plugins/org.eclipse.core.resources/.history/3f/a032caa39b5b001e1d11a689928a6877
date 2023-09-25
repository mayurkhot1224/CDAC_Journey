package tester;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class TestReflection {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name of class or interface to apply the inspection");
			//load the class in mem
			Class<?> cls=Class.forName(sc.next());
			System.out.println("loaded type name"+cls.getName());
			System.out.println("is it a i/f ? "+cls.isInterface());
			System.out.println("name of super type "+cls.getSuperclass());
			System.out.println("names of the i/fs "+Arrays.toString(cls.getInterfaces()));
			int  modifiers=cls.getModifiers();
			System.out.println("is it abstract"+Modifier.isAbstract(modifiers));
			System.out.println("is it final "+Modifier.isFinal(modifiers));
			System.out.println("Fields : "+Arrays.toString(cls.getFields()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

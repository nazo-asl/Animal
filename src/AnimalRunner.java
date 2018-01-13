import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

public class AnimalRunner {

	public static void main(String[] args) {
		try {
			findAnimals();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Collects from the working directory all files that extend Animal
	 * 
	 * @return a list holding all classes that extend Animal
	 * @throws ClassNotFoundException
	 *             if the requested class is not found
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Class<? extends Animal>> findAnimals()
			throws ClassNotFoundException {
		List<Class<? extends Animal>> animals = new ArrayList<Class<? extends Animal>>();
		File[] classes = findClassFilesInPackage();
		for (File f : classes) {
			System.out.println(f.getName());
			String nameWithExtension = f.getName();
			int idx = nameWithExtension.lastIndexOf(".class");
			String searchString = nameWithExtension.substring(0,
					idx);
			Class classObj = Class.forName(searchString);
			System.out.println("Testing " + searchString);
			if (Animal.class.isAssignableFrom(classObj)
					&& !Modifier
							.isAbstract(classObj.getModifiers())) {
				animals.add(classObj);
			}
		}
		System.out.println(
				"GameTracker detected the following animals: "
						+ animals);
		return animals;

	}

	/**
	 * Looks inside the current working directory and collects all file names having
	 * the extension .class
	 * 
	 * @return an array of files
	 */
	private static File[] findClassFilesInPackage() {
		File directory = new File(
				AnimalRunner.class.getResource("/").getFile());
		File[] files = directory.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith("class");
			}
		});
		for (File f : files)
			System.out.println(f.getName());
		return files;
	}

}

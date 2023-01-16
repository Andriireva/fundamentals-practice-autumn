package com.fundemtals.practice.files;

import com.fundemtals.practice.domain.Animal;
import com.fundemtals.practice.domain.Dog;
import com.fundemtals.practice.domain.Elephant;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ReadWriter {

    public List<Animal> dummyReading() {
        List<Animal> animals = new ArrayList<>();

        // CSV data
//        File.separator; it return \ in case unix Machine or / in case Windows Machine
        String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "testFile.txt";
        try {
            // BufferedReader is temp class that reads data by chunks
            BufferedReader reader = new BufferedReader(new FileReader(filePath)); // Open stream to file
//            String line = reader.readLine(); // it read a single line in this file

            // It is a legacy way
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }

            // java8 + way
            reader.lines()
                    .forEach( l -> System.out.println(l) );

//            String notExistLine = reader.readLine();

//            System.out.println(firstLine);
//            System.out.println(notExistLine);

            reader.close(); // close is MUST operation

            //reader.readLine();// After close it NOT possible to read data from file anymore

        } catch (IOException e) { // IOException is root exception for input/output (file) related actions
            throw new RuntimeException(e);
        }

//        File file = new File(filePath);


        return animals;
    }

    public List<Animal> readData() {
        String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "zoo.txt";
        List<Animal> animals = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            animals = reader.lines()
                    .filter(line -> line != null && !line.isBlank()) // ignore empty line
                    .map(line -> convertFromString(line))
                    .filter(animal -> animal != null) // exclude every animal that was not able to converted
                    .collect(Collectors.toList());

            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return animals;
    }

    public void writeToFile(Collection<Animal> animals) {
        String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "outPutData.txt";
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            String stringAnimals = animals.stream()
                    .map(animal -> convertFromAnimal(animal))
                    .collect(Collectors.joining("\n"));// join all values with new line chars

            outputStream.write(stringAnimals.getBytes()); // here we write converted string to byte[]
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String convertFromAnimal(Animal animal) {
        String separator = ",";
        String type = animal.getClass().getSimpleName().toLowerCase(); // it returns an actual class name (lower case)
        return type + separator + animal.getName() + separator + animal.getAge();
    }

    private Animal convertFromString(String line) {
//        System.out.println("Line: " + line);

        // cat,Snow,10 line example
        // dog,Rex,7
        String[] values = line.split(",");
        String animalType = values[0];
        String name = values[1];
        Integer age = Integer.valueOf(values[2]);

        Animal convertedAnimal = null;

        switch (animalType) {
            case "dog" :
                convertedAnimal = new Dog(name, age);
                break;
            case "elephant" :
                int trunkLength = Integer.valueOf(values[3]);
                convertedAnimal = new Elephant(name, age, null, null, null, trunkLength);
                break;
            case "cat" :
                break;
        }
        return convertedAnimal;
    }
}

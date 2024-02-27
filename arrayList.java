import java.util.ArrayList;

class arrayList{
    public static void main(String[]args){
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Tiger");
        animal.add("Lion");
        animal.add("Jaguar");
        
        System.out.println(animal);
        animal.clear();
        
        if (animal.isEmpty()){
            System.out.println("Array is empty");
        }
        else{
            System.out.println(animal);
        }
        animal.add("Tiger");
        animal.add("Lion");
        animal.add("Jaguar");
        
        animal.remove(2);
        System.out.println(animal);
    }
}

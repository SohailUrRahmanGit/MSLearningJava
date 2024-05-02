import javax.swing.plaf.synth.SynthTextAreaUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World Two");
        Dog dogJack = new Dog();
        dogJack.setName("Rango");
        dogJack.setColor("Black");
        dogJack.setHeight(10.0);

        System.out.println(dogJack.getColor());
    }
}
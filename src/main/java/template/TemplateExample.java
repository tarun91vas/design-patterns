package template;

public abstract class TemplateExample {

    // This class control the algorithm
    public final void templateMethod() {
        operation1();
        operation2();
        concreteOperation();
        hook();
    }

    // Subclass required to implement this
    public abstract void operation1();

    // Subclass required to implement this
    public abstract void operation2();

    // Remains same across classes
    public final void concreteOperation() {
        System.out.println("This function has only one job throughout");
    }

    //optional function for subclass
    public void hook(){}
}

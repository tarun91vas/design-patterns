package command;

public class SimpleRemoteControl {
    Command slot;

    SimpleRemoteControl(){}

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // Invoker: to which command is passed
        Light light = new Light(); // receiver of action
        LightOnCommand lightOnCommand = new LightOnCommand(light); // command to execute

        remote.setCommand(lightOnCommand);
        remote.buttonPressed();
    }
}

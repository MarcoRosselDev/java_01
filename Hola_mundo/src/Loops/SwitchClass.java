package Loops;

public class SwitchClass {
    public static void main(String[] args) {
        System.out.println("Hola mundirijillo");

        String action = "agregar";
        // lo mismo que javascript !
        switch (action) {
            case "eliminar":
                // delete something
                break;
            case "agregar":
                // add something
                break;
            case "actualizar":
                // update something
                break;
            default:
                // action for default
        }
    }
}

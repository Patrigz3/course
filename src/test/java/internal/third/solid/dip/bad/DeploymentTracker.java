package internal.third.solid.dip.bad;

public class DeploymentTracker {
    //private final Email email;
    //private final Phone
}



/*
BAD: Lo correcto seria tener un metodo send que pueda utilizar tanto email como phone. Encapsular el if/else en una interfaz: notifier con un metodo send dentro
 */
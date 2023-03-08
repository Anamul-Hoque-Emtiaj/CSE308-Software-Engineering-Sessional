package Online;

public class Director {
    void build(BurgerBuilder builder){
        builder.buildBun();
        builder.buildPatty();
    }
    void addPatty(BurgerBuilder builder){
        builder.buildPatty();
    }
    void addCheese(BurgerBuilder builder){
        builder.buildCheese();
    }
    void addBBQSauce(BurgerBuilder builder){
        builder.buildSauce();
    }
    void addSalad(BurgerBuilder builder){
        builder.buildSalad();
    }
}

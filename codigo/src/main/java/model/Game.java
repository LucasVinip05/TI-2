package model;

public class Game {
    
    private
    String name;
    float price;
    String review;

    public

    Game(String name, float price, String review){
        SetName(name);
        SetPrice(price);
        SetReview(review);

    }

    Game(){
        SetName("");
        SetPrice(0);
        SetReview("");
        
    }

    void SetName(String name){
        this.name = name;
    }

    void SetReview(String review){
        this.review = review;
    }

    void SetPrice(float price){
        this.price = price;
    }


    String GetName(){
        return this.name;
    }

    String GetReview(){
        return this.review;
    }

    float GetPrice(){
        return this.price;
    }

}

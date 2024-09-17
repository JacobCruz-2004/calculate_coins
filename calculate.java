public class calculate {

    public calculate(){}
    public void makeChange(int change){
        //Quantity of each coin
        int toonies;
        int loonies;
        int quarters;   
        int dimes;
        int nickels;
        int pennies;

        int originalChange = change; //original change variable is added because changevariable will be modified

        if(change < 1){System.out.println("Cannot make change");}
        if(change > 0){System.out.println(originalChange + " cents would require: ");}

        toonies = Math.round(change/200);
        change -= (toonies * 200);
        if(toonies >0){System.out.println(toonies + " toonies");}

        loonies = Math.round(change/100);
        change -= (loonies * 100);
        if(loonies > 0){System.out.println(loonies + " loonies");}

        quarters = Math.round(change/25);
        change -= (quarters * 25);
        if(quarters > 0){System.out.println(quarters + " quarters");}

        dimes = Math.round(change/10);
        change -= (dimes * 10);
        if(dimes > 0){System.out.println(dimes + " dimes");}

        nickels = Math.round(change/5);
        change -= (nickels*5);
        if(nickels > 0){System.out.println(nickels + " nickels");}

        pennies = change;
        if(pennies > 0){System.out.println(pennies + " pennies");}

        System.out.println("_________________________________");
    }
}

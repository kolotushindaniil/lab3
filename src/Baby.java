public class Baby extends AllHeroes{
    public void stoodnotknowingwherehecouldget(){
        System.out.printf("%sстоял, не зная, где он сможет достать \n", getName());
    }
    public void emptypiggybank(){
        System.out.printf("%sпридется опустошить копилку \n", getName());
    }
    public void rantothekitchenforaknife(){
        System.out.printf("%sсбегал на кухню за ножом \n", getName());
    }
    public void startedtakingcoinsoutofthepiggybank(){
        System.out.printf("%sпридется опустошить копилку \n", getName());
    }
    public void rushedtothenextshop(){
        System.out.printf("%sпомчался в соседнюю лавочку \n", getName());
    }
    public void gaveittotheseller(){
        System.out.printf("%sотдал продавцу \n", getName());
    }
    public void rememberedthatIwassaving(){
        System.out.printf("%sвспомнил, что копил \n", getName());
    }
    public void sighedheavily(){
        System.out.printf("%sтяжело вздохнул \n", getName());
    }
    public void cantaffordtheluxuryofhavingadog(){
        System.out.printf("%sне может позволить себе роскошь иметь собаку \n", getName());
    }
    public void sawthatthewholefamilywasinthediningroom(){
        System.out.printf("%s увидел, что в столовой вся семья \n", getName());
    }
    public void wantedtoinviteyoutomyroom(){
        System.out.printf("%s хотел пригласить себе в комнату \n", getName());
    }
    public void thoughtwell(){
        System.out.printf("%s хорошо подумал \n", getName());
    }
    public void decideditwasnworthdoingthis(){
        System.out.printf("%s решил, что этого делать не стоит \n", getName());
    }
    public void spendmoney(int amount) throws Exceptions.Notenoughmoneyexeption{
        if(this.money>=amount){
            System.out.println("малыш на все деньги купил сладостей");
        }else {
            throw new Exceptions.Notenoughmoneyexeption("недостаточно денег");
        }
    }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.money=0;
        this.name = name;
    }
    private int money;


}

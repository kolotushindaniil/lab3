public class FamilyMember {
    private Mother mother;
    private Father father;
    private Bosse bosse;
    private Betan betan;
    public FamilyMember(Mother mother,Father father,Bosse bosse,Betan betan){
        this.mother=mother;
        this.father=father;
        this.bosse=bosse;
        this.betan=betan;
    }
    public void drinkcoffe(){
        System.out.println("мама,папа,боссе,бетан пили послеобеденный кофе");
    }
}

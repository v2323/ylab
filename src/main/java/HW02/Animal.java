package HW02;

public abstract class Animal {
    protected String className;
    protected String voice;
    protected boolean isSleep;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    public void makeSound(){
        if(this.isSleep){
            System.out.printf("The %s is sleep \n",this.className);
        } else {
            System.out.printf("The %s say: %s \n",this.className,this.voice);
        }
    }

    public void feedAnimal(){
        if(this.isSleep) {
            this.setSleep(false);
            System.out.printf("The %s is feeded \n", this.className);
        } else {
            System.out.printf("The %s don't want to eat \n", this.className);
        }
    }
}

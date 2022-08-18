package com.polymorphism1;

public class Talk {
	public void talk(Parent styleoftalk ){
		System.out.println("polite,silent");
		
	}
    public void talk(Friend styleoftalk){
	System.out.println("jolly ,open");
		
	}
    public void talk(Lover styleoftalk){
	System.out.println("love,romantic");
	
}
    public void talk(Boss styleoftalk){
    	System.out.println("Restpect");
	
	
}
    public static void main(String[] args) {
		//class object
    	Talk talk=new Talk();
    	//method object
    	Parent parent=new Parent();
    	talk.talk(parent);
    	Friend friend=new Friend();
    	talk.talk(friend);
    	Lover lover=new Lover();
    	talk.talk(lover);
    	Boss boss=new Boss();
    	talk.talk(boss);
    	
	}

}

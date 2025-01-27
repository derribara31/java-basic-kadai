package kadai_018;

public abstract class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "東京都中野区〇×";
	
	public void commonintroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		
	}
	abstract public void eachIntroduce();
	

	public void execIntroduce() {
		this.commonintroduce();
		this.eachIntroduce();
		System.out.println();
	}
	

}

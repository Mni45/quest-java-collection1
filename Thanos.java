import java.util.*;


public class Thanos {

    public static void main(String[] args) {

	ArrayList<Hero> heroes= new ArrayList<>();

	Hero heroOne = new Hero ("Black Widow",34);	
	Hero heroTwo = new Hero ("Captain America",100);
	Hero heroThree = new Hero ("Vision",3);
	Hero heroFour = new Hero ("Iron Man", 48);
	Hero heroFive = new Hero ("Scarlett Witch",29);
	Hero heroSix = new Hero ("Thor",1500);
	Hero heroSeven = new Hero ("Spider-Man",18);
	Hero heroEight = new Hero ("Hulk",49);
	Hero heroNine = new Hero ("Doctor Strange",42);
	
	heroes.add(heroOne);
	heroes.add(heroTwo);
	heroes.add(heroThree);
	heroes.add(heroFour);
	heroes.add(heroFive);
	heroes.add(heroSix);
	heroes.add(heroSeven);
	heroes.add(heroEight);
	heroes.add(heroNine);

	heroSix.setAge(1501);
	

	Collections.shuffle(heroes);
	
	List<Hero> heroes2 = heroes.subList(0,heroes.size()/2);

	for (int i=0 ; i<heroes2.size() ; i++) {
		System.out.println(heroes2.get(i).getName());
	}

    }
}

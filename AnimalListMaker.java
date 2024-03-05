package SeeAndSay;

import SeeAndSay.AnimalImpl.dkatz3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author David A. Katz <dkatz3@ccbcmd.edu>
 */
public class AnimalListMaker {

	/* Add all the animal classes */
	private void addAllAnimals() {
		/**  Only make modifications in this method below this point */

		animalList.add(new dkatz3());

		// animalList.add(new SampleAnimal());

		/* EN1 Section */

		//animalList.add(new bo1145485());
		//animalList.add(new brow90400());
		//animalList.add(new ca1165663());
		//animalList.add(new ch1106737());
		//animalList.add(new de1157389());
		//animalList.add(new ga1073076());
		//animalList.add(new ga1178074());
		//animalList.add(new is1145345());
		//animalList.add(new jos129715());
		//animalList.add(new ko1168371());
		//animalList.add(new lu1127103());
		//animalList.add(new mi1156959());
		//animalList.add(new mu1022394());
		//animalList.add(new pa1157971());
		//animalList.add(new sa1153877());
		//animalList.add(new sh1003266());
		//animalList.add(new shf913514());
		//animalList.add(new th1151057());
		//animalList.add(new til864760());
		//animalList.add(new ur1124787());
		//animalList.add(new vi1085322());



	}

	/* Simple Constructor */
	public AnimalListMaker() {
		super();  // Not strictly necessary as implied if omitted.
		addAllAnimals();
	}

	/* gets an unmodifiable collection of the animals that have been added to the list */
	public List<Talker> getAnimalList() {
		return Collections.unmodifiableList(this.animalList);
	}

	/* The Animal List */
	private List<Talker> animalList = new LinkedList<Talker>();

}
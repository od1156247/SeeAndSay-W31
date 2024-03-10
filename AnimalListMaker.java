package SeeAndSay;

import SeeAndSay.AnimalImpl.*;

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

		/* W31 Section */

		animalList.add(new ag1164326());
		animalList.add(new al1143662());
		//animalList.add(new di1095415());
		//animalList.add(new fo1168713());
		animalList.add(new go1109931());
		//animalList.add(new ha1117748());
		animalList.add(new ham670796());
		//animalList.add(new he1129401());
		animalList.add(new kor802692());
		//animalList.add(new ma1086322());
		animalList.add(new man833866());
		animalList.add(new mcc807348());
		//animalList.add(new mkarr());
		//animalList.add(new mo1172716());
		//animalList.add(new od1156247());
		//animalList.add(new om1111440());
		animalList.add(new ow1131999());
		animalList.add(new ra1085113());
		animalList.add(new ra1161720());
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

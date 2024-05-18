package AimsProject.hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import AimsProject.hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println(media.getTitle() + " was added to the cart");
		} else {
			System.out.println("The cart is full.");
		}
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.remove(media)) {
			System.out.println(media.getTitle() + " was removed from the cart");
		} else {
			System.out.println("The item was not found in the cart.");
		}
	}

	public float totalCost() {
		float total = 0;
		for (Media media : itemsOrdered) {
			total += media.getCost();
		}
		return total;
	}
}
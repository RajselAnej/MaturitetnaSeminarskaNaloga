package application;

public class Card {

		private final Suit suit;
		private final Value value;
		
		private boolean revealed = false, selected = false;
		
		Card(Suit suit, Value value) {
			this.suit = suit;
			this.value = value;
		}
		
		Suit getSuit() {
			return suit;
		}
		
		Value getValue() {
			return value;
		}

		CardColor getColor() {
			if (suit == Suit.HEART || suit == Suit.DIAMOND) {
				return CardColor.RED;
			} else {
				return CardColor.BLACK;
			}
		}

		void reveal() {
			revealed = true;
		}
		
		boolean isRevealed() {
			return revealed;
		}

		void toggleSelected() {
			selected = !selected;
		}

		boolean isSelected() {
			return selected;
		}

		String getName() {
			return value.toString().toLowerCase() + "of" + suit.toString().toLowerCase() + "s";
		}
	}

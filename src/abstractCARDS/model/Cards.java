package abstractCARDS.model;

public abstract class Cards
{

		public int amount;
		public String cardName;
		public boolean isItAGoodDeck;
		
		
		public int getAmount()
		{
			return amount;
		}
		public String getCardName()
		{
			return cardName;
		}
		public boolean isItAGoodDeck()
		{
			return isItAGoodDeck;
		}
		public void setAmount(int amount)
		{
			this.amount = amount;
		}
		public void setCardName(String cardName)
		{
			this.cardName = cardName;
		}
		public void setItAGoodDeck(boolean isItAGoodDeck)
		{
			this.isItAGoodDeck = isItAGoodDeck;
		}
		
}

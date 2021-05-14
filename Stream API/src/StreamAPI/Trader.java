package StreamAPI;

public class Trader {
        String TraderName;
        String TradeCity;
		public Trader(String traderName, String tradeCity) {
			
			this.TraderName = traderName;
			this.TradeCity = tradeCity;
		}
		public String getTraderName() {
			return TraderName;
		}
		public void setTraderName(String traderName) {
			TraderName = traderName;
		}
		public String getTradeCity() {
			return TradeCity;
		}
		public void setTradeCity(String tradeCity) {
			TradeCity = tradeCity;
		}
		@Override
		public String toString() {
			return "Trader [TraderName=" + TraderName + ", TradeCity=" + TradeCity + "]";
		}
        
        
}

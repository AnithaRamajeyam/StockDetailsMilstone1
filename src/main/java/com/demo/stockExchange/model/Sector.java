package com.demo.stockExchange.model;

public class Sector {

		private int sector_id;
		private String sector_name;
		private String brief;
		public Sector(int sector_id, String sector_name, String brief) {
			super();
			this.sector_id = sector_id;
			this.sector_name = sector_name;
			this.brief = brief;
		}
		public int getSector_id() {
			return sector_id;
		}
		public void setSector_id(int sector_id) {
			this.sector_id = sector_id;
		}
		public String getSector_name() {
			return sector_name;
		}
		public void setSector_name(String sector_name) {
			this.sector_name = sector_name;
		}
		public String getBrief() {
			return brief;
		}
		public void setBrief(String brief) {
			this.brief = brief;
		}
		
}

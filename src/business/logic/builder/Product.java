package business.logic.builder;

import business.cleaning.enums.Collector;
import business.cleaning.enums.Event;
import business.cleaning.enums.SalesChannel;
import business.cleaning.enums.Templete;

//It should be the generic information about product 
// It can be poliza object to use that
public class Product {

	private Collector collector;
	private Event event;
	private SalesChannel salesChannel;
	private Templete templates;

	public Product(Collector collector, Event event, SalesChannel salesChannel, Templete templates) {
		super();
		this.collector = collector;
		this.event = event;
		this.salesChannel = salesChannel;
		this.templates = templates;
	}

	public Product() {

	}

	public Collector getCollector() {
		return collector;
	}

	public void setCollector(Collector collector) {
		this.collector = collector;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public SalesChannel getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(SalesChannel salesChannel) {
		this.salesChannel = salesChannel;
	}

	public Templete getTemplates() {
		return templates;
	}

	public void setTemplates(Templete templates) {
		this.templates = templates;
	}

}

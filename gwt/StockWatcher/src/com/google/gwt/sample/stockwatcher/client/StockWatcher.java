package com.google.gwt.sample.stockwatcher.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class StockWatcher implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private TextBox symbolTextBox = new TextBox();
	private Button addStockButton = new Button("Add");
	private Label lastUpdateLabel = new Label();
	private List<String> stocks = new ArrayList<String>();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// create table for stock data.
		stocksTable.setText(0, 0, "Symbol");
		stocksTable.setText(0, 1, "Price");
		stocksTable.setText(0, 2, "Changes");
		stocksTable.setText(0, 3, "Remove");
		// assemble add stock panel.
		addPanel.add(symbolTextBox);
		addPanel.add(addStockButton);
		// assemble Main panel.
		mainPanel.add(stocksTable);
		mainPanel.add(addPanel);

		// associate the main-panel with the html host page.
		RootPanel.get("stockList").add(mainPanel);

		// move the cursor focus to the input box.
		symbolTextBox.setFocus(true);

		// Listen for click envents on the add button.
		addStockButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				addStock();
			}
		});

		// Listen for keyboard events in the text box.
		symbolTextBox.addKeyPressHandler(new KeyPressHandler() {
			@Override
			public void onKeyPress(KeyPressEvent event) {
				if (event.getCharCode() == KeyCodes.KEY_ENTER) {
					addStock();
				}
			}
		});

		Timer refreshTimer = new Timer() {

			@Override
			public void run() {
				refreshWatchList();
			}

		};
		refreshTimer.scheduleRepeating(5000);

	}

	/*
	 * add stock to flex table.
	 */
	private void addStock() {
		final String symbol = symbolTextBox.getText().toUpperCase().trim();
		symbolTextBox.setFocus(true);
		// Stock code must be between 1 and 10 chars that are numbers, letters,
		// or dots.
		if (!symbol.matches("^[0-9A-Z\\.]{1,10}$")) {
			Window.alert("'" + symbol + "' is not a valid symbol.");
			symbolTextBox.selectAll();
			return;
		}
		symbolTextBox.setText("");

		// Don't add the stock if it's already in the table.
		if (stocks.contains(symbol))
			return;

		// add stock to the flex table
		int row = stocksTable.getRowCount();
		stocks.add(symbol);
		stocksTable.setText(row, 0, symbol);

		Button removeStockButton = new Button("x");
		removeStockButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				int removedIndex = stocks.indexOf(symbol);
				stocks.remove(removedIndex);
				stocksTable.removeRow(removedIndex + 1);
			}
		});
		stocksTable.setWidget(row, 3, removeStockButton);

		refreshWatchList();
	}

	private void refreshWatchList() {
		final double MAX_PRICE = 100.0; // $100.00
		final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

		StockPrice[] prices = new StockPrice[stocks.size()];
		for (int i = 0; i < stocks.size(); i++) {
			double price = Random.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE
					* (Random.nextDouble() * 2.0 - 1.0);

			prices[i] = new StockPrice(stocks.get(i), price, change);
		}

		updateTable(prices);
	}

	/**
	 * Update the Price and Change fields all the rows in the stock table.
	 * 
	 * @param prices
	 *            Stock data for all rows.
	 */
	private void updateTable(StockPrice[] prices) {
		for (int i = 0; i < prices.length; i++) {
			updateTable(prices[i]);
		}
		// Display timestamp showing last refresh.
		lastUpdateLabel.setText("Last update : "
				+ DateTimeFormat.getMediumDateTimeFormat().format(new Date()));
	}

	/**
	 * Update a single row in the stock table.
	 * 
	 * @param price
	 *            Stock data for a single row.
	 */
	private void updateTable(StockPrice price) {
		// Make sure the stock is still in the stock table.
		if (!stocks.contains(price.getSymbol())) {
			return;
		}

		int row = stocks.indexOf(price.getSymbol()) + 1;

		// Format the data in the Price and Change fields.
		String priceText = NumberFormat.getFormat("#,##0.00").format(
				price.getPrice());
		NumberFormat changeFormat = NumberFormat
				.getFormat("+#,##0.00;-#,##0.00");
		String changeText = changeFormat.format(price.getChange());
		String changePercentText = changeFormat
				.format(price.getChangePercent());

		// Populate the Price and Change fields with new data.
		stocksTable.setText(row, 1, priceText);
		stocksTable.setText(row, 2, changeText + " (" + changePercentText
				+ "%)");
	}
}

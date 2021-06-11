package com.sun;

public class Card {

	public static void main(String args[]) {
		String[] suit = {"Clubs","Spades", "Hearts", "Diamonds"};
		String[] rank = {"2","3","4","5","6","7","8","9","Jack","Queen","King","Ace"};
		String [] deck = new String[52];
		
		for(int i =0; i<rank.length; i++) {
			deck [i] = rank[i%13]+suit[i/13];
			System.out.println(deck[i]);
			}
		
		
		for(int i = 0; i<deck.length; i++) {
			int index = (int)(Math.random()*deck.length);
			
			String temp = deck[i];
			deck[i] = deck[index];
			deck[index]= temp;
			
		}
	
		for(String u: deck) {
			System.out.println(u);
		}
	}
}

	

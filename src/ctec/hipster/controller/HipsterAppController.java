package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;

public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String[] myAlbums;

	public HipsterAppController()
	{
		selfHipster = new Hipster("Cody", 38);
		buildAlbumArray();

	}

	public void start()
	{

	}

	private void buildAlbumArray()
	{
		myAlbums = new String[4];
		myAlbums[0] = "Iron and Wine: some hipsterness";
		myAlbums[1] = "Modest Mouse: used to be hipster";
		myAlbums[2] = "Blink 182 - Not hipster";
		myAlbums[3] = "Britney Spears: Could not be hipster";
		selfHipster.setHipsterAlbums(myAlbums);

		// hipster
		// only on one line
		String[] otherAlbums = { "stuff", "other", "way for", "hipster array" };

		// ultra hipster
		String[] weirdAlbums;

		weirdAlbums = new String[] { "weird", "sad", "sda", "adsafsad" };
	}

	public Hipster getSelfHipster()
	{
		return selfHipster;

	}
}
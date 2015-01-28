package de.getsetsociety.gw2readr.v1.wvw.matches.interfaces;

import java.util.List;

public interface IWvWMatches {

	public abstract List<IWvWMatch> getWvwMatches();

	public abstract void setWvwMatches(List<IWvWMatch> wvwMatches);

}
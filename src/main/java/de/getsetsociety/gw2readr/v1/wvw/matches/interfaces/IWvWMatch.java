package de.getsetsociety.gw2readr.v1.wvw.matches.interfaces;

public interface IWvWMatch {

	public abstract String getWvwMatchId();

	public abstract void setWvwMatchId(String wvwMatchId);

	public abstract Integer getRedWorldId();

	public abstract void setRedWorldId(Integer redWorldId);

	public abstract Integer getBlueWorldId();

	public abstract void setBlueWorldId(Integer blueWorldId);

	public abstract Integer getGreenWorldId();

	public abstract void setGreenWorldId(Integer greenWorldId);

	public abstract String getStartTime();

	public abstract void setStartTime(String startTime);

	public abstract String getEndTime();

	public abstract void setEndTime(String endTime);

}
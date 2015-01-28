package de.getsetsociety.gw2readr.v1.wvw.matches.entities;

import de.getsetsociety.gw2readr.v1.wvw.matches.interfaces.IWvWMatch;


public class WvWMatch implements IWvWMatch {

	private String wvwMatchId;
	private Integer redWorldId;
	private Integer blueWorldId;
	private Integer greenWorldId;
	private String startTime;
	private String endTime;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#getWvwMatchId()
	 */
	@Override
	public String getWvwMatchId() {
		return wvwMatchId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#setWvwMatchId(java.lang.String)
	 */
	@Override
	public void setWvwMatchId(String wvwMatchId) {
		this.wvwMatchId = wvwMatchId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#getRedWorldId()
	 */
	@Override
	public Integer getRedWorldId() {
		return redWorldId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#setRedWorldId(java.lang.Integer)
	 */
	@Override
	public void setRedWorldId(Integer redWorldId) {
		this.redWorldId = redWorldId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#getBlueWorldId()
	 */
	@Override
	public Integer getBlueWorldId() {
		return blueWorldId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#setBlueWorldId(java.lang.Integer)
	 */
	@Override
	public void setBlueWorldId(Integer blueWorldId) {
		this.blueWorldId = blueWorldId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#getGreenWorldId()
	 */
	@Override
	public Integer getGreenWorldId() {
		return greenWorldId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#setGreenWorldId(java.lang.Integer)
	 */
	@Override
	public void setGreenWorldId(Integer greenWorldId) {
		this.greenWorldId = greenWorldId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#getStartTime()
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#setStartTime(java.lang.String)
	 */
	@Override
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#getEndTime()
	 */
	@Override
	public String getEndTime() {
		return endTime;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.wvw.matches.entities.IWvWMatch#setEndTime(java.lang.String)
	 */
	@Override
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}

package de.westnordost.osmapi.capabilities;

import de.westnordost.osmapi.OsmConnection;

/** Get server capabilities */
public class CapabilitiesDao
{
	private final OsmConnection osm;

	public CapabilitiesDao(OsmConnection osm)
	{
		this.osm = osm;
	}

	/** @return the capabilities and limits of this server. This usually does not change very
	 *          often for a given server. */
	public Capabilities get()
	{
		return osm.makeRequest("capabilities", new CapabilitiesParser());
	}
}

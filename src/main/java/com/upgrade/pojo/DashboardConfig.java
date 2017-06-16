package com.upgrade.pojo;

import java.util.List;

/**
 * Created by ssharma on 6/15/17.
 */
public class DashboardConfig {
	
	private List<Configs> configs;

    private String count;

    public List<Configs> getConfigs ()
    {
        return configs;
    }

    public void setConfigs (List<Configs> configs)
    {
        this.configs = configs;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

}

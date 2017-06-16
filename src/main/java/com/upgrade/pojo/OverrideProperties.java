package com.upgrade.pojo;


/**
 * Created by ssharma on 6/15/17.
 */

public class OverrideProperties
{
    private String os;

    private String is_ha_test;

    private String ambari_version;

    private String upgrade_to;

    private String jdk_version;

    private String motd_enable;

    private String ambari_agent_user;

    private String mr_framework;

    private String customized_services_users;

    private String security;

    private String ambari_old_branch;

    private String ambari_custom_user;

    private String stack_upgrade_to;

    private String hdp_repo_baseurl;

    private String STACK;

    private String testsuite_file;

    private String xa_database_flavor;

    private String database_flavor;

    private String ambari_db;

    public String getOs ()
    {
        return os;
    }

    public void setOs (String os)
    {
        this.os = os;
    }

    public String getIs_ha_test ()
    {
        return is_ha_test;
    }

    public void setIs_ha_test (String is_ha_test)
    {
        this.is_ha_test = is_ha_test;
    }

    public String getAmbari_version ()
    {
        return ambari_version;
    }

    public void setAmbari_version (String ambari_version)
    {
        this.ambari_version = ambari_version;
    }

    public String getUpgrade_to ()
    {
        return upgrade_to;
    }

    public void setUpgrade_to (String upgrade_to)
    {
        this.upgrade_to = upgrade_to;
    }

    public String getJdk_version ()
    {
        return jdk_version;
    }

    public void setJdk_version (String jdk_version)
    {
        this.jdk_version = jdk_version;
    }

    public String getMotd_enable ()
    {
        return motd_enable;
    }

    public void setMotd_enable (String motd_enable)
    {
        this.motd_enable = motd_enable;
    }

    public String getAmbari_agent_user ()
    {
        return ambari_agent_user;
    }

    public void setAmbari_agent_user (String ambari_agent_user)
    {
        this.ambari_agent_user = ambari_agent_user;
    }

    public String getMr_framework ()
    {
        return mr_framework;
    }

    public void setMr_framework (String mr_framework)
    {
        this.mr_framework = mr_framework;
    }

    public String getCustomized_services_users ()
    {
        return customized_services_users;
    }

    public void setCustomized_services_users (String customized_services_users)
    {
        this.customized_services_users = customized_services_users;
    }

    public String getSecurity ()
    {
        return security;
    }

    public void setSecurity (String security)
    {
        this.security = security;
    }

    public String getAmbari_old_branch ()
    {
        return ambari_old_branch;
    }

    public void setAmbari_old_branch (String ambari_old_branch)
    {
        this.ambari_old_branch = ambari_old_branch;
    }

    public String getAmbari_custom_user ()
    {
        return ambari_custom_user;
    }

    public void setAmbari_custom_user (String ambari_custom_user)
    {
        this.ambari_custom_user = ambari_custom_user;
    }

    public String getStack_upgrade_to ()
    {
        return stack_upgrade_to;
    }

    public void setStack_upgrade_to (String stack_upgrade_to)
    {
        this.stack_upgrade_to = stack_upgrade_to;
    }

    public String getHdp_repo_baseurl ()
    {
        return hdp_repo_baseurl;
    }

    public void setHdp_repo_baseurl (String hdp_repo_baseurl)
    {
        this.hdp_repo_baseurl = hdp_repo_baseurl;
    }

    public String getSTACK ()
    {
        return STACK;
    }

    public void setSTACK (String STACK)
    {
        this.STACK = STACK;
    }

    public String getTestsuite_file ()
    {
        return testsuite_file;
    }

    public void setTestsuite_file (String testsuite_file)
    {
        this.testsuite_file = testsuite_file;
    }

    public String getXa_database_flavor ()
    {
        return xa_database_flavor;
    }

    public void setXa_database_flavor (String xa_database_flavor)
    {
        this.xa_database_flavor = xa_database_flavor;
    }

    public String getDatabase_flavor ()
    {
        return database_flavor;
    }

    public void setDatabase_flavor (String database_flavor)
    {
        this.database_flavor = database_flavor;
    }

    public String getAmbari_db ()
    {
        return ambari_db;
    }

    public void setAmbari_db (String ambari_db)
    {
        this.ambari_db = ambari_db;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [os = "+os+", is_ha_test = "+is_ha_test+", ambari_version = "+ambari_version+", upgrade_to = "+upgrade_to+", jdk_version = "+jdk_version+", motd_enable = "+motd_enable+", ambari_agent_user = "+ambari_agent_user+", mr_framework = "+mr_framework+", customized_services_users = "+customized_services_users+", security = "+security+", ambari_old_branch = "+ambari_old_branch+", ambari_custom_user = "+ambari_custom_user+", stack_upgrade_to = "+stack_upgrade_to+", hdp_repo_baseurl = "+hdp_repo_baseurl+", STACK = "+STACK+", testsuite_file = "+testsuite_file+", xa_database_flavor = "+xa_database_flavor+", database_flavor = "+database_flavor+", ambari_db = "+ambari_db+"]";
    }
}


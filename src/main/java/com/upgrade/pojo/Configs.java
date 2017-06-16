package com.upgrade.pojo;

/**
 * Created by ssharma on 6/15/17.
 */

public class Configs
{
    private String ambari_blueprints;

    private String os;

    private String revision_id;

    private String last_update_time;

    private String kerberos_server_type;

    private String wire_encryption;

    private String ranger;

    private String user_kerberos_server_type;

    private String type;

    private String registry_db;

    private String tde;

    private String streamline_db;

    private String id;

    private String execution_framework;

    private String jdk;

    private String ranger_db;

    private String database_flavor;

    private String ambari_db;

    public String getAmbari_blueprints ()
    {
        return ambari_blueprints;
    }

    public void setAmbari_blueprints (String ambari_blueprints)
    {
        this.ambari_blueprints = ambari_blueprints;
    }

    public String getOs ()
    {
        return os;
    }

    public void setOs (String os)
    {
        this.os = os;
    }

    public String getRevision_id ()
    {
        return revision_id;
    }

    public void setRevision_id (String revision_id)
    {
        this.revision_id = revision_id;
    }

    public String getLast_update_time ()
    {
        return last_update_time;
    }

    public void setLast_update_time (String last_update_time)
    {
        this.last_update_time = last_update_time;
    }

    public String getKerberos_server_type ()
    {
        return kerberos_server_type;
    }

    public void setKerberos_server_type (String kerberos_server_type)
    {
        this.kerberos_server_type = kerberos_server_type;
    }

    public String getWire_encryption ()
    {
        return wire_encryption;
    }

    public void setWire_encryption (String wire_encryption)
    {
        this.wire_encryption = wire_encryption;
    }

    public String getRanger ()
    {
        return ranger;
    }

    public void setRanger (String ranger)
    {
        this.ranger = ranger;
    }

    public String getUser_kerberos_server_type ()
    {
        return user_kerberos_server_type;
    }

    public void setUser_kerberos_server_type (String user_kerberos_server_type)
    {
        this.user_kerberos_server_type = user_kerberos_server_type;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getRegistry_db ()
    {
        return registry_db;
    }

    public void setRegistry_db (String registry_db)
    {
        this.registry_db = registry_db;
    }

    public String getTde ()
    {
        return tde;
    }

    public void setTde (String tde)
    {
        this.tde = tde;
    }

    public String getStreamline_db ()
    {
        return streamline_db;
    }

    public void setStreamline_db (String streamline_db)
    {
        this.streamline_db = streamline_db;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getExecution_framework ()
    {
        return execution_framework;
    }

    public void setExecution_framework (String execution_framework)
    {
        this.execution_framework = execution_framework;
    }

    public String getJdk ()
    {
        return jdk;
    }

    public void setJdk (String jdk)
    {
        this.jdk = jdk;
    }

    public String getRanger_db ()
    {
        return ranger_db;
    }

    public void setRanger_db (String ranger_db)
    {
        this.ranger_db = ranger_db;
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
        return "ClassPojo [ambari_blueprints = "+ambari_blueprints+", os = "+os+", revision_id = "+revision_id+", last_update_time = "+last_update_time+", kerberos_server_type = "+kerberos_server_type+", wire_encryption = "+wire_encryption+", ranger = "+ranger+", user_kerberos_server_type = "+user_kerberos_server_type+", type = "+type+", registry_db = "+registry_db+", tde = "+tde+", streamline_db = "+streamline_db+", id = "+id+", execution_framework = "+execution_framework+", jdk = "+jdk+", ranger_db = "+ranger_db+", database_flavor = "+database_flavor+", ambari_db = "+ambari_db+"]";
    }
}
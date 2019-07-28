package com.dtolabs.rundeck.core.jobs;


import com.dtolabs.rundeck.core.common.INodeSet;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface JobPreExecutionEvent {

    /**
     *
     * @return String project name.
     */
    String getProjectName();

    /**
     *
     * @return List<LinkedHashMap> options of the job.
     */
    List<LinkedHashMap> getOptions();

    /**
     *
     * @return String user name triggering the job.
     */
    String getUserName();

    /**
     *
     * @return Map<String, String> values setup to job options.
     */
    Map getOptionsValues();

    /**
     *
     * @return String node filter
     */
    String getNodeFilter();

    /**
     *
     * @return INodeSet node set where the job will run
     */
    INodeSet getNodes();
}

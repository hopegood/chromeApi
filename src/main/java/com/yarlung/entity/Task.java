package com.yarlung.entity;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task
{
    private Integer id;
    private String name;
    private User assistant;
    private Integer section;
    private User assignee;
    private Date startTime;
    private Date lastDate;
    private Date dueDate;
    private Integer priority;
    private String overview;
    private Date finishTime;
    private String latestProgress;
    private Date refreshTime;
    private String evaluation;
    private User completer;
    private User creator;
    private int status;
    public static final Map<Integer, String> priorityMap = new LinkedHashMap();
    public static final Map<Integer, String> sectionMap = new LinkedHashMap();
    public static final Map<Integer, String> specialityMap = new LinkedHashMap();
    public static final Map<Integer, String> teamMap = new LinkedHashMap();
    public static final Map<Integer, String> statusMap = new LinkedHashMap();

    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return this.startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getDueDate() {
        return this.dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Integer getPriority() {
        return this.priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    public String getOverview() {
        return this.overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public Date getFinishTime() {
        return this.finishTime;
    }
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
    public String getEvaluation() {
        return this.evaluation;
    }
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Integer getSection() {
        return this.section;
    }
    public void setSection(Integer section) {
        this.section = section;
    }
    public User getAssistant() {
        return this.assistant;
    }
    public void setAssistant(User assistant) {
        this.assistant = assistant;
    }
    public User getAssignee() {
        return this.assignee;
    }
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
    public Date getLastDate() {
        return this.lastDate;
    }
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
    public String getLatestProgress() {
        return this.latestProgress;
    }
    public void setLatestProgress(String latestProgress) {
        this.latestProgress = latestProgress;
    }
    public Date getRefreshTime() {
        return this.refreshTime;
    }
    public void setRefreshTime(Date refreshTime) {
        this.refreshTime = refreshTime;
    }
    public User getCompleter() {
        return this.completer;
    }
    public void setCompleter(User completer) {
        this.completer = completer;
    }
    public User getCreator() {
        return this.creator;
    }
    public void setCreator(User creator) {
        this.creator = creator;
    }

    static
    {
        priorityMap.put(Integer.valueOf(0), "\u4F18\u5148");
        priorityMap.put(Integer.valueOf(1), "\u4E00\u822C");

        specialityMap.put(Integer.valueOf(1), "\u73AF\u63A7");
        specialityMap.put(Integer.valueOf(2), "\u52A8\u7167");
        specialityMap.put(Integer.valueOf(4), "\u7ED9\u6392\u6C34");
        specialityMap.put(Integer.valueOf(8), "\u5C4F\u853D\u95E8");
        specialityMap.put(Integer.valueOf(16), "\u7535\u68AF");
        specialityMap.put(Integer.valueOf(32), "\u5B89\u5168");
        specialityMap.put(Integer.valueOf(64), "\u57F9\u8BAD");
        specialityMap.put(Integer.valueOf(128), "\u4F7F\u7528");
        specialityMap.put(Integer.valueOf(256), "\u7EFC\u5408");
        specialityMap.put(Integer.valueOf(512), "\u5BA3\u4F20");
        specialityMap.put(Integer.valueOf(1024), "\u7269\u8D44");

        teamMap.put(Integer.valueOf(1048576), "\u673A\u7535\u4E00\u5DE5\u73ED");
        teamMap.put(Integer.valueOf(2097152), "\u673A\u7535\u4E8C\u5DE5\u73ED");
        teamMap.put(Integer.valueOf(4194304), "\u673A\u7535\u4E09\u5DE5\u73ED");
        teamMap.put(Integer.valueOf(8388608), "\u673A\u7535\u56DB\u5DE5\u73ED");
        teamMap.put(Integer.valueOf(16777216), "\u95E8\u68AF\u5DE5\u73ED");

        sectionMap.put(Integer.valueOf(1), "\u73AF\u63A7");
        sectionMap.put(Integer.valueOf(2), "\u52A8\u7167");
        sectionMap.put(Integer.valueOf(4), "\u7ED9\u6392\u6C34");
        sectionMap.put(Integer.valueOf(8), "\u5C4F\u853D\u95E8");
        sectionMap.put(Integer.valueOf(16), "\u7535\u68AF");
        sectionMap.put(Integer.valueOf(32), "\u5B89\u5168");
        sectionMap.put(Integer.valueOf(64), "\u57F9\u8BAD");
        sectionMap.put(Integer.valueOf(128), "\u4F7F\u7528");
        sectionMap.put(Integer.valueOf(256), "\u7EFC\u5408");
        sectionMap.put(Integer.valueOf(512), "\u5BA3\u4F20");
        sectionMap.put(Integer.valueOf(1024), "\u7269\u8D44");

        sectionMap.put(Integer.valueOf(1048576), "\u673A\u7535\u4E00\u5DE5\u73ED");
        sectionMap.put(Integer.valueOf(2097152), "\u673A\u7535\u4E8C\u5DE5\u73ED");
        sectionMap.put(Integer.valueOf(4194304), "\u673A\u7535\u4E09\u5DE5\u73ED");
        sectionMap.put(Integer.valueOf(8388608), "\u673A\u7535\u56DB\u5DE5\u73ED");
        sectionMap.put(Integer.valueOf(16777216), "\u95E8\u68AF\u5DE5\u73ED");

        statusMap.put(Integer.valueOf(0), "\u8FDB\u884C\u4E2D");
        statusMap.put(Integer.valueOf(1), "\u5DF2\u5B8C\u6210");
        statusMap.put(Integer.valueOf(2), "\u8D85\u65F6");
    }
}
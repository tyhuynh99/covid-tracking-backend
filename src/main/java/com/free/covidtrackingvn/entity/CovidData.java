package com.free.covidtrackingvn.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "covid_data")
public class CovidData {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "source_url", nullable = false)
    private String sourceUrl;

    @Column(name = "last_updated_at_apify", nullable = false)
    private Date lastUpdatedAtApify;

    @Column(name = "read_me", nullable = false)
    private String readMe;

    @Column(name = "last_updated_at_source", nullable = false)
    private Date lastUpdatedAtSource;

    @Column(name = "infected", nullable = false)
    private long infected;

    @Column(name = "treated", nullable = false)
    private long treated;

    @Column(name = "recovered", nullable = false)
    private long recovered;

    @Column(name = "deceased", nullable = false)
    private long deceased;

    @Column(name = "insert_at", updatable = false)
    @CreationTimestamp
    private Date insertAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Date getLastUpdatedAtApify() {
        return lastUpdatedAtApify;
    }

    public void setLastUpdatedAtApify(Date lastUpdatedAtApify) {
        this.lastUpdatedAtApify = lastUpdatedAtApify;
    }

    public String getReadMe() {
        return readMe;
    }

    public void setReadMe(String readMe) {
        this.readMe = readMe;
    }

    public Date getLastUpdatedAtSource() {
        return lastUpdatedAtSource;
    }

    public void setLastUpdatedAtSource(Date lastUpdatedAtSource) {
        this.lastUpdatedAtSource = lastUpdatedAtSource;
    }

    public long getInfected() {
        return infected;
    }

    public void setInfected(long infected) {
        this.infected = infected;
    }

    public long getTreated() {
        return treated;
    }

    public void setTreated(long treated) {
        this.treated = treated;
    }

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getDeceased() {
        return deceased;
    }

    public void setDeceased(long deceased) {
        this.deceased = deceased;
    }

    public Date getInsertAt() {
        return insertAt;
    }

    public void setInsertAt(Date insertAt) {
        this.insertAt = insertAt;
    }
}

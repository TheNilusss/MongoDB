package de.Studium.CustomerService.entity;

import org.springframework.data.annotation.Id;

public class CustomerObject {

    @Id
    public int m_id;

    public String mFirstName;
    public String mLastName;

    public CustomerObject() {
    }

    public CustomerObject(String mFirstName, String mLastName) {
        //this.m_id = m_id;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }
}

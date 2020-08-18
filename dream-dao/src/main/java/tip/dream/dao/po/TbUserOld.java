package tip.dream.dao.po;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class TbUserOld implements Serializable {
    private String USER_ID;

    private String USER_NAME;

    private String USER_NAME_PINYIN;

    private Date IDCARD_START_TIME;

    private Date IDCARD_END_TIME;

    private String IDCARD_TYPE;

    private String IDCARD_NO;

    private String IDCARD_HASH;

    private Integer REAL_LEVEL;

    private String MOBILE;

    private String EMAIL;

    private String AUTHENTICATE_TYPE;

    private String TYPE;

    private Integer STATUS;

    private String REMARK;

    private String USER_MAIN_ID;

    private Date ADD_TIME;

    private Date UPDATE_TIME;

    private String ADD_BY;

    private String UPDATE_BY;

    private String SEX;

    private Date BIRTHDAY;

    private String NATIONALITY;

    private String BIRTH_PLACE;

    private String USER_OFFICE_FAX;

    private String USER_OFFICE_PHONE;

    private String ALGORITHM;

    private String PWD_ENCRYPT;

    private String VIRTUAL_USER_TYPE;

    private String ORG_ID;

    private String PWD;

    private Integer SHOW_ORDER;

    private String USER_POST;

    private String USER_OFFICE_ADDRESS;

    private String USER_TITLE;

    private String CA_ID;

    private String CERT_TYPE;

    private String PIN;

    private Integer IS_ACTIVE;

    private String JOB_TITLE;

    private String LOGIN_NAME;

    private String USER_NO;

    private String EXTINFO;

    private Date NUSER_HIREDATE;

    private Date NUSER_LEAVEDATE;

    private String LEAVE_REASON;

    private String COUNTRY;

    private String PRIVACY_LEVEL;

    private String TENANT_ID;

    private String EXT;

    private String USER_SANAME;

    private String IS_MAIN_JOB_ORG;

    private String GROUP_JOB_DUTY;

    private String ORG_FULL_NAME;

    private String ORG_JOB_DUTY;

    private String NODE_ID;

    private byte[] PHOTO;

    private String LEAVE_DESCRIPTION;

    private String FACE_PHOTO;

    private static final long serialVersionUID = 1L;

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_NAME_PINYIN() {
        return USER_NAME_PINYIN;
    }

    public void setUSER_NAME_PINYIN(String USER_NAME_PINYIN) {
        this.USER_NAME_PINYIN = USER_NAME_PINYIN;
    }

    public Date getIDCARD_START_TIME() {
        return IDCARD_START_TIME;
    }

    public void setIDCARD_START_TIME(Date IDCARD_START_TIME) {
        this.IDCARD_START_TIME = IDCARD_START_TIME;
    }

    public Date getIDCARD_END_TIME() {
        return IDCARD_END_TIME;
    }

    public void setIDCARD_END_TIME(Date IDCARD_END_TIME) {
        this.IDCARD_END_TIME = IDCARD_END_TIME;
    }

    public String getIDCARD_TYPE() {
        return IDCARD_TYPE;
    }

    public void setIDCARD_TYPE(String IDCARD_TYPE) {
        this.IDCARD_TYPE = IDCARD_TYPE;
    }

    public String getIDCARD_NO() {
        return IDCARD_NO;
    }

    public void setIDCARD_NO(String IDCARD_NO) {
        this.IDCARD_NO = IDCARD_NO;
    }

    public String getIDCARD_HASH() {
        return IDCARD_HASH;
    }

    public void setIDCARD_HASH(String IDCARD_HASH) {
        this.IDCARD_HASH = IDCARD_HASH;
    }

    public Integer getREAL_LEVEL() {
        return REAL_LEVEL;
    }

    public void setREAL_LEVEL(Integer REAL_LEVEL) {
        this.REAL_LEVEL = REAL_LEVEL;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getAUTHENTICATE_TYPE() {
        return AUTHENTICATE_TYPE;
    }

    public void setAUTHENTICATE_TYPE(String AUTHENTICATE_TYPE) {
        this.AUTHENTICATE_TYPE = AUTHENTICATE_TYPE;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getUSER_MAIN_ID() {
        return USER_MAIN_ID;
    }

    public void setUSER_MAIN_ID(String USER_MAIN_ID) {
        this.USER_MAIN_ID = USER_MAIN_ID;
    }

    public Date getADD_TIME() {
        return ADD_TIME;
    }

    public void setADD_TIME(Date ADD_TIME) {
        this.ADD_TIME = ADD_TIME;
    }

    public Date getUPDATE_TIME() {
        return UPDATE_TIME;
    }

    public void setUPDATE_TIME(Date UPDATE_TIME) {
        this.UPDATE_TIME = UPDATE_TIME;
    }

    public String getADD_BY() {
        return ADD_BY;
    }

    public void setADD_BY(String ADD_BY) {
        this.ADD_BY = ADD_BY;
    }

    public String getUPDATE_BY() {
        return UPDATE_BY;
    }

    public void setUPDATE_BY(String UPDATE_BY) {
        this.UPDATE_BY = UPDATE_BY;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getNATIONALITY() {
        return NATIONALITY;
    }

    public void setNATIONALITY(String NATIONALITY) {
        this.NATIONALITY = NATIONALITY;
    }

    public String getBIRTH_PLACE() {
        return BIRTH_PLACE;
    }

    public void setBIRTH_PLACE(String BIRTH_PLACE) {
        this.BIRTH_PLACE = BIRTH_PLACE;
    }

    public String getUSER_OFFICE_FAX() {
        return USER_OFFICE_FAX;
    }

    public void setUSER_OFFICE_FAX(String USER_OFFICE_FAX) {
        this.USER_OFFICE_FAX = USER_OFFICE_FAX;
    }

    public String getUSER_OFFICE_PHONE() {
        return USER_OFFICE_PHONE;
    }

    public void setUSER_OFFICE_PHONE(String USER_OFFICE_PHONE) {
        this.USER_OFFICE_PHONE = USER_OFFICE_PHONE;
    }

    public String getALGORITHM() {
        return ALGORITHM;
    }

    public void setALGORITHM(String ALGORITHM) {
        this.ALGORITHM = ALGORITHM;
    }

    public String getPWD_ENCRYPT() {
        return PWD_ENCRYPT;
    }

    public void setPWD_ENCRYPT(String PWD_ENCRYPT) {
        this.PWD_ENCRYPT = PWD_ENCRYPT;
    }

    public String getVIRTUAL_USER_TYPE() {
        return VIRTUAL_USER_TYPE;
    }

    public void setVIRTUAL_USER_TYPE(String VIRTUAL_USER_TYPE) {
        this.VIRTUAL_USER_TYPE = VIRTUAL_USER_TYPE;
    }

    public String getORG_ID() {
        return ORG_ID;
    }

    public void setORG_ID(String ORG_ID) {
        this.ORG_ID = ORG_ID;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public Integer getSHOW_ORDER() {
        return SHOW_ORDER;
    }

    public void setSHOW_ORDER(Integer SHOW_ORDER) {
        this.SHOW_ORDER = SHOW_ORDER;
    }

    public String getUSER_POST() {
        return USER_POST;
    }

    public void setUSER_POST(String USER_POST) {
        this.USER_POST = USER_POST;
    }

    public String getUSER_OFFICE_ADDRESS() {
        return USER_OFFICE_ADDRESS;
    }

    public void setUSER_OFFICE_ADDRESS(String USER_OFFICE_ADDRESS) {
        this.USER_OFFICE_ADDRESS = USER_OFFICE_ADDRESS;
    }

    public String getUSER_TITLE() {
        return USER_TITLE;
    }

    public void setUSER_TITLE(String USER_TITLE) {
        this.USER_TITLE = USER_TITLE;
    }

    public String getCA_ID() {
        return CA_ID;
    }

    public void setCA_ID(String CA_ID) {
        this.CA_ID = CA_ID;
    }

    public String getCERT_TYPE() {
        return CERT_TYPE;
    }

    public void setCERT_TYPE(String CERT_TYPE) {
        this.CERT_TYPE = CERT_TYPE;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public Integer getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Integer IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public String getJOB_TITLE() {
        return JOB_TITLE;
    }

    public void setJOB_TITLE(String JOB_TITLE) {
        this.JOB_TITLE = JOB_TITLE;
    }

    public String getLOGIN_NAME() {
        return LOGIN_NAME;
    }

    public void setLOGIN_NAME(String LOGIN_NAME) {
        this.LOGIN_NAME = LOGIN_NAME;
    }

    public String getUSER_NO() {
        return USER_NO;
    }

    public void setUSER_NO(String USER_NO) {
        this.USER_NO = USER_NO;
    }

    public String getEXTINFO() {
        return EXTINFO;
    }

    public void setEXTINFO(String EXTINFO) {
        this.EXTINFO = EXTINFO;
    }

    public Date getNUSER_HIREDATE() {
        return NUSER_HIREDATE;
    }

    public void setNUSER_HIREDATE(Date NUSER_HIREDATE) {
        this.NUSER_HIREDATE = NUSER_HIREDATE;
    }

    public Date getNUSER_LEAVEDATE() {
        return NUSER_LEAVEDATE;
    }

    public void setNUSER_LEAVEDATE(Date NUSER_LEAVEDATE) {
        this.NUSER_LEAVEDATE = NUSER_LEAVEDATE;
    }

    public String getLEAVE_REASON() {
        return LEAVE_REASON;
    }

    public void setLEAVE_REASON(String LEAVE_REASON) {
        this.LEAVE_REASON = LEAVE_REASON;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getPRIVACY_LEVEL() {
        return PRIVACY_LEVEL;
    }

    public void setPRIVACY_LEVEL(String PRIVACY_LEVEL) {
        this.PRIVACY_LEVEL = PRIVACY_LEVEL;
    }

    public String getTENANT_ID() {
        return TENANT_ID;
    }

    public void setTENANT_ID(String TENANT_ID) {
        this.TENANT_ID = TENANT_ID;
    }

    public String getEXT() {
        return EXT;
    }

    public void setEXT(String EXT) {
        this.EXT = EXT;
    }

    public String getUSER_SANAME() {
        return USER_SANAME;
    }

    public void setUSER_SANAME(String USER_SANAME) {
        this.USER_SANAME = USER_SANAME;
    }

    public String getIS_MAIN_JOB_ORG() {
        return IS_MAIN_JOB_ORG;
    }

    public void setIS_MAIN_JOB_ORG(String IS_MAIN_JOB_ORG) {
        this.IS_MAIN_JOB_ORG = IS_MAIN_JOB_ORG;
    }

    public String getGROUP_JOB_DUTY() {
        return GROUP_JOB_DUTY;
    }

    public void setGROUP_JOB_DUTY(String GROUP_JOB_DUTY) {
        this.GROUP_JOB_DUTY = GROUP_JOB_DUTY;
    }

    public String getORG_FULL_NAME() {
        return ORG_FULL_NAME;
    }

    public void setORG_FULL_NAME(String ORG_FULL_NAME) {
        this.ORG_FULL_NAME = ORG_FULL_NAME;
    }

    public String getORG_JOB_DUTY() {
        return ORG_JOB_DUTY;
    }

    public void setORG_JOB_DUTY(String ORG_JOB_DUTY) {
        this.ORG_JOB_DUTY = ORG_JOB_DUTY;
    }

    public String getNODE_ID() {
        return NODE_ID;
    }

    public void setNODE_ID(String NODE_ID) {
        this.NODE_ID = NODE_ID;
    }

    public byte[] getPHOTO() {
        return PHOTO;
    }

    public void setPHOTO(byte[] PHOTO) {
        this.PHOTO = PHOTO;
    }

    public String getLEAVE_DESCRIPTION() {
        return LEAVE_DESCRIPTION;
    }

    public void setLEAVE_DESCRIPTION(String LEAVE_DESCRIPTION) {
        this.LEAVE_DESCRIPTION = LEAVE_DESCRIPTION;
    }

    public String getFACE_PHOTO() {
        return FACE_PHOTO;
    }

    public void setFACE_PHOTO(String FACE_PHOTO) {
        this.FACE_PHOTO = FACE_PHOTO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", USER_ID=").append(USER_ID);
        sb.append(", USER_NAME=").append(USER_NAME);
        sb.append(", USER_NAME_PINYIN=").append(USER_NAME_PINYIN);
        sb.append(", IDCARD_START_TIME=").append(IDCARD_START_TIME);
        sb.append(", IDCARD_END_TIME=").append(IDCARD_END_TIME);
        sb.append(", IDCARD_TYPE=").append(IDCARD_TYPE);
        sb.append(", IDCARD_NO=").append(IDCARD_NO);
        sb.append(", IDCARD_HASH=").append(IDCARD_HASH);
        sb.append(", REAL_LEVEL=").append(REAL_LEVEL);
        sb.append(", MOBILE=").append(MOBILE);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", AUTHENTICATE_TYPE=").append(AUTHENTICATE_TYPE);
        sb.append(", TYPE=").append(TYPE);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", USER_MAIN_ID=").append(USER_MAIN_ID);
        sb.append(", ADD_TIME=").append(ADD_TIME);
        sb.append(", UPDATE_TIME=").append(UPDATE_TIME);
        sb.append(", ADD_BY=").append(ADD_BY);
        sb.append(", UPDATE_BY=").append(UPDATE_BY);
        sb.append(", SEX=").append(SEX);
        sb.append(", BIRTHDAY=").append(BIRTHDAY);
        sb.append(", NATIONALITY=").append(NATIONALITY);
        sb.append(", BIRTH_PLACE=").append(BIRTH_PLACE);
        sb.append(", USER_OFFICE_FAX=").append(USER_OFFICE_FAX);
        sb.append(", USER_OFFICE_PHONE=").append(USER_OFFICE_PHONE);
        sb.append(", ALGORITHM=").append(ALGORITHM);
        sb.append(", PWD_ENCRYPT=").append(PWD_ENCRYPT);
        sb.append(", VIRTUAL_USER_TYPE=").append(VIRTUAL_USER_TYPE);
        sb.append(", ORG_ID=").append(ORG_ID);
        sb.append(", PWD=").append(PWD);
        sb.append(", SHOW_ORDER=").append(SHOW_ORDER);
        sb.append(", USER_POST=").append(USER_POST);
        sb.append(", USER_OFFICE_ADDRESS=").append(USER_OFFICE_ADDRESS);
        sb.append(", USER_TITLE=").append(USER_TITLE);
        sb.append(", CA_ID=").append(CA_ID);
        sb.append(", CERT_TYPE=").append(CERT_TYPE);
        sb.append(", PIN=").append(PIN);
        sb.append(", IS_ACTIVE=").append(IS_ACTIVE);
        sb.append(", JOB_TITLE=").append(JOB_TITLE);
        sb.append(", LOGIN_NAME=").append(LOGIN_NAME);
        sb.append(", USER_NO=").append(USER_NO);
        sb.append(", EXTINFO=").append(EXTINFO);
        sb.append(", NUSER_HIREDATE=").append(NUSER_HIREDATE);
        sb.append(", NUSER_LEAVEDATE=").append(NUSER_LEAVEDATE);
        sb.append(", LEAVE_REASON=").append(LEAVE_REASON);
        sb.append(", COUNTRY=").append(COUNTRY);
        sb.append(", PRIVACY_LEVEL=").append(PRIVACY_LEVEL);
        sb.append(", TENANT_ID=").append(TENANT_ID);
        sb.append(", EXT=").append(EXT);
        sb.append(", USER_SANAME=").append(USER_SANAME);
        sb.append(", IS_MAIN_JOB_ORG=").append(IS_MAIN_JOB_ORG);
        sb.append(", GROUP_JOB_DUTY=").append(GROUP_JOB_DUTY);
        sb.append(", ORG_FULL_NAME=").append(ORG_FULL_NAME);
        sb.append(", ORG_JOB_DUTY=").append(ORG_JOB_DUTY);
        sb.append(", NODE_ID=").append(NODE_ID);
        sb.append(", PHOTO=").append(PHOTO);
        sb.append(", LEAVE_DESCRIPTION=").append(LEAVE_DESCRIPTION);
        sb.append(", FACE_PHOTO=").append(FACE_PHOTO);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbUserOld other = (TbUserOld) that;
        return (this.getUSER_ID() == null ? other.getUSER_ID() == null : this.getUSER_ID().equals(other.getUSER_ID()))
            && (this.getUSER_NAME() == null ? other.getUSER_NAME() == null : this.getUSER_NAME().equals(other.getUSER_NAME()))
            && (this.getUSER_NAME_PINYIN() == null ? other.getUSER_NAME_PINYIN() == null : this.getUSER_NAME_PINYIN().equals(other.getUSER_NAME_PINYIN()))
            && (this.getIDCARD_START_TIME() == null ? other.getIDCARD_START_TIME() == null : this.getIDCARD_START_TIME().equals(other.getIDCARD_START_TIME()))
            && (this.getIDCARD_END_TIME() == null ? other.getIDCARD_END_TIME() == null : this.getIDCARD_END_TIME().equals(other.getIDCARD_END_TIME()))
            && (this.getIDCARD_TYPE() == null ? other.getIDCARD_TYPE() == null : this.getIDCARD_TYPE().equals(other.getIDCARD_TYPE()))
            && (this.getIDCARD_NO() == null ? other.getIDCARD_NO() == null : this.getIDCARD_NO().equals(other.getIDCARD_NO()))
            && (this.getIDCARD_HASH() == null ? other.getIDCARD_HASH() == null : this.getIDCARD_HASH().equals(other.getIDCARD_HASH()))
            && (this.getREAL_LEVEL() == null ? other.getREAL_LEVEL() == null : this.getREAL_LEVEL().equals(other.getREAL_LEVEL()))
            && (this.getMOBILE() == null ? other.getMOBILE() == null : this.getMOBILE().equals(other.getMOBILE()))
            && (this.getEMAIL() == null ? other.getEMAIL() == null : this.getEMAIL().equals(other.getEMAIL()))
            && (this.getAUTHENTICATE_TYPE() == null ? other.getAUTHENTICATE_TYPE() == null : this.getAUTHENTICATE_TYPE().equals(other.getAUTHENTICATE_TYPE()))
            && (this.getTYPE() == null ? other.getTYPE() == null : this.getTYPE().equals(other.getTYPE()))
            && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
            && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
            && (this.getUSER_MAIN_ID() == null ? other.getUSER_MAIN_ID() == null : this.getUSER_MAIN_ID().equals(other.getUSER_MAIN_ID()))
            && (this.getADD_TIME() == null ? other.getADD_TIME() == null : this.getADD_TIME().equals(other.getADD_TIME()))
            && (this.getUPDATE_TIME() == null ? other.getUPDATE_TIME() == null : this.getUPDATE_TIME().equals(other.getUPDATE_TIME()))
            && (this.getADD_BY() == null ? other.getADD_BY() == null : this.getADD_BY().equals(other.getADD_BY()))
            && (this.getUPDATE_BY() == null ? other.getUPDATE_BY() == null : this.getUPDATE_BY().equals(other.getUPDATE_BY()))
            && (this.getSEX() == null ? other.getSEX() == null : this.getSEX().equals(other.getSEX()))
            && (this.getBIRTHDAY() == null ? other.getBIRTHDAY() == null : this.getBIRTHDAY().equals(other.getBIRTHDAY()))
            && (this.getNATIONALITY() == null ? other.getNATIONALITY() == null : this.getNATIONALITY().equals(other.getNATIONALITY()))
            && (this.getBIRTH_PLACE() == null ? other.getBIRTH_PLACE() == null : this.getBIRTH_PLACE().equals(other.getBIRTH_PLACE()))
            && (this.getUSER_OFFICE_FAX() == null ? other.getUSER_OFFICE_FAX() == null : this.getUSER_OFFICE_FAX().equals(other.getUSER_OFFICE_FAX()))
            && (this.getUSER_OFFICE_PHONE() == null ? other.getUSER_OFFICE_PHONE() == null : this.getUSER_OFFICE_PHONE().equals(other.getUSER_OFFICE_PHONE()))
            && (this.getALGORITHM() == null ? other.getALGORITHM() == null : this.getALGORITHM().equals(other.getALGORITHM()))
            && (this.getPWD_ENCRYPT() == null ? other.getPWD_ENCRYPT() == null : this.getPWD_ENCRYPT().equals(other.getPWD_ENCRYPT()))
            && (this.getVIRTUAL_USER_TYPE() == null ? other.getVIRTUAL_USER_TYPE() == null : this.getVIRTUAL_USER_TYPE().equals(other.getVIRTUAL_USER_TYPE()))
            && (this.getORG_ID() == null ? other.getORG_ID() == null : this.getORG_ID().equals(other.getORG_ID()))
            && (this.getPWD() == null ? other.getPWD() == null : this.getPWD().equals(other.getPWD()))
            && (this.getSHOW_ORDER() == null ? other.getSHOW_ORDER() == null : this.getSHOW_ORDER().equals(other.getSHOW_ORDER()))
            && (this.getUSER_POST() == null ? other.getUSER_POST() == null : this.getUSER_POST().equals(other.getUSER_POST()))
            && (this.getUSER_OFFICE_ADDRESS() == null ? other.getUSER_OFFICE_ADDRESS() == null : this.getUSER_OFFICE_ADDRESS().equals(other.getUSER_OFFICE_ADDRESS()))
            && (this.getUSER_TITLE() == null ? other.getUSER_TITLE() == null : this.getUSER_TITLE().equals(other.getUSER_TITLE()))
            && (this.getCA_ID() == null ? other.getCA_ID() == null : this.getCA_ID().equals(other.getCA_ID()))
            && (this.getCERT_TYPE() == null ? other.getCERT_TYPE() == null : this.getCERT_TYPE().equals(other.getCERT_TYPE()))
            && (this.getPIN() == null ? other.getPIN() == null : this.getPIN().equals(other.getPIN()))
            && (this.getIS_ACTIVE() == null ? other.getIS_ACTIVE() == null : this.getIS_ACTIVE().equals(other.getIS_ACTIVE()))
            && (this.getJOB_TITLE() == null ? other.getJOB_TITLE() == null : this.getJOB_TITLE().equals(other.getJOB_TITLE()))
            && (this.getLOGIN_NAME() == null ? other.getLOGIN_NAME() == null : this.getLOGIN_NAME().equals(other.getLOGIN_NAME()))
            && (this.getUSER_NO() == null ? other.getUSER_NO() == null : this.getUSER_NO().equals(other.getUSER_NO()))
            && (this.getEXTINFO() == null ? other.getEXTINFO() == null : this.getEXTINFO().equals(other.getEXTINFO()))
            && (this.getNUSER_HIREDATE() == null ? other.getNUSER_HIREDATE() == null : this.getNUSER_HIREDATE().equals(other.getNUSER_HIREDATE()))
            && (this.getNUSER_LEAVEDATE() == null ? other.getNUSER_LEAVEDATE() == null : this.getNUSER_LEAVEDATE().equals(other.getNUSER_LEAVEDATE()))
            && (this.getLEAVE_REASON() == null ? other.getLEAVE_REASON() == null : this.getLEAVE_REASON().equals(other.getLEAVE_REASON()))
            && (this.getCOUNTRY() == null ? other.getCOUNTRY() == null : this.getCOUNTRY().equals(other.getCOUNTRY()))
            && (this.getPRIVACY_LEVEL() == null ? other.getPRIVACY_LEVEL() == null : this.getPRIVACY_LEVEL().equals(other.getPRIVACY_LEVEL()))
            && (this.getTENANT_ID() == null ? other.getTENANT_ID() == null : this.getTENANT_ID().equals(other.getTENANT_ID()))
            && (this.getEXT() == null ? other.getEXT() == null : this.getEXT().equals(other.getEXT()))
            && (this.getUSER_SANAME() == null ? other.getUSER_SANAME() == null : this.getUSER_SANAME().equals(other.getUSER_SANAME()))
            && (this.getIS_MAIN_JOB_ORG() == null ? other.getIS_MAIN_JOB_ORG() == null : this.getIS_MAIN_JOB_ORG().equals(other.getIS_MAIN_JOB_ORG()))
            && (this.getGROUP_JOB_DUTY() == null ? other.getGROUP_JOB_DUTY() == null : this.getGROUP_JOB_DUTY().equals(other.getGROUP_JOB_DUTY()))
            && (this.getORG_FULL_NAME() == null ? other.getORG_FULL_NAME() == null : this.getORG_FULL_NAME().equals(other.getORG_FULL_NAME()))
            && (this.getORG_JOB_DUTY() == null ? other.getORG_JOB_DUTY() == null : this.getORG_JOB_DUTY().equals(other.getORG_JOB_DUTY()))
            && (this.getNODE_ID() == null ? other.getNODE_ID() == null : this.getNODE_ID().equals(other.getNODE_ID()))
            && (Arrays.equals(this.getPHOTO(), other.getPHOTO()))
            && (this.getLEAVE_DESCRIPTION() == null ? other.getLEAVE_DESCRIPTION() == null : this.getLEAVE_DESCRIPTION().equals(other.getLEAVE_DESCRIPTION()))
            && (this.getFACE_PHOTO() == null ? other.getFACE_PHOTO() == null : this.getFACE_PHOTO().equals(other.getFACE_PHOTO()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUSER_ID() == null) ? 0 : getUSER_ID().hashCode());
        result = prime * result + ((getUSER_NAME() == null) ? 0 : getUSER_NAME().hashCode());
        result = prime * result + ((getUSER_NAME_PINYIN() == null) ? 0 : getUSER_NAME_PINYIN().hashCode());
        result = prime * result + ((getIDCARD_START_TIME() == null) ? 0 : getIDCARD_START_TIME().hashCode());
        result = prime * result + ((getIDCARD_END_TIME() == null) ? 0 : getIDCARD_END_TIME().hashCode());
        result = prime * result + ((getIDCARD_TYPE() == null) ? 0 : getIDCARD_TYPE().hashCode());
        result = prime * result + ((getIDCARD_NO() == null) ? 0 : getIDCARD_NO().hashCode());
        result = prime * result + ((getIDCARD_HASH() == null) ? 0 : getIDCARD_HASH().hashCode());
        result = prime * result + ((getREAL_LEVEL() == null) ? 0 : getREAL_LEVEL().hashCode());
        result = prime * result + ((getMOBILE() == null) ? 0 : getMOBILE().hashCode());
        result = prime * result + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        result = prime * result + ((getAUTHENTICATE_TYPE() == null) ? 0 : getAUTHENTICATE_TYPE().hashCode());
        result = prime * result + ((getTYPE() == null) ? 0 : getTYPE().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getUSER_MAIN_ID() == null) ? 0 : getUSER_MAIN_ID().hashCode());
        result = prime * result + ((getADD_TIME() == null) ? 0 : getADD_TIME().hashCode());
        result = prime * result + ((getUPDATE_TIME() == null) ? 0 : getUPDATE_TIME().hashCode());
        result = prime * result + ((getADD_BY() == null) ? 0 : getADD_BY().hashCode());
        result = prime * result + ((getUPDATE_BY() == null) ? 0 : getUPDATE_BY().hashCode());
        result = prime * result + ((getSEX() == null) ? 0 : getSEX().hashCode());
        result = prime * result + ((getBIRTHDAY() == null) ? 0 : getBIRTHDAY().hashCode());
        result = prime * result + ((getNATIONALITY() == null) ? 0 : getNATIONALITY().hashCode());
        result = prime * result + ((getBIRTH_PLACE() == null) ? 0 : getBIRTH_PLACE().hashCode());
        result = prime * result + ((getUSER_OFFICE_FAX() == null) ? 0 : getUSER_OFFICE_FAX().hashCode());
        result = prime * result + ((getUSER_OFFICE_PHONE() == null) ? 0 : getUSER_OFFICE_PHONE().hashCode());
        result = prime * result + ((getALGORITHM() == null) ? 0 : getALGORITHM().hashCode());
        result = prime * result + ((getPWD_ENCRYPT() == null) ? 0 : getPWD_ENCRYPT().hashCode());
        result = prime * result + ((getVIRTUAL_USER_TYPE() == null) ? 0 : getVIRTUAL_USER_TYPE().hashCode());
        result = prime * result + ((getORG_ID() == null) ? 0 : getORG_ID().hashCode());
        result = prime * result + ((getPWD() == null) ? 0 : getPWD().hashCode());
        result = prime * result + ((getSHOW_ORDER() == null) ? 0 : getSHOW_ORDER().hashCode());
        result = prime * result + ((getUSER_POST() == null) ? 0 : getUSER_POST().hashCode());
        result = prime * result + ((getUSER_OFFICE_ADDRESS() == null) ? 0 : getUSER_OFFICE_ADDRESS().hashCode());
        result = prime * result + ((getUSER_TITLE() == null) ? 0 : getUSER_TITLE().hashCode());
        result = prime * result + ((getCA_ID() == null) ? 0 : getCA_ID().hashCode());
        result = prime * result + ((getCERT_TYPE() == null) ? 0 : getCERT_TYPE().hashCode());
        result = prime * result + ((getPIN() == null) ? 0 : getPIN().hashCode());
        result = prime * result + ((getIS_ACTIVE() == null) ? 0 : getIS_ACTIVE().hashCode());
        result = prime * result + ((getJOB_TITLE() == null) ? 0 : getJOB_TITLE().hashCode());
        result = prime * result + ((getLOGIN_NAME() == null) ? 0 : getLOGIN_NAME().hashCode());
        result = prime * result + ((getUSER_NO() == null) ? 0 : getUSER_NO().hashCode());
        result = prime * result + ((getEXTINFO() == null) ? 0 : getEXTINFO().hashCode());
        result = prime * result + ((getNUSER_HIREDATE() == null) ? 0 : getNUSER_HIREDATE().hashCode());
        result = prime * result + ((getNUSER_LEAVEDATE() == null) ? 0 : getNUSER_LEAVEDATE().hashCode());
        result = prime * result + ((getLEAVE_REASON() == null) ? 0 : getLEAVE_REASON().hashCode());
        result = prime * result + ((getCOUNTRY() == null) ? 0 : getCOUNTRY().hashCode());
        result = prime * result + ((getPRIVACY_LEVEL() == null) ? 0 : getPRIVACY_LEVEL().hashCode());
        result = prime * result + ((getTENANT_ID() == null) ? 0 : getTENANT_ID().hashCode());
        result = prime * result + ((getEXT() == null) ? 0 : getEXT().hashCode());
        result = prime * result + ((getUSER_SANAME() == null) ? 0 : getUSER_SANAME().hashCode());
        result = prime * result + ((getIS_MAIN_JOB_ORG() == null) ? 0 : getIS_MAIN_JOB_ORG().hashCode());
        result = prime * result + ((getGROUP_JOB_DUTY() == null) ? 0 : getGROUP_JOB_DUTY().hashCode());
        result = prime * result + ((getORG_FULL_NAME() == null) ? 0 : getORG_FULL_NAME().hashCode());
        result = prime * result + ((getORG_JOB_DUTY() == null) ? 0 : getORG_JOB_DUTY().hashCode());
        result = prime * result + ((getNODE_ID() == null) ? 0 : getNODE_ID().hashCode());
        result = prime * result + (Arrays.hashCode(getPHOTO()));
        result = prime * result + ((getLEAVE_DESCRIPTION() == null) ? 0 : getLEAVE_DESCRIPTION().hashCode());
        result = prime * result + ((getFACE_PHOTO() == null) ? 0 : getFACE_PHOTO().hashCode());
        return result;
    }
}
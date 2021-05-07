package com.ujn.diaock.system.domain;

import java.math.BigDecimal;
import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 遥感案例对象 ujn_case
 *
 * @author diaock
 * @date 2021-05-07
 */
public class UjnCase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 案例ID */
    private Long caseId;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long groupId;

    /** 案例Name */
    @Excel(name = "案例Name")
    private String caseName;

    /** 案例Price */
    @Excel(name = "案例Price")
    private BigDecimal casePrice;

    /** 案例拇指图 */
    @Excel(name = "案例拇指图")
    private String caseThumb;

    /** 卫星号 */
    @Excel(name = "卫星号")
    private String statelliteid;

    /** 传感器号 */
    @Excel(name = "传感器号")
    private String sensorid;

    /** 成像时间 */
    @Excel(name = "成像时间")
    private String receivetime;

    /** 轨道圈号 */
    @Excel(name = "轨道圈号")
    private String orbitid;

    /** 数据生产方式 */
    @Excel(name = "数据生产方式")
    private String producetype;

    /** 景列号 */
    @Excel(name = "景列号")
    private String sceneid;

    /** 产品数据ID */
    @Excel(name = "产品数据ID")
    private String productid;

    /** 数据等级 */
    @Excel(name = "数据等级")
    private String productlevel;

    /** 产品质量 */
    @Excel(name = "产品质量")
    private String productquality;

    /** 产品质量报告 */
    @Excel(name = "产品质量报告")
    private String productqualityreport;

    /** 数据格式 */
    @Excel(name = "数据格式")
    private String productformat;

    /** 生产时间 */
    @Excel(name = "生产时间")
    private String producetime;

    /** 波段 */
    @Excel(name = "波段")
    private String bands;

    /** 景path */
    @Excel(name = "景path")
    private String scenepath;

    /** 景row */
    @Excel(name = "景row")
    private String scenerow;

    /** 卫星路径 */
    @Excel(name = "卫星路径")
    private String satpath;

    /** 卫星行 */
    @Excel(name = "卫星行")
    private String satrow;

    /** 条带景数目 */
    @Excel(name = "条带景数目")
    private String scenecount;

    /** 景漂移 */
    @Excel(name = "景漂移")
    private String sceneshift;

    /** 产品开始时间 */
    @Excel(name = "产品开始时间")
    private String starttime;

    /** 产品结束时间 */
    @Excel(name = "产品结束时间")
    private String endtime;

    /** 产品中间时间 */
    @Excel(name = "产品中间时间")
    private String centertime;

    /** 产品分辨率 */
    @Excel(name = "产品分辨率")
    private String imagegsd;

    /** 像素宽度 */
    @Excel(name = "像素宽度")
    private String widthinpixels;

    /** 像素高度 */
    @Excel(name = "像素高度")
    private String heightinpixels;

    /** 仪表宽度 */
    @Excel(name = "仪表宽度")
    private String widthinmeters;

    /** 仪表高度 */
    @Excel(name = "仪表高度")
    private String heightinmeters;

    /** 云覆盖量 */
    @Excel(name = "云覆盖量")
    private String cloudpercent;

    /** 质量信息 */
    @Excel(name = "质量信息")
    private String qualityinfo;

    /** 像素位 */
    @Excel(name = "像素位")
    private String pixelbits;

    /** 有效像素位 */
    @Excel(name = "有效像素位")
    private String validpixelbits;

    /** 相机侧视角 */
    @Excel(name = "相机侧视角")
    private String rollviewingangle;

    /** 相机前后视角 */
    @Excel(name = "相机前后视角")
    private String pitchviewingangle;

    /** 卫星平台滚动角 */
    @Excel(name = "卫星平台滚动角")
    private String rollsatelliteangle;

    /** 卫星平台平均俯视角 */
    @Excel(name = "卫星平台平均俯视角")
    private String pitchsatelliteangle;

    /** 卫星平台平均航偏角 */
    @Excel(name = "卫星平台平均航偏角")
    private String yawsatelliteangle;

    /** 太阳方位角 */
    @Excel(name = "太阳方位角")
    private String solarazimuth;

    /** 太阳高度角 */
    @Excel(name = "太阳高度角")
    private String solarzenith;

    /** 卫星方位角 */
    @Excel(name = "卫星方位角")
    private String satelliteazimuth;

    /** 卫星高度角 */
    @Excel(name = "卫星高度角")
    private String satellitezenith;

    /** 增益模式 */
    @Excel(name = "增益模式")
    private String gainmode;

    /** 积分时间 */
    @Excel(name = "积分时间")
    private String integrationtime;

    /** 积分级数 */
    @Excel(name = "积分级数")
    private String integrationlevel;

    /** 地球椭圆 */
    @Excel(name = "地球椭圆")
    private String earthellipsoid;

    /** 左上纬度 */
    @Excel(name = "左上纬度")
    private String topleftlatitude;

    /** 左上经度 */
    @Excel(name = "左上经度")
    private String topleftlongitude;

    /** 右上纬度 */
    @Excel(name = "右上纬度")
    private String toprightlatitude;

    /** 右上经度 */
    @Excel(name = "右上经度")
    private String toprightlongitude;

    /** 右下纬度 */
    @Excel(name = "右下纬度")
    private String bottomrightlatitude;

    /** 右下经度 */
    @Excel(name = "右下经度")
    private String bottomrightlongitude;

    /** 左下纬度 */
    @Excel(name = "左下纬度")
    private String bottomleftlatitude;

    /** 左下经度 */
    @Excel(name = "左下经度")
    private String bottomleftlongitude;

    public void setCaseId(Long caseId)
    {
        this.caseId = caseId;
    }

    public Long getCaseId()
    {
        return caseId;
    }
    public void setGroupId(Long groupId)
    {
        this.groupId = groupId;
    }

    public Long getGroupId()
    {
        return groupId;
    }
    public void setCaseName(String caseName)
    {
        this.caseName = caseName;
    }

    public String getCaseName()
    {
        return caseName;
    }
    public void setCasePrice(BigDecimal casePrice)
    {
        this.casePrice = casePrice;
    }

    public BigDecimal getCasePrice()
    {
        return casePrice;
    }
    public void setCaseThumb(String caseThumb)
    {
        this.caseThumb = caseThumb;
    }

    public String getCaseThumb()
    {
        return caseThumb;
    }
    public void setStatelliteid(String statelliteid)
    {
        this.statelliteid = statelliteid;
    }

    public String getStatelliteid()
    {
        return statelliteid;
    }
    public void setSensorid(String sensorid)
    {
        this.sensorid = sensorid;
    }

    public String getSensorid()
    {
        return sensorid;
    }
    public void setReceivetime(String receivetime)
    {
        this.receivetime = receivetime;
    }

    public String getReceivetime()
    {
        return receivetime;
    }
    public void setOrbitid(String orbitid)
    {
        this.orbitid = orbitid;
    }

    public String getOrbitid()
    {
        return orbitid;
    }
    public void setProducetype(String producetype)
    {
        this.producetype = producetype;
    }

    public String getProducetype()
    {
        return producetype;
    }
    public void setSceneid(String sceneid)
    {
        this.sceneid = sceneid;
    }

    public String getSceneid()
    {
        return sceneid;
    }
    public void setProductid(String productid)
    {
        this.productid = productid;
    }

    public String getProductid()
    {
        return productid;
    }
    public void setProductlevel(String productlevel)
    {
        this.productlevel = productlevel;
    }

    public String getProductlevel()
    {
        return productlevel;
    }
    public void setProductquality(String productquality)
    {
        this.productquality = productquality;
    }

    public String getProductquality()
    {
        return productquality;
    }
    public void setProductqualityreport(String productqualityreport)
    {
        this.productqualityreport = productqualityreport;
    }

    public String getProductqualityreport()
    {
        return productqualityreport;
    }
    public void setProductformat(String productformat)
    {
        this.productformat = productformat;
    }

    public String getProductformat()
    {
        return productformat;
    }
    public void setProducetime(String producetime)
    {
        this.producetime = producetime;
    }

    public String getProducetime()
    {
        return producetime;
    }
    public void setBands(String bands)
    {
        this.bands = bands;
    }

    public String getBands()
    {
        return bands;
    }
    public void setScenepath(String scenepath)
    {
        this.scenepath = scenepath;
    }

    public String getScenepath()
    {
        return scenepath;
    }
    public void setScenerow(String scenerow)
    {
        this.scenerow = scenerow;
    }

    public String getScenerow()
    {
        return scenerow;
    }
    public void setSatpath(String satpath)
    {
        this.satpath = satpath;
    }

    public String getSatpath()
    {
        return satpath;
    }
    public void setSatrow(String satrow)
    {
        this.satrow = satrow;
    }

    public String getSatrow()
    {
        return satrow;
    }
    public void setScenecount(String scenecount)
    {
        this.scenecount = scenecount;
    }

    public String getScenecount()
    {
        return scenecount;
    }
    public void setSceneshift(String sceneshift)
    {
        this.sceneshift = sceneshift;
    }

    public String getSceneshift()
    {
        return sceneshift;
    }
    public void setStarttime(String starttime)
    {
        this.starttime = starttime;
    }

    public String getStarttime()
    {
        return starttime;
    }
    public void setEndtime(String endtime)
    {
        this.endtime = endtime;
    }

    public String getEndtime()
    {
        return endtime;
    }
    public void setCentertime(String centertime)
    {
        this.centertime = centertime;
    }

    public String getCentertime()
    {
        return centertime;
    }
    public void setImagegsd(String imagegsd)
    {
        this.imagegsd = imagegsd;
    }

    public String getImagegsd()
    {
        return imagegsd;
    }
    public void setWidthinpixels(String widthinpixels)
    {
        this.widthinpixels = widthinpixels;
    }

    public String getWidthinpixels()
    {
        return widthinpixels;
    }
    public void setHeightinpixels(String heightinpixels)
    {
        this.heightinpixels = heightinpixels;
    }

    public String getHeightinpixels()
    {
        return heightinpixels;
    }
    public void setWidthinmeters(String widthinmeters)
    {
        this.widthinmeters = widthinmeters;
    }

    public String getWidthinmeters()
    {
        return widthinmeters;
    }
    public void setHeightinmeters(String heightinmeters)
    {
        this.heightinmeters = heightinmeters;
    }

    public String getHeightinmeters()
    {
        return heightinmeters;
    }
    public void setCloudpercent(String cloudpercent)
    {
        this.cloudpercent = cloudpercent;
    }

    public String getCloudpercent()
    {
        return cloudpercent;
    }
    public void setQualityinfo(String qualityinfo)
    {
        this.qualityinfo = qualityinfo;
    }

    public String getQualityinfo()
    {
        return qualityinfo;
    }
    public void setPixelbits(String pixelbits)
    {
        this.pixelbits = pixelbits;
    }

    public String getPixelbits()
    {
        return pixelbits;
    }
    public void setValidpixelbits(String validpixelbits)
    {
        this.validpixelbits = validpixelbits;
    }

    public String getValidpixelbits()
    {
        return validpixelbits;
    }
    public void setRollviewingangle(String rollviewingangle)
    {
        this.rollviewingangle = rollviewingangle;
    }

    public String getRollviewingangle()
    {
        return rollviewingangle;
    }
    public void setPitchviewingangle(String pitchviewingangle)
    {
        this.pitchviewingangle = pitchviewingangle;
    }

    public String getPitchviewingangle()
    {
        return pitchviewingangle;
    }
    public void setRollsatelliteangle(String rollsatelliteangle)
    {
        this.rollsatelliteangle = rollsatelliteangle;
    }

    public String getRollsatelliteangle()
    {
        return rollsatelliteangle;
    }
    public void setPitchsatelliteangle(String pitchsatelliteangle)
    {
        this.pitchsatelliteangle = pitchsatelliteangle;
    }

    public String getPitchsatelliteangle()
    {
        return pitchsatelliteangle;
    }
    public void setYawsatelliteangle(String yawsatelliteangle)
    {
        this.yawsatelliteangle = yawsatelliteangle;
    }

    public String getYawsatelliteangle()
    {
        return yawsatelliteangle;
    }
    public void setSolarazimuth(String solarazimuth)
    {
        this.solarazimuth = solarazimuth;
    }

    public String getSolarazimuth()
    {
        return solarazimuth;
    }
    public void setSolarzenith(String solarzenith)
    {
        this.solarzenith = solarzenith;
    }

    public String getSolarzenith()
    {
        return solarzenith;
    }
    public void setSatelliteazimuth(String satelliteazimuth)
    {
        this.satelliteazimuth = satelliteazimuth;
    }

    public String getSatelliteazimuth()
    {
        return satelliteazimuth;
    }
    public void setSatellitezenith(String satellitezenith)
    {
        this.satellitezenith = satellitezenith;
    }

    public String getSatellitezenith()
    {
        return satellitezenith;
    }
    public void setGainmode(String gainmode)
    {
        this.gainmode = gainmode;
    }

    public String getGainmode()
    {
        return gainmode;
    }
    public void setIntegrationtime(String integrationtime)
    {
        this.integrationtime = integrationtime;
    }

    public String getIntegrationtime()
    {
        return integrationtime;
    }
    public void setIntegrationlevel(String integrationlevel)
    {
        this.integrationlevel = integrationlevel;
    }

    public String getIntegrationlevel()
    {
        return integrationlevel;
    }
    public void setEarthellipsoid(String earthellipsoid)
    {
        this.earthellipsoid = earthellipsoid;
    }

    public String getEarthellipsoid()
    {
        return earthellipsoid;
    }
    public void setTopleftlatitude(String topleftlatitude)
    {
        this.topleftlatitude = topleftlatitude;
    }

    public String getTopleftlatitude()
    {
        return topleftlatitude;
    }
    public void setTopleftlongitude(String topleftlongitude)
    {
        this.topleftlongitude = topleftlongitude;
    }

    public String getTopleftlongitude()
    {
        return topleftlongitude;
    }
    public void setToprightlatitude(String toprightlatitude)
    {
        this.toprightlatitude = toprightlatitude;
    }

    public String getToprightlatitude()
    {
        return toprightlatitude;
    }
    public void setToprightlongitude(String toprightlongitude)
    {
        this.toprightlongitude = toprightlongitude;
    }

    public String getToprightlongitude()
    {
        return toprightlongitude;
    }
    public void setBottomrightlatitude(String bottomrightlatitude)
    {
        this.bottomrightlatitude = bottomrightlatitude;
    }

    public String getBottomrightlatitude()
    {
        return bottomrightlatitude;
    }
    public void setBottomrightlongitude(String bottomrightlongitude)
    {
        this.bottomrightlongitude = bottomrightlongitude;
    }

    public String getBottomrightlongitude()
    {
        return bottomrightlongitude;
    }
    public void setBottomleftlatitude(String bottomleftlatitude)
    {
        this.bottomleftlatitude = bottomleftlatitude;
    }

    public String getBottomleftlatitude()
    {
        return bottomleftlatitude;
    }
    public void setBottomleftlongitude(String bottomleftlongitude)
    {
        this.bottomleftlongitude = bottomleftlongitude;
    }

    public String getBottomleftlongitude()
    {
        return bottomleftlongitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("caseId", getCaseId())
            .append("groupId", getGroupId())
            .append("caseName", getCaseName())
            .append("casePrice", getCasePrice())
            .append("caseThumb", getCaseThumb())
            .append("statelliteid", getStatelliteid())
            .append("sensorid", getSensorid())
            .append("receivetime", getReceivetime())
            .append("orbitid", getOrbitid())
            .append("producetype", getProducetype())
            .append("sceneid", getSceneid())
            .append("productid", getProductid())
            .append("productlevel", getProductlevel())
            .append("productquality", getProductquality())
            .append("productqualityreport", getProductqualityreport())
            .append("productformat", getProductformat())
            .append("producetime", getProducetime())
            .append("bands", getBands())
            .append("scenepath", getScenepath())
            .append("scenerow", getScenerow())
            .append("satpath", getSatpath())
            .append("satrow", getSatrow())
            .append("scenecount", getScenecount())
            .append("sceneshift", getSceneshift())
            .append("starttime", getStarttime())
            .append("endtime", getEndtime())
            .append("centertime", getCentertime())
            .append("imagegsd", getImagegsd())
            .append("widthinpixels", getWidthinpixels())
            .append("heightinpixels", getHeightinpixels())
            .append("widthinmeters", getWidthinmeters())
            .append("heightinmeters", getHeightinmeters())
            .append("cloudpercent", getCloudpercent())
            .append("qualityinfo", getQualityinfo())
            .append("pixelbits", getPixelbits())
            .append("validpixelbits", getValidpixelbits())
            .append("rollviewingangle", getRollviewingangle())
            .append("pitchviewingangle", getPitchviewingangle())
            .append("rollsatelliteangle", getRollsatelliteangle())
            .append("pitchsatelliteangle", getPitchsatelliteangle())
            .append("yawsatelliteangle", getYawsatelliteangle())
            .append("solarazimuth", getSolarazimuth())
            .append("solarzenith", getSolarzenith())
            .append("satelliteazimuth", getSatelliteazimuth())
            .append("satellitezenith", getSatellitezenith())
            .append("gainmode", getGainmode())
            .append("integrationtime", getIntegrationtime())
            .append("integrationlevel", getIntegrationlevel())
            .append("earthellipsoid", getEarthellipsoid())
            .append("topleftlatitude", getTopleftlatitude())
            .append("topleftlongitude", getTopleftlongitude())
            .append("toprightlatitude", getToprightlatitude())
            .append("toprightlongitude", getToprightlongitude())
            .append("bottomrightlatitude", getBottomrightlatitude())
            .append("bottomrightlongitude", getBottomrightlongitude())
            .append("bottomleftlatitude", getBottomleftlatitude())
            .append("bottomleftlongitude", getBottomleftlongitude())
            .toString();
    }
}

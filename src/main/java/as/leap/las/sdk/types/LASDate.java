package as.leap.las.sdk.types;

import as.leap.las.sdk.DateUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * User: qinpeng
 * Date: 14-5-19
 * Time: 10:07
 */
public class LASDate {

  private static final String __type = LASKeyType.DATE.v();
  private String iso;

  public LASDate() {
  }

  public LASDate(Date date) {
    this.iso = DateUtils.encodeDate(date);
  }

  public String get__type() {
    return __type;
  }

  public String getIso() {
    return iso;
  }

  public void setIso(String iso) {
    this.iso = iso;
  }

  public LASDate from(Date date) throws ParseException {
    LASDate zCloudDate = new LASDate();
    zCloudDate.setIso(DateUtils.encodeDate(date));
    return zCloudDate;
  }

  public Long getTime() {
    return DateUtils.parseDate(this.iso).getTime();
  }

  public Map toMap() {
    Map map = new HashMap();
    map.put("__type", "Date");
    map.put("iso", iso);
    return map;
  }

}

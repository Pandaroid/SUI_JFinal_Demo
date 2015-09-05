package com.demo;

import com.jfinal.core.Controller;
import sun.org.mozilla.javascript.internal.json.JsonParser;

/**
 * Created by Pandaroid on 2015/8/26.
 */
public class TrainerController extends Controller {
    public void trainerList() {
        render("trainerList.html");
    }

    public void cancel_appoint() {
        renderJson("{\"code\": 0}");
    }

    public void appoint() {
        renderJson("{\"code\": 0}");
    }

    public void get_list() {
        // www.baidu.com\/img\/bd_logo1.png","name":"\u738b\u73b2","title":"\u767d\u83dc\u600e\u4e48\u505a\u7684","description":"\u5f88\u4e0d\u9519\u7684\u8425\u517b\u5e08","ctime":"0","originprice":"5","currentprice":"10","appoint_time":{"09-02":{"info":[{"id":"7","trainer_id":"1","date":"2015-09-02","starttime":"1441155600","endtime":"1441159200","isappoint":0}],"isappoint":0}}}],"code":0,"desc":"\u64cd\u4f5c\u6210\u529f","token":"DNkrQv2fXMr5h5THpDO4w91CYSuYmEdDlw9Dqo9hBMlPkR4g-XkItzKcoPCuAJ4rh3Wi6NvJNvfbNDQ_-5n0Ig%3D%3D
        // String jList = "{\"data\":[{\"id\":\"1\",\"avatar\":\"http://www.baidu.com/img/bd_logo1.png\",\"name\":\"\\u738b\\u73b2\",\"title\":\"\\u767d\\u83dc\\u600e\\u4e48\\u505a\\u7684\",\"description\":\"\\u5f88\\u4e0d\\u9519\\u7684\\u8425\\u517b\\u5e08\",\"ctime\":\"0\",\"originprice\":\"5\",\"currentprice\":\"10\",\"appoint_time\":{\"09-02\":{\"info\":[{\"id\":\"7\",\"trainer_id\":\"1\",\"date\":\"2015-09-02\",\"starttime\":\"1441155600\",\"endtime\":\"1441159200\",\"isappoint\":0}],\"isappoint\":0}}},{\"id\":\"2\",\"avatar\":\"http://gqianniu.alicdn.com/bao/uploaded/i4//tfscom/i3/TB10LfcHFXXXXXKXpXXXXXXXXXX_!!0-item_pic.jpg_250x250q60.jpg\",\"name\":\"\\u738b\\u73b2\\u73b2\",\"title\":\"\\u767d\\u83dc\\u600e\\u4e48\\u505a\\u7684\",\"description\":\"\\u5f88\\u4e0d\\u9519\\u7684\\u8425\\u517b\\u5e08\",\"ctime\":\"0\",\"originprice\":\"5\",\"currentprice\":\"10\",\"appoint_time\":{\"09-02\":{\"info\":[{\"id\":\"7\",\"trainer_id\":\"1\",\"date\":\"2015-09-02\",\"starttime\":\"1441155600\",\"endtime\":\"1441159200\",\"isappoint\":0}],\"isappoint\":0}}}],\"code\":0,\"desc\":\"\\u64cd\\u4f5c\\u6210\\u529f\",\"token\":\"DNkrQv2fXMr5h5THpDO4w91CYSuYmEdDlw9Dqo9hBMlPkR4g-XkItzKcoPCuAJ4rh3Wi6NvJNvfbNDQ_-5n0Ig%3D%3D\"}";
        String jList = "{\"data\":[{\"id\":\"3\",\"avatar\":\"http:\\/\\/oss.aliyuncs.com\\/qiuzhibao-imgbucket\\/trainer\\/16ed1c6abc4f035d1401c220460f29ec.png\",\"name\":\"\\u738b\\u9738\\u5929\",\"title\":\"\\u6807\\u98982\\u6807\\u9898\\u6807\\u98982\",\"description\":\"\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\",\"ctime\":\"1441336678\",\"originprice\":\"100\",\"currentprice\":\"2\",\"appoint_time\":{\"09-05\":{\"info\":[{\"id\":\"19\",\"trainer_id\":\"3\",\"date\":\"2015-09-05\",\"starttime\":\"1441404000\",\"endtime\":\"1441411200\",\"isappoint\":0},{\"id\":\"22\",\"trainer_id\":\"3\",\"date\":\"2015-09-05\",\"starttime\":\"1441436400\",\"endtime\":\"1441454400\",\"isappoint\":0}],\"isappoint\":0},\"09-06\":{\"info\":[{\"id\":\"20\",\"trainer_id\":\"3\",\"date\":\"2015-09-06\",\"starttime\":\"1441515600\",\"endtime\":\"1441530000\",\"isappoint\":0}],\"isappoint\":0},\"09-07\":{\"info\":[{\"id\":\"21\",\"trainer_id\":\"3\",\"date\":\"2015-09-07\",\"starttime\":\"1441584000\",\"endtime\":\"1441587600\",\"isappoint\":0}],\"isappoint\":0}}},{\"id\":\"2\",\"avatar\":\"http:\\/\\/oss.aliyuncs.com\\/qiuzhibao-imgbucket\\/trainer\\/fe9172fea36b4becc600261c15854bc2.png\",\"name\":\"\\u738b\\u5929\\u9738\",\"title\":\"\\u6807\\u98981\",\"description\":\"\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\\u63cf\\u8ff0\",\"ctime\":\"1441336380\",\"originprice\":\"100\",\"currentprice\":\"0\",\"appoint_time\":{\"09-05\":{\"info\":[{\"id\":\"15\",\"trainer_id\":\"2\",\"date\":\"2015-09-05\",\"starttime\":\"1441414800\",\"endtime\":\"1441418400\",\"isappoint\":0}],\"isappoint\":0},\"09-06\":{\"info\":[{\"id\":\"16\",\"trainer_id\":\"2\",\"date\":\"2015-09-06\",\"starttime\":\"1441497600\",\"endtime\":\"1441512000\",\"isappoint\":0},{\"id\":\"17\",\"trainer_id\":\"2\",\"date\":\"2015-09-06\",\"starttime\":\"1441512000\",\"endtime\":\"1441515600\",\"isappoint\":0}],\"isappoint\":0}}},{\"id\":\"1\",\"avatar\":\"http:\\/\\/www.baidu.com\\/img\\/bd_logo1.png\",\"name\":\"\\u738b\\u73b2\",\"title\":\"\\u767d\\u83dc\\u600e\\u4e48\\u505a\\u7684\",\"description\":\"\\u5f88\\u4e0d\\u9519\\u7684\\u8425\\u517b\\u5e08\",\"ctime\":\"0\",\"originprice\":\"5\",\"currentprice\":\"10\",\"appoint_time\":[]}],\"code\":0,\"desc\":\"\\u64cd\\u4f5c\\u6210\\u529f\",\"token\":\"DNkrQv2fXMr5h5THpDO4w91CYSuYmEdDlw9Dqo9hBMlPkR4g-XkItzKcoPCuAJ4rh3Wi6NvJNvfbNDQ_-5n0Ig%3D%3D\"}";
        renderJson(jList);
    }
}

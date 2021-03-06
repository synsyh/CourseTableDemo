package com.example.sunning.coursetabledemo;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Created by sunning on 16-12-17.
 */

public class CourseInfo {
    JSONArray allClm;
    JSONObject cntClm;
    JSONObject clmJson;

    String className;
    String classLoc;
    String classDay;

    List<Map<String, String>> alldata = new ArrayList<Map<String, String>>();
    Map<String, String> map = new HashMap<>();
    String txt = "{ \"StudentSemestersList\": [{ \"SemesterId\": \"20141\" }, { \"SemesterId\": \"20151\" }, { \"SemesterId\": \"20152\" }, { \"SemesterId\": \"20161\" }, { \"SemesterId\": \"20162\" }], \"StudentCurriculumDetailInfos\": [{ \"TeachClassId\": \"2014112009\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"高等数学（1）\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"4\", \"Mon\": \"\", \"Tue\": \"34\", \"Wed\": \"\", \"Thu\": \"12\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19850073\", \"TeacherOneName\": \"李友宝\", \"TeacherTwoName\": null, \"Address\": \"格物楼2栋2303\", \"ExamDate\": \"2015-01-10\", \"ExamTime\": \"3-4\", \"Remark\": \"\" }, { \"TeachClassId\": \"2014112012\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"高级语言程序设计\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"4\", \"Mon\": \"12\", \"Tue\": \"\", \"Wed\": \"56\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20041046\", \"TeacherOneName\": \"陆歌皓\", \"TeacherTwoName\": null, \"Address\": \"力行楼2503\", \"ExamDate\": \"2015-01-05\", \"ExamTime\": \"1-2\", \"Remark\": \"\" }, { \"TeachClassId\": \"2014112015\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"高级语言程序设计实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"34\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20041046\", \"TeacherOneName\": \"陆歌皓\", \"TeacherTwoName\": null, \"Address\": \"软件学院1327\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"\" }, { \"TeachClassId\": \"2014112020\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"离散数学\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"4\", \"Mon\": \"\", \"Tue\": \"56\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"12\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030863\", \"TeacherOneName\": \"胡盛\", \"TeacherTwoName\": null, \"Address\": \"力行楼2306\", \"ExamDate\": \"2015-01-07\", \"ExamTime\": \"5-6\", \"Remark\": \"\" }, { \"TeachClassId\": \"2014112024\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"模拟与数字电路\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"单78\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030827\", \"TeacherOneName\": \"刘春花\", \"TeacherTwoName\": null, \"Address\": \"力行楼4404\", \"ExamDate\": \"2015-01-05\", \"ExamTime\": \"5-6\", \"Remark\": \"\" }, { \"TeachClassId\": \"2014112027\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"模拟与数字电路实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"晚\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030827\", \"TeacherOneName\": \"刘春花\", \"TeacherTwoName\": null, \"Address\": \"软件学院1429\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"\" }, { \"TeachClassId\": \"2014112028\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"专业英语阅读与交流(1)\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"晚\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110076\", \"TeacherOneName\": \"张云春\", \"TeacherTwoName\": null, \"Address\": \"力行楼2303\", \"ExamDate\": \"2015-01-07\", \"ExamTime\": \"1-2\", \"Remark\": \"\" }, { \"TeachClassId\": \"20141A0456\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"英语读写(1)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"12\", \"Wed\": \"34\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020001\", \"TeacherOneName\": \"刘志成\", \"TeacherTwoName\": null, \"Address\": \"力行楼4310\", \"ExamDate\": \"2015-01-11\", \"ExamTime\": \"5-6\", \"Remark\": \"2014P01班（软件、物科）\" }, { \"TeachClassId\": \"20141A0553\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"英语听说(1)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"56\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19930031\", \"TeacherOneName\": \"赵安海\", \"TeacherTwoName\": null, \"Address\": \"力行楼4310\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"2014P01班（软件、物科）\" }, { \"TeachClassId\": \"20141A0634\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"大学生心理健康教育\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"单12\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110028\", \"TeacherOneName\": \"唐艳婷\", \"TeacherTwoName\": null, \"Address\": \"力行楼1301\", \"ExamDate\": \"2015-01-09\", \"ExamTime\": \"3-4\", \"Remark\": \"05班（物科、软件）\" }, { \"TeachClassId\": \"20141A0664\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"思想道德修养与法律基础\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"78\", \"Tue\": \"\", \"Wed\": \"双12\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19870066\", \"TeacherOneName\": \"陈江洪\", \"TeacherTwoName\": null, \"Address\": \"力行楼1205\", \"ExamDate\": \"2015-01-06\", \"ExamTime\": \"3-4\", \"Remark\": \"04班（物科、软件）\" }, { \"TeachClassId\": \"20141A0704\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"化学科学与工程学院·药学院\", \"TeachClassName\": \"形势与政策（1）\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"0.5\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"第10周5第11周5第12周5第13周5666677778888\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030908\", \"TeacherOneName\": \"赵杰\", \"TeacherTwoName\": null, \"Address\": \"力行楼1202\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"02班（化工、软件、生科、生态学与环境、物科、资环），第10、11、12、13周上课\" }, { \"TeachClassId\": \"20141A0756\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"体育（1）\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"56\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": null, \"TeacherOneName\": null, \"TeacherTwoName\": null, \"Address\": \"楠苑体育场\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"软件\" }, { \"TeachClassId\": \"20141A0826\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"军事理论\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"12\", \"Sun\": \"\", \"TeacherOneId\": \"99990006\", \"TeacherOneName\": \"王涛\", \"TeacherTwoName\": null, \"Address\": \"文汇楼2栋2218\", \"ExamDate\": \"2015-01-08\", \"ExamTime\": \"3-4\", \"Remark\": \"02班（软件、物科）\" }, { \"TeachClassId\": \"20141A0869\", \"SemesterId\": \"20141\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"军事技能训练\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": null, \"TeacherOneName\": null, \"TeacherTwoName\": null, \"Address\": \"\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"软件\" }, { \"TeachClassId\": \"2015112058\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"综合技能实践（2）\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020626\", \"TeacherOneName\": \"金鑫\", \"TeacherTwoName\": null, \"Address\": \"\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2015112061\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"数据结构\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"78\", \"Tue\": \"\", \"Wed\": \"双12\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19850164\", \"TeacherOneName\": \"柳青\", \"TeacherTwoName\": null, \"Address\": \"星期一78呈贡校区力行楼2406,全星期三双12呈贡校区力行楼2505\", \"ExamDate\": \"2016-01-07\", \"ExamTime\": \"5-6\", \"Remark\": null }, { \"TeachClassId\": \"2015112062\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"数据结构实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"56\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020626\", \"TeacherOneName\": \"金鑫\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区软件学院1329\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2015112065\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"网络工程（卓越工程师）\", \"TeachClassName\": \"专业英语阅读与交流(2)\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"56\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20060010\", \"TeacherOneName\": \"李浩\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2406\", \"ExamDate\": \"2016-01-07\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2015112084\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"数字媒体技术\", \"TeachClassName\": \"大学物理\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"78\", \"Fri\": \"双12\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20050039\", \"TeacherOneName\": \"许红星\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2303\", \"ExamDate\": \"2016-01-06\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2015112088\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"数字媒体技术\", \"TeachClassName\": \"计算机网络原理\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"晚\", \"Wed\": \"\", \"Thu\": \"双56\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030827\", \"TeacherOneName\": \"刘春花\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4406\", \"ExamDate\": \"2016-01-08\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2015112089\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"数字媒体技术\", \"TeachClassName\": \"计算机网络原理实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"晚\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030827\", \"TeacherOneName\": \"刘春花\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区软件学院1329\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2015112107\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"数字媒体技术\", \"TeachClassName\": \"大学物理实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"34\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20050039\", \"TeacherOneName\": \"许红星\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区软件学院1428\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2015192033\", \"SemesterId\": \"20151\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"大学国文\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"人文科学类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20130075\", \"TeacherOneName\": \"符树芬\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1403\", \"ExamDate\": \"2016-01-02\", \"ExamTime\": \"3-4\", \"Remark\": \"17班 周三下午7-8节\" }, { \"TeachClassId\": \"2015192261\", \"SemesterId\": \"20151\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"化妆品原理与应用\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"自然科学类\", \"Credit\": \"2\", \"Mon\": \"78\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19930084\", \"TeacherOneName\": \"李全\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1605\", \"ExamDate\": \"2015-12-29\", \"ExamTime\": \"9-10\", \"Remark\": null }, { \"TeachClassId\": \"2015192422\", \"SemesterId\": \"20151\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"从爱因斯坦到霍金的宇宙\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"自然科学类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020684\", \"TeacherOneName\": \"姜泽军\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼2栋2207\", \"ExamDate\": \"2015-12-30\", \"ExamTime\": \"7-8\", \"Remark\": \"超星尔雅通识课，线下观看视频+见面课讨论\" }, { \"TeachClassId\": \"20151A0077\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程\", \"TeachClassName\": \"毛泽东思想和中国特色社会主义理论体系概论(上)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"78\", \"Wed\": \"\", \"Thu\": \"单12\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19860090\", \"TeacherOneName\": \"杨仕\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼1202\", \"ExamDate\": \"2016-01-04\", \"ExamTime\": \"3-4\", \"Remark\": \"10班（软件、物科）\" }, { \"TeachClassId\": \"20151A0276\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程\", \"TeachClassName\": \"中国近现代史纲要\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"12\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110021\", \"TeacherOneName\": \"张春燕\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼1202\", \"ExamDate\": \"2016-01-05\", \"ExamTime\": \"5-6\", \"Remark\": \"10班（软件、物科）\" }, { \"TeachClassId\": \"20151A0409\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程\", \"TeachClassName\": \"英语读写(3)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"56\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020001\", \"TeacherOneName\": \"刘志成\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2303\", \"ExamDate\": \"2016-01-09\", \"ExamTime\": \"5-6\", \"Remark\": \"2014P18班（软件、物科）\" }, { \"TeachClassId\": \"20151A0461\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程\", \"TeachClassName\": \"英语听说(3)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"34\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020001\", \"TeacherOneName\": \"刘志成\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2303\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"2014P18班（软件、物科）\" }, { \"TeachClassId\": \"20151A0553\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"化学科学与工程学院·药学院\", \"TeachClassName\": \"形势与政策(3)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"0.5\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"第6周5第7周5第8周5第9周5666677778888\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20090072\", \"TeacherOneName\": \"胡玉荣\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼1202\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"09班（软件、物科、生科、生态学与环境、化工、资环）第6、7、8、9周上课\" }, { \"TeachClassId\": \"20151A1145\", \"SemesterId\": \"20151\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"公共体育\", \"TeachClassName\": \"网球(二)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"34\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19850104\", \"TeacherOneName\": \"胡晓峰\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区楠苑网球场\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"男生选课\" }, { \"TeachClassId\": \"2015212006\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"数字媒体技术\", \"TeachClassName\": \"高等数学（2）\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"4\", \"Mon\": \"\", \"Tue\": \"34\", \"Wed\": \"\", \"Thu\": \"12\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19850073\", \"TeacherOneName\": \"李友宝\", \"TeacherTwoName\": null, \"Address\": \"格物楼2栋2304\", \"ExamDate\": \"2015-07-09\", \"ExamTime\": \"3-4\", \"Remark\": \"\" }, { \"TeachClassId\": \"2015212010\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"数字媒体技术\", \"TeachClassName\": \"专业英语听力\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20041046\", \"TeacherOneName\": \"陆歌皓\", \"TeacherTwoName\": null, \"Address\": \"格物楼1栋1304\", \"ExamDate\": \"2015-07-09\", \"ExamTime\": \"7-8\", \"Remark\": \"\" }, { \"TeachClassId\": \"2015212022\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"计算机组成原理与汇编语言\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"78\", \"Wed\": \"\", \"Thu\": \"双34\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020629\", \"TeacherOneName\": \"王逍\", \"TeacherTwoName\": null, \"Address\": \"力行楼4404\", \"ExamDate\": \"2015-07-08\", \"ExamTime\": \"5-6\", \"Remark\": \"\" }, { \"TeachClassId\": \"2015212024\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"计算机组成原理与汇编语言实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"晚\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020629\", \"TeacherOneName\": \"王逍\", \"TeacherTwoName\": null, \"Address\": \"软件学院1428\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"\" }, { \"TeachClassId\": \"2015212031\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"工程数学\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"34\", \"Tue\": \"\", \"Wed\": \"双56\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20090064\", \"TeacherOneName\": \"郁湧\", \"TeacherTwoName\": null, \"Address\": \"力行楼4406\", \"ExamDate\": \"2015-07-07\", \"ExamTime\": \"5-6\", \"Remark\": \"\" }, { \"TeachClassId\": \"2015212041\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"综合技能实践（1）\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030909\", \"TeacherOneName\": \"朱艳萍\", \"TeacherTwoName\": null, \"Address\": \"\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"\" }, { \"TeachClassId\": \"2015292104\", \"SemesterId\": \"20152\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"生物学基础实验\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"自然科学类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"234\", \"TeacherOneId\": \"19920064\", \"TeacherOneName\": \"程立忠\", \"TeacherTwoName\": null, \"Address\": \"生科学院1216\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"星期日1234\" }, { \"TeachClassId\": \"2015292110\", \"SemesterId\": \"20152\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"日本历史与文化\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"人文科学类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"晚\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110051\", \"TeacherOneName\": \"王涛\", \"TeacherTwoName\": null, \"Address\": \"格物楼1栋1503\", \"ExamDate\": \"2015-07-01\", \"ExamTime\": \"9-10\", \"Remark\": \"2班周三910节\" }, { \"TeachClassId\": \"2015292300\", \"SemesterId\": \"20152\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"网页设计与制作\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"体育与技术技能类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"78\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20010394\", \"TeacherOneName\": \"丁海燕\", \"TeacherTwoName\": null, \"Address\": \"文汇楼3栋3205\", \"ExamDate\": \"2015-07-02\", \"ExamTime\": \"9-10\", \"Remark\": \"1班\" }, { \"TeachClassId\": \"20152A0047\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"英语读写(2)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"12\", \"Wed\": \"34\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020001\", \"TeacherOneName\": \"刘志成\", \"TeacherTwoName\": null, \"Address\": \"力行楼4310\", \"ExamDate\": \"2015-07-11\", \"ExamTime\": \"5-6\", \"Remark\": \"2014P01班（软件、物科）\" }, { \"TeachClassId\": \"20152A0114\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"马克思主义基本原理概论\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"78\", \"Tue\": \"\", \"Wed\": \"双12\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19960050\", \"TeacherOneName\": \"蒋红\", \"TeacherTwoName\": null, \"Address\": \"力行楼1202\", \"ExamDate\": \"2015-07-06\", \"ExamTime\": \"3-4\", \"Remark\": \"02班（物科、软件）\" }, { \"TeachClassId\": \"20152A0268\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"英语听说(2)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"56\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19930031\", \"TeacherOneName\": \"赵安海\", \"TeacherTwoName\": null, \"Address\": \"力行楼4310\", \"ExamDate\": \"2015-07-11\", \"ExamTime\": \"5-6\", \"Remark\": \"2014P01班（软件、物科）\" }, { \"TeachClassId\": \"20152A0566\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"化学科学与工程学院·药学院\", \"TeachClassName\": \"形势与政策（2）\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"0.5\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"第10周5第11周5第12周5第13周5666677778888\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110028\", \"TeacherOneName\": \"唐艳婷\", \"TeacherTwoName\": null, \"Address\": \"力行楼1305\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"08班（化工、软件、生科、生环、物科、资环）第10、11、12、13周上课\" }, { \"TeachClassId\": \"20152A0844\", \"SemesterId\": \"20152\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"公共体育\", \"TeachClassName\": \"体质训练(一)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19940062\", \"TeacherOneName\": \"熊刚\", \"TeacherTwoName\": null, \"Address\": \"楠苑田径场\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"女生选课\" }, { \"TeachClassId\": \"2016112032\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"信息安全\", \"TeachClassName\": \"应用安全前沿专题\", \"TeachClassNatureCode\": \"04\", \"TeachClassNature\": \"专选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"34\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"99040506\", \"TeacherOneName\": \"郑智捷\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4502\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112034\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"日语口语提高(1)\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"外语应用提高类\", \"Credit\": \"2\", \"Mon\": \"12\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"99080302\", \"TeacherOneName\": \"外聘F\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1108\", \"ExamDate\": \"2016-12-26\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2016112037\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"算法设计与分析\", \"TeachClassNatureCode\": \"06\", \"TeachClassNature\": \"院选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"34\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030818\", \"TeacherOneName\": \"何婧\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4404\", \"ExamDate\": \"2017-01-04\", \"ExamTime\": \"5-6\", \"Remark\": null }, { \"TeachClassId\": \"2016112040\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件学院\", \"TeachClassName\": \"基于Java的XML技术及应用\", \"TeachClassNatureCode\": \"06\", \"TeachClassNature\": \"院选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"78\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20060010\", \"TeacherOneName\": \"李浩\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1307\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112067\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"Java程序设计\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"34\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20040982\", \"TeacherOneName\": \"李劲\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1104\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112068\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"Java程序设计实验\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"晚\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20040982\", \"TeacherOneName\": \"李劲\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区软件学院1428\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112069\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"软件工程\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"12\", \"Fri\": \"单12\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19940022\", \"TeacherOneName\": \"李彤\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2303\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112070\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"软件工程实验\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"56\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20090075\", \"TeacherOneName\": \"赵娜\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区软件学院1431\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112071\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"软件测试技术\", \"TeachClassNatureCode\": \"04\", \"TeachClassNature\": \"专选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"34\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20130084\", \"TeacherOneName\": \"刘金卓\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1104\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112073\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"软件项目管理\", \"TeachClassNatureCode\": \"04\", \"TeachClassNature\": \"专选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"78\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20090075\", \"TeacherOneName\": \"赵娜\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2305\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112074\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"设计模式\", \"TeachClassNatureCode\": \"04\", \"TeachClassNature\": \"专选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"34\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20100055\", \"TeacherOneName\": \"刘俊晖\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1104\", \"ExamDate\": \"2017-01-03\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2016112076\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"专业实训（2）\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"567\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030798\", \"TeacherOneName\": \"康雁\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4406\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016112157\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程\", \"TeachClassName\": \"数据挖掘\", \"TeachClassNatureCode\": \"04\", \"TeachClassNature\": \"专选\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"56\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20140008\", \"TeacherOneName\": \"杨云\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4504\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016192126\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"中外电影艺术赏析\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"艺术类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20050067\", \"TeacherOneName\": \"付云仙\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼1栋1506\", \"ExamDate\": \"2016-12-28\", \"ExamTime\": \"9-10\", \"Remark\": \"周三78节\" }, { \"TeachClassId\": \"2016192184\", \"SemesterId\": \"20161\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"非洲政治与中非关系\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"社会科学类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"晚\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110051\", \"TeacherOneName\": \"王涛\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区文汇楼2栋2101\", \"ExamDate\": \"2016-12-28\", \"ExamTime\": \"9-10\", \"Remark\": \"呈贡，周四9、10\" }, { \"TeachClassId\": \"2016212047\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"信息安全\", \"TeachClassName\": \"信息安全学\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"56\", \"Thu\": \"双12\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"99040506\", \"TeacherOneName\": \"郑智捷\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4308\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016212053\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"操作系统原理\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"12\", \"Wed\": \"单12\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19940022\", \"TeacherOneName\": \"李彤\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4410\", \"ExamDate\": \"2016-07-04\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2016212054\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"数据库原理与实用技术\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"34\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"单34\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19960011\", \"TeacherOneName\": \"包崇明\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4610\", \"ExamDate\": \"2016-07-06\", \"ExamTime\": \"5-6\", \"Remark\": null }, { \"TeachClassId\": \"2016212055\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"数据库原理与实用技术实验\", \"TeachClassNatureCode\": \"05\", \"TeachClassNature\": \"院必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"56\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19960011\", \"TeacherOneName\": \"包崇明\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区软件学院1429\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"软件学院1429\" }, { \"TeachClassId\": \"2016212057\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"专业实训(1)\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"567\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20110016\", \"TeacherOneName\": \"代飞\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4310\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": null }, { \"TeachClassId\": \"2016212058\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程（卓越工程师）\", \"TeachClassName\": \"专业英语写作\", \"TeachClassNatureCode\": \"03\", \"TeachClassNature\": \"专必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"34\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20030798\", \"TeacherOneName\": \"康雁\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼4510\", \"ExamDate\": \"2016-07-07\", \"ExamTime\": \"1-2\", \"Remark\": null }, { \"TeachClassId\": \"2016292087\", \"SemesterId\": \"20162\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"中外艺术精品赏析\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"艺术类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"78\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20050067\", \"TeacherOneName\": \"付云仙\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼2栋2304\", \"ExamDate\": \"2016-06-29\", \"ExamTime\": \"9-10\", \"Remark\": \"周三7、8节\" }, { \"TeachClassId\": \"2016292315\", \"SemesterId\": \"20162\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"通识教育课程\", \"TeachClassName\": \"大学生职业生涯规划\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"体育与技术技能类\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"78\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20041030\", \"TeacherOneName\": \"沐炜\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区格物楼2栋2204\", \"ExamDate\": \"2016-06-28\", \"ExamTime\": \"9-10\", \"Remark\": \"请与该教师另一门大学生职业生涯规划安排在同一天\" }, { \"TeachClassId\": \"2016292444\", \"SemesterId\": \"20162\", \"Grade\": \"2013\", \"Season\": \"1\", \"Major\": \"慕课课程\", \"TeachClassName\": \"经济地理与企业兴衰\", \"TeachClassNatureCode\": \"02\", \"TeachClassNature\": \"素选\", \"TeachClassType\": \"社会科学类\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20090126\", \"TeacherOneName\": \"崔庆波\", \"TeacherTwoName\": null, \"Address\": \"\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"慕课在线视频课程，线上观看视频+见面课讨论\" }, { \"TeachClassId\": \"20162A0261\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"软件工程\", \"TeachClassName\": \"毛泽东思想和中国特色社会主义理论体系概论(下)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"3\", \"Mon\": \"\", \"Tue\": \"78\", \"Wed\": \"\", \"Thu\": \"单12\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"19860090\", \"TeacherOneName\": \"杨仕\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼1201\", \"ExamDate\": \"2016-07-05\", \"ExamTime\": \"3-4\", \"Remark\": \"09班（软件、物科）\" }, { \"TeachClassId\": \"20162A0451\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"材料化学\", \"TeachClassName\": \"英语读写(4)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"2\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"34\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020001\", \"TeacherOneName\": \"刘志成\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2303\", \"ExamDate\": \"2016-07-08\", \"ExamTime\": \"5-6\", \"Remark\": \"2014P18班（软件、物科）\" }, { \"TeachClassId\": \"20162A0513\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"化学科学与工程学院·药学院\", \"TeachClassName\": \"形势与政策（4）\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"0.5\", \"Mon\": \"\", \"Tue\": \"\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"第5周5第6周5第7周5第8周5666677778888\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20090072\", \"TeacherOneName\": \"胡玉荣\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼1201\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"07班（软件、物科、生科、生态、化工、资环）\" }, { \"TeachClassId\": \"20162A0654\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"物理学\", \"TeachClassName\": \"英语听说(4)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"56\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20020001\", \"TeacherOneName\": \"刘志成\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区力行楼2303\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"2014P18班（软件、物科）\" }, { \"TeachClassId\": \"20162A0888\", \"SemesterId\": \"20162\", \"Grade\": \"2014\", \"Season\": \"1\", \"Major\": \"公共体育\", \"TeachClassName\": \"网球(三)\", \"TeachClassNatureCode\": \"01\", \"TeachClassNature\": \"公必\", \"TeachClassType\": \"其它\", \"Credit\": \"1\", \"Mon\": \"\", \"Tue\": \"34\", \"Wed\": \"\", \"Thu\": \"\", \"Fri\": \"\", \"Sat\": \"\", \"Sun\": \"\", \"TeacherOneId\": \"20140061\", \"TeacherOneName\": \"代迪\", \"TeacherTwoName\": null, \"Address\": \"呈贡校区楠苑网球场\", \"ExamDate\": null, \"ExamTime\": null, \"Remark\": \"男生选课 \" }], \"TeacherList\": { \"Teachers\": [{ \"TeacherId\": \"19850073\", \"TeacherName\": \"李友宝\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"19850104\", \"TeacherName\": \"胡晓峰\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"19850164\", \"TeacherName\": \"柳青\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"19860090\", \"TeacherName\": \"杨仕\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"19870066\", \"TeacherName\": \"陈江洪\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"19920064\", \"TeacherName\": \"程立忠\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"19930031\", \"TeacherName\": \"赵安海\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"19930084\", \"TeacherName\": \"李全\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"19940022\", \"TeacherName\": \"李彤\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"19940062\", \"TeacherName\": \"熊刚\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"19960011\", \"TeacherName\": \"包崇明\", \"TeachicalTitleId\": \"613\" }, { \"TeacherId\": \"19960050\", \"TeacherName\": \"蒋红\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"20010394\", \"TeacherName\": \"丁海燕\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20020001\", \"TeacherName\": \"刘志成\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20020626\", \"TeacherName\": \"金鑫\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20020629\", \"TeacherName\": \"王逍\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20020684\", \"TeacherName\": \"姜泽军\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"20030798\", \"TeacherName\": \"康雁\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20030818\", \"TeacherName\": \"何婧\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20030827\", \"TeacherName\": \"刘春花\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20030863\", \"TeacherName\": \"胡盛\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20030908\", \"TeacherName\": \"赵杰\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20030909\", \"TeacherName\": \"朱艳萍\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20040982\", \"TeacherName\": \"李劲\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20041030\", \"TeacherName\": \"沐炜\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20041046\", \"TeacherName\": \"陆歌皓\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20050039\", \"TeacherName\": \"许红星\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20050067\", \"TeacherName\": \"付云仙\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20060010\", \"TeacherName\": \"李浩\", \"TeachicalTitleId\": \"011\" }, { \"TeacherId\": \"20090064\", \"TeacherName\": \"郁湧\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20090072\", \"TeacherName\": \"胡玉荣\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20090075\", \"TeacherName\": \"赵娜\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20090126\", \"TeacherName\": \"崔庆波\", \"TeachicalTitleId\": \"623\" }, { \"TeacherId\": \"20100055\", \"TeacherName\": \"刘俊晖\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20110016\", \"TeacherName\": \"代飞\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20110021\", \"TeacherName\": \"张春燕\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20110028\", \"TeacherName\": \"唐艳婷\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20110051\", \"TeacherName\": \"王涛\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20110076\", \"TeacherName\": \"张云春\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20130075\", \"TeacherName\": \"符树芬\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20130084\", \"TeacherName\": \"刘金卓\", \"TeachicalTitleId\": \"013\" }, { \"TeacherId\": \"20140008\", \"TeacherName\": \"杨云\", \"TeachicalTitleId\": \"012\" }, { \"TeacherId\": \"20140061\", \"TeacherName\": \"代迪\", \"TeachicalTitleId\": \"014\" }, { \"TeacherId\": \"99040506\", \"TeacherName\": \"郑智捷\", \"TeachicalTitleId\": \"   \" }, { \"TeacherId\": \"99080302\", \"TeacherName\": \"外聘F\", \"TeachicalTitleId\": \"   \" }, { \"TeacherId\": \"99990006\", \"TeacherName\": \"王涛\", \"TeachicalTitleId\": \"   \" }], \"TeachicalTitles\": [{ \"TechnicalTitleCode\": \"011\", \"TechnicalTitleName\": \"教授\", \"TechnicalTitleShort\": \"教授\" }, { \"TechnicalTitleCode\": \"012\", \"TechnicalTitleName\": \"副教授\", \"TechnicalTitleShort\": \"副教授\" }, { \"TechnicalTitleCode\": \"013\", \"TechnicalTitleName\": \"讲师(高校)\", \"TechnicalTitleShort\": \"讲师\" }, { \"TechnicalTitleCode\": \"014\", \"TechnicalTitleName\": \"助教(高校)\", \"TechnicalTitleShort\": \"助教\" }, { \"TechnicalTitleCode\": \"613\", \"TechnicalTitleName\": \"助理研究员(自然科学)\", \"TechnicalTitleShort\": \"助理研究员\" }, { \"TechnicalTitleCode\": \"623\", \"TechnicalTitleName\": \"助理研究员(社会科学)\", \"TechnicalTitleShort\": \"助理研究员\" }] }, \"ExamAddressList\": { \"ExamClassroomId\": [{ \"TeachClassId\": \"2014112009\", \"ClassroomId\": \"05030031\" }, { \"TeachClassId\": \"2014112012\", \"ClassroomId\": \"05030067\" }, { \"TeachClassId\": \"2014112012\", \"ClassroomId\": \"05030068\" }, { \"TeachClassId\": \"2014112020\", \"ClassroomId\": \"05030019\" }, { \"TeachClassId\": \"2014112020\", \"ClassroomId\": \"05030040\" }, { \"TeachClassId\": \"2014112024\", \"ClassroomId\": \"05030056\" }, { \"TeachClassId\": \"2014112024\", \"ClassroomId\": \"05030057\" }, { \"TeachClassId\": \"2014112028\", \"ClassroomId\": \"05030026\" }, { \"TeachClassId\": \"2014112028\", \"ClassroomId\": \"05030046\" }, { \"TeachClassId\": \"20141A0634\", \"ClassroomId\": \"05030034\" }, { \"TeachClassId\": \"20141A0634\", \"ClassroomId\": \"05030037\" }, { \"TeachClassId\": \"20141A0634\", \"ClassroomId\": \"05030039\" }, { \"TeachClassId\": \"20141A0664\", \"ClassroomId\": \"05030043\" }, { \"TeachClassId\": \"20141A0664\", \"ClassroomId\": \"05030058\" }, { \"TeachClassId\": \"20141A0664\", \"ClassroomId\": \"05030059\" }, { \"TeachClassId\": \"20141A0826\", \"ClassroomId\": \"05030043\" }, { \"TeachClassId\": \"20141A0826\", \"ClassroomId\": \"05030056\" }, { \"TeachClassId\": \"20141A0826\", \"ClassroomId\": \"05030057\" }, { \"TeachClassId\": \"20141A0826\", \"ClassroomId\": \"05030058\" }, { \"TeachClassId\": \"20141A0826\", \"ClassroomId\": \"05030059\" }, { \"TeachClassId\": \"20141A0826\", \"ClassroomId\": \"05030070\" }, { \"TeachClassId\": \"2015112061\", \"ClassroomId\": \"05030016\" }, { \"TeachClassId\": \"2015112065\", \"ClassroomId\": \"05030021\" }, { \"TeachClassId\": \"2015112065\", \"ClassroomId\": \"05030024\" }, { \"TeachClassId\": \"2015112084\", \"ClassroomId\": \"05030002\" }, { \"TeachClassId\": \"2015112088\", \"ClassroomId\": \"05020001\" }, { \"TeachClassId\": \"2015112088\", \"ClassroomId\": \"05020002\" }, { \"TeachClassId\": \"2015192033\", \"ClassroomId\": \"05030030\" }, { \"TeachClassId\": \"2015192261\", \"ClassroomId\": \"05030034\" }, { \"TeachClassId\": \"2015192261\", \"ClassroomId\": \"05030038\" }, { \"TeachClassId\": \"20151A0077\", \"ClassroomId\": \"05030026\" }, { \"TeachClassId\": \"20151A0077\", \"ClassroomId\": \"05030045\" }, { \"TeachClassId\": \"20151A0077\", \"ClassroomId\": \"05030046\" }, { \"TeachClassId\": \"20151A0276\", \"ClassroomId\": \"05030026\" }, { \"TeachClassId\": \"20151A0276\", \"ClassroomId\": \"05030045\" }, { \"TeachClassId\": \"20151A0276\", \"ClassroomId\": \"05030046\" }, { \"TeachClassId\": \"2015212006\", \"ClassroomId\": \"05030001\" }, { \"TeachClassId\": \"2015212010\", \"ClassroomId\": \"05070020\" }, { \"TeachClassId\": \"2015212022\", \"ClassroomId\": \"05010023\" }, { \"TeachClassId\": \"2015212022\", \"ClassroomId\": \"05010024\" }, { \"TeachClassId\": \"2015212031\", \"ClassroomId\": \"05030028\" }, { \"TeachClassId\": \"2015212031\", \"ClassroomId\": \"05030029\" }, { \"TeachClassId\": \"2015292110\", \"ClassroomId\": \"05020032\" }, { \"TeachClassId\": \"2015292110\", \"ClassroomId\": \"05020034\" }, { \"TeachClassId\": \"20152A0114\", \"ClassroomId\": \"05030036\" }, { \"TeachClassId\": \"20152A0114\", \"ClassroomId\": \"05030038\" }, { \"TeachClassId\": \"20152A0114\", \"ClassroomId\": \"05030040\" }, { \"TeachClassId\": \"2016112034\", \"ClassroomId\": \"05020001\" }, { \"TeachClassId\": \"2016112034\", \"ClassroomId\": \"05020002\" }, { \"TeachClassId\": \"2016112037\", \"ClassroomId\": \"05030053\" }, { \"TeachClassId\": \"2016112074\", \"ClassroomId\": \"05030001\" }, { \"TeachClassId\": \"2016192184\", \"ClassroomId\": \"05070003\" }, { \"TeachClassId\": \"2016192184\", \"ClassroomId\": \"05070005\" }, { \"TeachClassId\": \"2016212053\", \"ClassroomId\": \"05030022\" }, { \"TeachClassId\": \"2016212053\", \"ClassroomId\": \"05030024\" }, { \"TeachClassId\": \"2016212054\", \"ClassroomId\": \"05030059\" }, { \"TeachClassId\": \"2016212058\", \"ClassroomId\": \"05030056\" }, { \"TeachClassId\": \"2016292315\", \"ClassroomId\": \"05030030\" }, { \"TeachClassId\": \"20162A0261\", \"ClassroomId\": \"05030021\" }, { \"TeachClassId\": \"20162A0261\", \"ClassroomId\": \"05030023\" }, { \"TeachClassId\": \"20162A0261\", \"ClassroomId\": \"05030025\" }], \"Classroom\": [{ \"ClassroomId\": \"05010023\", \"ClassroomName\": \"格物楼2栋2406\" }, { \"ClassroomId\": \"05010024\", \"ClassroomName\": \"格物楼2栋2405\" }, { \"ClassroomId\": \"05020001\", \"ClassroomName\": \"格物楼1栋1107\" }, { \"ClassroomId\": \"05020002\", \"ClassroomName\": \"格物楼1栋1108\" }, { \"ClassroomId\": \"05020032\", \"ClassroomName\": \"格物楼1栋1505\" }, { \"ClassroomId\": \"05020034\", \"ClassroomName\": \"格物楼1栋1503\" }, { \"ClassroomId\": \"05030001\", \"ClassroomName\": \"力行楼4108\" }, { \"ClassroomId\": \"05030002\", \"ClassroomName\": \"力行楼4107\" }, { \"ClassroomId\": \"05030016\", \"ClassroomName\": \"力行楼1202\" }, { \"ClassroomId\": \"05030019\", \"ClassroomName\": \"力行楼4308\" }, { \"ClassroomId\": \"05030021\", \"ClassroomName\": \"力行楼4306\" }, { \"ClassroomId\": \"05030022\", \"ClassroomName\": \"力行楼4309\" }, { \"ClassroomId\": \"05030023\", \"ClassroomName\": \"力行楼4304\" }, { \"ClassroomId\": \"05030024\", \"ClassroomName\": \"力行楼4307\" }, { \"ClassroomId\": \"05030025\", \"ClassroomName\": \"力行楼4302\" }, { \"ClassroomId\": \"05030026\", \"ClassroomName\": \"力行楼2306\" }, { \"ClassroomId\": \"05030028\", \"ClassroomName\": \"力行楼2304\" }, { \"ClassroomId\": \"05030029\", \"ClassroomName\": \"力行楼2303\" }, { \"ClassroomId\": \"05030030\", \"ClassroomName\": \"力行楼1301\" }, { \"ClassroomId\": \"05030031\", \"ClassroomName\": \"力行楼1302\" }, { \"ClassroomId\": \"05030034\", \"ClassroomName\": \"力行楼4408\" }, { \"ClassroomId\": \"05030036\", \"ClassroomName\": \"力行楼4406\" }, { \"ClassroomId\": \"05030037\", \"ClassroomName\": \"力行楼4409\" }, { \"ClassroomId\": \"05030038\", \"ClassroomName\": \"力行楼4404\" }, { \"ClassroomId\": \"05030039\", \"ClassroomName\": \"力行楼4407\" }, { \"ClassroomId\": \"05030040\", \"ClassroomName\": \"力行楼4402\" }, { \"ClassroomId\": \"05030043\", \"ClassroomName\": \"力行楼2406\" }, { \"ClassroomId\": \"05030045\", \"ClassroomName\": \"力行楼2404\" }, { \"ClassroomId\": \"05030046\", \"ClassroomName\": \"力行楼2403\" }, { \"ClassroomId\": \"05030053\", \"ClassroomName\": \"力行楼4502\" }, { \"ClassroomId\": \"05030056\", \"ClassroomName\": \"力行楼2506\" }, { \"ClassroomId\": \"05030057\", \"ClassroomName\": \"力行楼2505\" }, { \"ClassroomId\": \"05030058\", \"ClassroomName\": \"力行楼2504\" }, { \"ClassroomId\": \"05030059\", \"ClassroomName\": \"力行楼2503\" }, { \"ClassroomId\": \"05030067\", \"ClassroomName\": \"力行楼2606\" }, { \"ClassroomId\": \"05030068\", \"ClassroomName\": \"力行楼2605\" }, { \"ClassroomId\": \"05030070\", \"ClassroomName\": \"力行楼2603\" }, { \"ClassroomId\": \"05070003\", \"ClassroomName\": \"文汇楼2栋2109\" }, { \"ClassroomId\": \"05070005\", \"ClassroomName\": \"文汇楼2栋2111\" }, { \"ClassroomId\": \"05070020\", \"ClassroomName\": \"文汇楼2栋2203\" }] } }\n";

    public CourseInfo() {
        try {
            clmJson = new JSONObject(txt);
            allClm = clmJson.getJSONArray("StudentCurriculumDetailInfos");
            int[] jk;
            for (int i = 0; i < allClm.length(); i++) {
                Map<String, String> map = new HashMap<String, String>();
                cntClm = allClm.getJSONObject(i);
                if (cntClm.getString("SemesterId").equals("20161")) {
                    Log.i("本学期课程：", cntClm.getString("TeachClassName"));
                    for (Map<String, String> tmpmap : judgeNum(cntClm)) {
                        map.put("TeachClassName", cntClm.getString("TeachClassName"));
                        map.put("Address", cntClm.getString("Address"));
                        map.put("day",tmpmap.get("day"));
                        map.put("class",tmpmap.get("class"));
                        map.put("clsNum",tmpmap.get("clsNum"));
                        alldata.add(map);
                    }
                }
            }
            System.out.println("success");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public List<Map<String, String>> getAlldata() {
        return alldata;
    }

    public List<Map<String, String>> judgeNum(JSONObject cntClm) throws JSONException {
        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
        Map<String, String> tmpmap = new HashMap<>();
        switch (cntClm.getString("Mon")) {
            case "12":
                tmpmap.put("day", "1");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "1");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "1");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "1");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "1");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
        }
        switch (cntClm.getString("Tue")) {
            case "12":
                tmpmap.put("day", "2");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "2");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "2");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "2");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "2");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
        }
        switch (cntClm.getString("Wed")) {
            case "12":
                tmpmap.put("day", "3");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "3");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "3");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "3");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "3");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
        }
        switch (cntClm.getString("Thu")) {
            case "12":
                tmpmap.put("day", "4");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "4");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "4");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "4");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "4");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case"567":
                tmpmap.put("day", "4");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "3");
                data.add(tmpmap);
        }
        switch (cntClm.getString("Fri")) {
            case "12":
                tmpmap.put("day", "5");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "5");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "5");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "5");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "5");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
        }
        switch (cntClm.getString("Sat")) {
            case "12":
                tmpmap.put("day", "6");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "6");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "6");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "6");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "6");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
        }
        switch (cntClm.getString("Sun")) {
            case "12":
                tmpmap.put("day", "7");
                tmpmap.put("class", "1");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "34":
                tmpmap.put("day", "7");
                tmpmap.put("class", "3");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "56":
                tmpmap.put("day", "7");
                tmpmap.put("class", "5");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "78":
                tmpmap.put("day", "7");
                tmpmap.put("class", "7");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
            case "晚":
                tmpmap.put("day", "7");
                tmpmap.put("class", "9");
                tmpmap.put("clsNum", "2");
                data.add(tmpmap);
                //map.clear();
                break;
        }
        return data;
    }
}


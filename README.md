# DispatchManagement
联表查询，分页，ajax局部刷新

知识点（个人理解，有错误欢迎指点）：
1、面向对象的思想：数据库中可以多个表存不同的信息，但是对应到java中，每个类都是一个完整的整体，
public class Dispatch extends Base{
	private String id;// 发货单id
	private Date dispatchDate;// 发货时间
	private double sum;// 发货单金额
	private Date addtime;// 发货单新增时间
	private Recipients recipients;// 收件人
	private List<DispatchDetailed> dispatchDetailedList;// 发货单明细
	private DispatchDetailed dispatchDetailed;// 用于查询时放查询条件
  ...
  }
2、mapper文件中association对应单个复杂对象，collection对应复杂对象的集合。
3、ajax
   ajax需要jquery.js支持。
   
   srpingmvc中用ajax提交后，controller中如果
   不加@reponsebody,那么它返回的是一个jsp页面。可以单独将刷新的内容放置在一个jsp中替换当前页面一个区域的数据。
想要刷新整页，返回原jsp，替换掉整个body就可以了
   加了@reponsebody，返回的就是一个值。

package seven.savewapper;
//=======================================================
//		          .----.
//		       _.'__    `.
//		   .--(^)(^^)---/!\
//		 .' @          /!!!\
//		 :         ,    !!!!
//		  `-..__.-' _.-\!!!/
//		        `;_:    `"'
//		      .'"""""`.
//		     /,  ya ,\\
//		    //狗神保佑\\
//		    `-._______.-'
//		    ___`. | .'___
//		   (______|______)
//=======================================================

import seven.callBack.DataFilterColumnInterface;
import seven.callBack.DataFilterInterface;
import seven.callBack.DataFilterProcessInterface;

import java.util.Comparator;

/**
 * [Zhihu]https://www.zhihu.com/people/Sweets07
 * [Github]https://github.com/MatrixSeven
 * Created by seven on 2016/11/30.
 */
public interface SaveExcel {

    void Save() throws Exception;
    /**
     * 对要包装的数据进行过滤，对应实体Bean\n
     * 如果返回false将放弃此条数据
     * @param filter {@link DataFilterInterface}
     * @return
     */
    public abstract SaveExcel Filter(DataFilterInterface<?> filter);

    /**
     *此处传入每一行打包好的数据。对应一个实体\n
     * 在process方法里可对属性进行处理加工
     * @param process {@link DataFilterProcessInterface}
     * @return
     */
    public abstract SaveExcel Process(DataFilterProcessInterface<?> process);

    /**
     *	对结果的List进行排序
     * @param c
     * @return
     */
    public abstract SaveExcel Sort(Comparator<? super Object> c);

    /**
     * 此处过滤Excel的列数据（列名）\n
     * 如果加入后，将不对实体进行赋值
     * @param df {@link DataFilterColumnInterface}
     */
    public abstract SaveExcel FilterCol(DataFilterColumnInterface df);


}

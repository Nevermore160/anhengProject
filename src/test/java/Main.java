import com.anheng.dao.DistributionTrendMapper;
import com.anheng.pojo.DisposalSuggestions;
import com.anheng.utils.MybatisUtils;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.ibatis.session.SqlSession;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, BiffException {
        DisposalSuggestions disposalSuggestions = new DisposalSuggestions();
        Workbook workbook = Workbook.getWorkbook(new File("D:\\JAVA\\anhengProject\\src\\main\\resources\\template.xls"));
        Sheet sheet = workbook.getSheet(0);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DistributionTrendMapper mapper = sqlSession.getMapper(DistributionTrendMapper.class);

        for (int i = 0; i < sheet.getRows(); i++) {
            disposalSuggestions.setId(i + 1);
            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j, i);
                switch (j) {
                    case 0:
                        disposalSuggestions.setSubCategory(cell.getContents());
                        break;
                    case 1:
                        disposalSuggestions.setAlarmDescription(cell.getContents());
                        break;
                    case 2:
                        disposalSuggestions.setSuggestion(cell.getContents());
                }
            }
            //System.out.println(disposalSuggestions.getId());
            mapper.addDisposalSuggestions(disposalSuggestions);
        }
        sqlSession.close();
        workbook.close();
    }
}

package utils;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import testdata.Testdata;

import java.lang.reflect.Method;

public class DataproviderUtils {
    @DataSupplier(runInParallel = true)
    public StreamEx<Testdata> getdata(Method method){
        return TestDataReader.use(XlsxReader.class).withTarget(Testdata.class).withSource("TestData.xlsx")
                .read().filter(testdata -> testdata.testcasename.equalsIgnoreCase(method.getName()));
    }
}

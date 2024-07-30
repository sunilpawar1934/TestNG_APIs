package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "Data")
	public String[][] getAllData() throws IOException {
		String path = System.getProperty("user.dir") + "//testDataSheet//UserData.xlsx";
		XLUtility xl = new XLUtility(path);

		int rownum = xl.getRowCount("User");
		int colcount = xl.getCellCount("User", 1);

		String apidata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				apidata[i - 1][j] = xl.getCellData("User", i, j);
			}
		}
		return apidata;

	}

	@DataProvider(name = "UserName")
	public String[] getUserNames() throws IOException {
		String path = System.getProperty("user.dir") + "//testDataSheet//UserData.xlsx";
		XLUtility xl = new XLUtility(path);
		int rownum = xl.getRowCount("User");

		String apidata[] = new String[rownum];

		for (int i = 1; i <= rownum; i++) {
			apidata[i - 1] = xl.getCellData("User", i, 1);
		}
		return apidata;

	}

}

import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
	import net.sf.dynamicreports.report.builder.DynamicReports;
	import net.sf.dynamicreports.report.builder.column.Columns;
	import net.sf.dynamicreports.report.builder.component.Components;
	import net.sf.dynamicreports.report.builder.datatype.DataTypes;
	import net.sf.dynamicreports.report.constant.HorizontalAlignment;
	import net.sf.dynamicreports.report.exception.DRException;
	
	public class GenerateReport {

	


	  public void generateReort(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
	                    "jdbc:mysql://hostname:port/dbname","username", "password");
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

		JasperReportBuilder report = DynamicReports.report();//a new report
		report
		  .columns(
		      Columns.column("Employee Id", "employeeid", DataTypes.integerType()),
		      Columns.column("Start Time", "starttime", DataTypes.dateType()),
		      Columns.column("Stop Time", "stoptime", DataTypes.dateType()),
		      Columns.column("Actual Time", "actualtime", DataTypes.dateType()))
		      Columns.column("Actual Time Spent", "actualtimespent", DataTypes.dateType()),
		      Columns.column("EstimatedTime", "estimatedtimespent", DataTypes.dateType()))
		  .title(//title of the report
		      Components.text("SimpleReportExample")
			  .setHorizontalAlignment(HorizontalAlignment.CENTER))
			  .pageFooter(Components.pageXofY())//show page number on the page footer
			  .setDataSource("SELECT employeeid, starttime, stoptime, actualtime,actualtimespent,estimatedtimespent 
	                                  connection);

		try {
	                //show the report
			report.show();

	                //export the report to a pdf file
			report.toPdf(new FileOutputStream("c:/report.pdf"));
		} catch (DRException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  }
	}

}

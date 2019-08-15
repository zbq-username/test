package com.xasxt.app.utils;
import org.junit.Test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CreateAutoProject {
	@Test
	public void testAutoEnvironmental(){
		//全局配置
		GlobalConfig gg = new GlobalConfig();
		gg.setActiveRecord(true)
		.setAuthor("xasxt")
		.setOutputDir("F:\\workspace\\springBootDemo2\\src\\main\\java")
		.setFileOverride(true)
		.setIdType(IdType.UUID)
		.setServiceName("%sService")
		.setBaseResultMap(true)
		.setBaseColumnList(true)
		.setSwagger2(true);

		//数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl("jdbc:mysql://localhost:3306/test");
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("root");
		dsc.setDbType(DbType.MYSQL);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setCapitalMode(true).
		setNaming(NamingStrategy.underline_to_camel);
		//包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.xasxt.app")
		.setMapper("dao")
		.setService("service")
		.setController("web")
		.setEntity("bean")
		.setXml("mapper");
		//生成器配置
		AutoGenerator  autoGenerator=new AutoGenerator();
		autoGenerator.setGlobalConfig(gg).setDataSource(dsc)
		.setStrategy(strategy).setPackageInfo(pc).execute();

	}


}

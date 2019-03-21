package cn.tianyu.springJdbcTransaction;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public abstract class JdbcDaoSupport extends DaoSupport {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setDataSource(DataSource dataSource){
		//判断jdbcTemplate是否为null
		if(jdbcTemplate == null){
			createJdbcTemplate(dataSource);
		}
	}

	private void createJdbcTemplate(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


    @Override
    protected void checkDaoConfig() throws IllegalArgumentException {

    }
}
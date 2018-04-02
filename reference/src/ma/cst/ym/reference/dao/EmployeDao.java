package ma.cst.ym.reference.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeDao {
	private NamedParameterJdbcTemplate jdbc;

	public EmployeDao() {
		System.out.println("successfully loaded EmployeDao ");
	}

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Employe> getEmployes() {

		MapSqlParameterSource params = new MapSqlParameterSource();

		return jdbc.query("select * from employe", params, new RowMapper<Employe>() {

			public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employe employe = new Employe();
				employe.setId(rs.getInt("id"));
				employe.setNom(rs.getString("nom"));
				employe.setPrenom(rs.getString("prenom"));
				employe.setNationalite(rs.getString("nationalite"));
				employe.setPoste(rs.getString("poste"));
				employe.setAddresse(rs.getString("addresse"));
				employe.setZoneActivite(rs.getString("zoneActivite"));
				employe.setTelephone(rs.getString("telephone"));

				return employe;

			}

		});
	}

	public boolean create(Employe employe) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(employe);
		return jdbc.update(
				"insert  into employe (nom ,prenom, nationalite, poste, addresse, zoneActivite, telephone) values(:nom, :prenom , :nationalite, :poste, :addresse, :zoneActivite, :telephone)",
				params) == 1;

	}

	public boolean updateEmploye(Employe employe) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(employe);
		return jdbc.update(
				"update employe set nom=:nom, prenom=:prenom, nationalite=:nationalite, poste=:poste, addresse=:addresse, zoneActivite=:zoneActivite, telephone=:telephone where id=:id",
				params) == 1;

	}

	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		return jdbc.update("delete from employe where id= :id", params) == 1;
	}

	public Employe getEmploye(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.queryForObject("select * from employe where id= :id", params, new RowMapper<Employe>() {

			public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employe employe = new Employe();
				employe.setId(rs.getInt("id"));
				employe.setNom(rs.getString("nom"));
				employe.setPrenom(rs.getString("prenom"));
				employe.setNationalite("nationalite");
				employe.setPoste("poste");
				employe.setAddresse("addresse");
				employe.setZoneActivite("zoneActivite");
				employe.setTelephone("telephone");

				return employe;

			}

		});
	}

}

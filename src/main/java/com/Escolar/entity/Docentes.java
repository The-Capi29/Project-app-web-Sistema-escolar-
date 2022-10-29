package com.Escolar.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_docente")
public class Docentes {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="idDocente")
		private Integer cod_docente;
		@Column(name="doc_docIdentidad")
		private String documento;
		@Column(name="doc_nombre")
		private String nombre;
		@Column(name="doc_ape")
		private String apellido;
		@Column(name="doc_fechaNacimiento")
		private Date fechaNacimiento;
		
		@OneToMany
		@JoinColumn(name="idGenero")
		private Genero genero;
		@Column(name="doc_gradoEstudio")
		private String grado;
		@Column(name="doc_ciudad")
		private String ciudad;
		@Column(name="doc_direccion")
		private String direccion;
		@Column(name="doc_email")
		private String email;
		@Column(name="doc_numeroTelefono")
		private String celular;
		
		public Integer getCod_docente() {
			return cod_docente;
		}
		public void setCod_docente(Integer cod_docente) {
			this.cod_docente = cod_docente;
		}
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public Genero getGenero() {
			return genero;
		}
		public void setGenero(Genero genero) {
			this.genero = genero;
		}
		public String getGrado() {
			return grado;
		}
		public void setGrado(String grado) {
			this.grado = grado;
		}
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCelular() {
			return celular;
		}
		public void setCelular(String celular) {
			this.celular = celular;
		}
		
		
		
		
		
		
}

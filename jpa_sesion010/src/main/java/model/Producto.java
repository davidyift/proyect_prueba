package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_productos database table.
 * 
 */
@Entity
@Table(name="tb_productos")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_prod")
	private String idProd;

	@Column(name="des_prod")
	private String desProd;

	@Column(name="est_prod")
	private byte estProd;

	private int idcategoria;

	private int idproveedor;

	@Column(name="pre_prod")
	private BigDecimal preProd;

	@Column(name="stk_prod")
	private int stkProd;

	public Producto() {
	}

	public String getIdProd() {
		return this.idProd;
	}

	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}

	public String getDesProd() {
		return this.desProd;
	}

	public void setDesProd(String desProd) {
		this.desProd = desProd;
	}

	public byte getEstProd() {
		return this.estProd;
	}

	public void setEstProd(byte estProd) {
		this.estProd = estProd;
	}

	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public int getIdproveedor() {
		return this.idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public BigDecimal getPreProd() {
		return this.preProd;
	}

	public void setPreProd(BigDecimal preProd) {
		this.preProd = preProd;
	}

	public int getStkProd() {
		return this.stkProd;
	}

	public void setStkProd(int stkProd) {
		this.stkProd = stkProd;
	}

}
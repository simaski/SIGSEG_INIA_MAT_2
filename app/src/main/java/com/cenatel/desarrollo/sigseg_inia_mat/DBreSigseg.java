package com.cenatel.desarrollo.sigseg_inia_mat;

/**
 * Created by root on 06/07/15.
 */
public class DBreSigseg {
    public static final String TABLE_NAME = "Tabla_CenatelSigseg";
    public static final String FIELD_ID = "id";
    public static final String FIELD_FuncionarioNombre = "funcionario_nombre";
    public static final String FIELD_FechaCaptura = "fecha_captura";
    public static final String FIELD_UbicacionOficina = "ubicacion_oficina";
    public static final String FIELD_ProductorNombre = "productor_nombre";
    public static final String FIELD_NombreFinca = "nombreFinca";
    public static final String FIELD_TipoCultivo = "TipoCultivo";
    public static final String FIELD_FechaSiembra = "fecha_siembra";
    public static final String FIELD_Variedad = "variedad";
    public static final String FIELD_EtapaFenologica = "etapa_fenologica";
    public static final String FIELD_Condicion = "condicion";
    public static final String FIELD_NumeroLote = "numero_lote";
    public static final String FIELD_NombrePunto = "nombrePunto";
    public static final String FIELD_Longitud = "longitud";
    public static final String FIELD_Latitud = "latitud";
    public static final String FIELD_Observacion = "observacion";
    public static final String CREATE_DB_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " +
	               FIELD_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
	               FIELD_FuncionarioNombre + " TEXT NULL, " +
	               FIELD_FechaCaptura + " TEXT, " +
	               FIELD_UbicacionOficina + " TEXT NULL, " +
	               FIELD_ProductorNombre + " TEXT NULL, " +
	               FIELD_NombreFinca + " TEXT NULL, " +
	               FIELD_TipoCultivo + " TEXT NULL, " +
	               FIELD_FechaSiembra + " TEXT NULL, " +
	               FIELD_Variedad + " TEXT NULL, " +
	               FIELD_EtapaFenologica + " TEXT NULL, " +
	               FIELD_Condicion + " TEXT NULL, " +
	               FIELD_NumeroLote + " TEXT NULL, " +
	               FIELD_NombrePunto + " TEXT NULL, " +
	               FIELD_Longitud + " TEXT NULL, " +
	               FIELD_Latitud + " TEXT NULL, " +
	               FIELD_Observacion + " TEXT NULL " + " )";

    private int id;
    private String FuncionarioNombre;
    private String FechaCaptura;
    private String UbicacionOficina;
    private String ProductorNombre;
    private String NombreFinca;
    private String TipoCultivo;
    private String FechaSiembra;
    private String Variedad;
    private String EtapaFenologica;
    private String Condicion;
    private String NumeroLote;
    private String NombrePunto;
    private String Longitud;
    private String Latitud;
    private String Observacion;

    public DBreSigseg(String funcionarioNombre, String fechaCaptura, String ubicacionOficina, String productorNombre, String nombreFinca,
                      String tipoCultivo, String fechaSiembra, String variedad, String etapaFenologica, String condicion, String numeroLote,
                      String nombrePunto, String longitud, String latitud, String observacion) {
        FuncionarioNombre = funcionarioNombre;
        FechaCaptura = fechaCaptura;
        UbicacionOficina = ubicacionOficina;
        ProductorNombre = productorNombre;
        NombreFinca = nombreFinca;
        TipoCultivo = tipoCultivo;
        FechaSiembra = fechaSiembra;
        Variedad = variedad;
        EtapaFenologica = etapaFenologica;
        Condicion = condicion;
        NumeroLote = numeroLote;
        NombrePunto = nombrePunto;
        Longitud = longitud;
        Latitud = latitud;
        Observacion = observacion;
    }

    public DBreSigseg() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncionarioNombre() {
        return FuncionarioNombre;
    }

    public void setFuncionarioNombre(String funcionarioNombre) {
        FuncionarioNombre = funcionarioNombre;
    }

    public String getFechaCaptura() {
        return FechaCaptura;
    }

    public void setFechaCaptura(String fechaCaptura) {
        FechaCaptura = fechaCaptura;
    }

    public String getUbicacionOficina() {
        return UbicacionOficina;
    }

    public void setUbicacionOficina(String ubicacionOficina) {
        UbicacionOficina = ubicacionOficina;
    }

    public String getProductorNombre() {
        return ProductorNombre;
    }

    public void setProductorNombre(String productorNombre) {
        ProductorNombre = productorNombre;
    }

    public String getNombreFinca() {
        return NombreFinca;
    }

    public void setNombreFinca(String nombreFinca) {
        NombreFinca = nombreFinca;
    }

    public String getTipoCultivo() {
        return TipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        TipoCultivo = tipoCultivo;
    }

    public String getFechaSiembra() {
        return FechaSiembra;
    }

    public void setFechaSiembra(String fechaSiembra) {
        FechaSiembra = fechaSiembra;
    }

    public String getVariedad() {
        return Variedad;
    }

    public void setVariedad(String variedad) {
        Variedad = variedad;
    }

    public String getEtapaFenologica() {
        return EtapaFenologica;
    }

    public void setEtapaFenologica(String etapaFenologica) {
        EtapaFenologica = etapaFenologica;
    }

    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String condicion) {
        Condicion = condicion;
    }

    public String getNumeroLote() {
        return NumeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        NumeroLote = numeroLote;
    }

    public String getNombrePunto() {
        return NombrePunto;
    }

    public void setNombrePunto(String nombrePunto) {
        NombrePunto = nombrePunto;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String latitud) {
        Latitud = latitud;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String observacion) {
        Observacion = observacion;
    }
}

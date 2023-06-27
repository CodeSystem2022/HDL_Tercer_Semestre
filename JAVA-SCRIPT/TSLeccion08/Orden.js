class Orden extends Producto{

    static contadorProductosAgregados = 0;

    constructor(nombre, precio){
        super(nombre, apellido, edad);
        this._idOrden = ++Orden.contadorProductosAgregados;
        this._fecharegistro = fecharegistro;
    }

    get idCliente(){
        return this._idCliente;
    }

    get fecharegistro(){
        return this._fecharegistro;
    }

    set fecharegistro(fecharegistro){
        this._fecharegistro = fecharegistro;
    }

    toString(){
        return `
        ${super.toString()} 
        ${this._idCliente} 
        ${this._fecharegistro}`;
    }
}
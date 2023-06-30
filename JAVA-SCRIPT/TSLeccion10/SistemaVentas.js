class Producto {
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;

    }
    get idProducto() {
        return this._idProducto;
    }
    

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;

    }
    get precio(){
        return this._precio;
    }


    set precio(precio) {
        this._precio = precio;

    }

    toString() {
        return "ID N° : " + this.idProducto + ", NOMBRE: "+ this.nombre + ", PRECIO: $ "+this.precio;
    }
} // Clase Producto

class Orden{
    static contandorOrdenes = 0;
    static contadorProductosAgregados = 0;
    static getMAX_PRODUCTOS(){
        return 5;
    }
    constructor(){
        this._idOrden = ++Orden.contandorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;

    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto); // Sintaxis 1
            //this._productos[this.contadorProductosAgregados++] = producto; // Sintaxis 2
        }
        else{
            console.log('No se pueden agregar mas productos.');

        }
    } // Metodo agregarProducto

        
    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio;
        }
        return totalVenta;
    }// Metodo calcularTotal

    mostrarOrden(){
        let productoOrden = "";
        for(let producto of this._productos){
            productoOrden += '\n{'+producto.toString()+"}";
        }
        console.log(`Orden: ${this._idOrden}, Total: ${this.calcularTotal()}, Productos: ${productoOrden}`);
    }// Metodo mostrar Orden
} // clase Orden

// Productos
let producto1 = new Producto('Pantalon', 200);
let producto2 = new Producto('Buzo', 600);
let producto3 = new Producto('Campera', 460);
let producto4 = new Producto('Zapatilla', 1250);
let producto5 = new Producto('Camisa', 300);

// Orden
let orden1 = new Orden();
let orden2 = new Orden();
// Prueba
// Orden 1 
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.mostrarOrden();
// Orden 2
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto4);
orden2.agregarProducto(producto5);
orden2.agregarProducto(producto4);
orden2.mostrarOrden();
package automatizacion;

public class Motor {
        private String nombre;
        private double potencia;
        private int velocidad;
        private boolean encendido;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            if (nombre != null && !nombre.trim().isEmpty()) {
                this.nombre = nombre;
            }
        }

        public double getPotencia() {
            return potencia;
        }

        public void setPotencia(double potencia) {
            if (potencia >= 0) {
                this.potencia = potencia;
            }
        }

        public int getVelocidad() {
            return velocidad;
        }

        public void setVelocidad(int velocidad) {
            if (velocidad >= 0 && velocidad <= 100) {
                this.velocidad = velocidad;
            }
        }

        public boolean isEncendido() {
            return encendido;
        }

        public void setEncendido(boolean encendido) {
            this.encendido = encendido;
        }

        public void encender() {
            this.encendido = true;
        }

        public void apagar() {
            this.encendido = false;
            this.velocidad = 0;
        }
    }

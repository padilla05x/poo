package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Veterinariaaa {
    private List<Mascota> mascotas;
    

    public Veterinariaaa() {
        mascotas = new ArrayList<>();
    }

// Añadir mascota a la lista
    public void agregarMascota(Mascota mascota) {
        if (mascota == null) {
            throw new NullPointerException("La mascota no puede ser nula");
        }
        mascotas.add(mascota);
    }


// Lista de mascotas mayores a diez años
    public List<Mascota> MascotasMayoresDiezAños() {
        List<Mascota> mayores = new ArrayList<>();
        for (Mascota mascota: mascotas) {
            if (mascota.getEdad() > 10) {
                mayores.add(mascota);
            }
        }
        return mayores;
    }


// Agregar mascota con ID unico
    public void agregarMascotaUnica(Mascota mascota) throws MascotaExistente {
        for (Mascota m : mascotas) {
            if (m.getid() == mascota.getid()) {
                throw new MascotaExistente("La mascota con el ID " + mascota.getid() + " ya existe en la lista.");
            }
        }
        mascotas.add(mascota);
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

}

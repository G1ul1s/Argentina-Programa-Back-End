package com.finalentrega.portfoliofinal.interfa;

import com.finalentrega.portfoliofinal.entidad.HyS;
import java.util.List;

public interface IHyS {
    
   public List<HyS> verHyS ();
    public HyS crearHyS (HyS hys);
    public void borrarHyS (HyS id);
    public HyS buscarHyS (Long id);  
    public void editarHyS (HyS hys);

}
